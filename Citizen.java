/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lenobas22;

import java.io.*;
import java.util.Scanner;

public class Citizen {
    private String firstName;
    private String lastName;
    private int age;
    private String emailAddress;
    private String password;
    private String phoneNumber;
    private String gender;
    private String socialStatus;
    private String ageGroup;


    // Getters and setters for each attribute
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSocialStatus() {
        return socialStatus;
    }

    public void setSocialStatus(String socialStatus) {
        this.socialStatus = socialStatus;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    // Other methods as described
    public String toString() {
        return "Citizen{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", socialStatus='" + socialStatus + '\'' +
                ", ageGroup='" + ageGroup + '\'' +
                '}';
    }

    public static boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Email : ");
        String userEmail = scanner.nextLine();

        System.out.println("Enter Your Password");
        String userPassword = scanner.nextLine();

        boolean isLoggedIn = checkLogin(userEmail, userPassword);
        if (isLoggedIn) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid email or password. Login failed.");
            return false;
        }
    }

    public void signUp() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter email:");
        String email = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        System.out.println("Enter phone number:");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter gender (Male/Female):");
        String gender = scanner.nextLine();

        System.out.println("Are you married? (Yes/No):");
        String isMarried = scanner.nextLine();

        System.out.println("Enter age group (Teenager/Adult):");
        String ageGroup = scanner.nextLine();

        String data = firstName+","+lastName+","+Integer.toString(age)+","+email+","+password+","+phoneNumber+","+gender+","+isMarried+","+ageGroup;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("loginData.csv", true))) {
            writer.write(data + "\n");
            System.out.println("Congratulations Your Account Have Been Created\nPlease Login To Your Account Using Your Email/Password");
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public void updatePassword() {
        // Logic to update password
    }

    


    public static boolean checkLogin(String userEmail, String userPassword) {
        boolean loginSuccessful = false;
        String loginDataFile = "loginData.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(loginDataFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] userData = line.split(",");
                if (userData.length > 4) { // Assuming all lines have 9 elements
                    String email = userData[3];
                    String password = userData[4];
                  

                    if (email.equals(userEmail) && password.equals(userPassword)) {
                        loginSuccessful = true;
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return loginSuccessful;
    }
}