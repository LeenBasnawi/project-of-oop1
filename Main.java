/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lenobas22;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    static Services servicesObject = new Services();
    static Activity activityObject = new Activity();
    static Jalmudah jalmudahAct = new Jalmudah();
    static Fanateer FanateerAct= new Fanateer();
    static Deffi DeffiAct = new Deffi();
   static Jalmudah jalmudahS = new Jalmudah();
    static Fanateer Fanateers= new Fanateer();
    static Deffi Deffis= new Deffi();
  
    

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Citizen User= new Citizen();

        String option;
        boolean flag = true;
        boolean flagForLogin=false;
        do{
            System.out.println("1. Login");
            System.out.println("2. SingUp");
            System.out.println("3. Exit");
            System.out.print("Choose an option : ");
            option = scanner.nextLine();
            switch (option){
                case "1":
                    flagForLogin = User.login();
                    if(flagForLogin){
                        mainMenu();
                    }
                    break;
                case "2":
                    User.signUp();
                    break;
                case "3":
                    flag=false;
                    exit(1);
                default:
                    System.out.println("Invalid Input");
            }
        }while( flag);


        scanner.close();

    }

    public static void mainMenu(){
      boolean flag = true;
      do{
          Scanner newInput = new Scanner(System.in);
          System.out.println("Choose an option:");
          System.out.println("1. Neighborhoods");
          System.out.println("2. Activity");
          System.out.println("3. Services");
          System.out.println("4. Logout");
          int choice = newInput.nextInt();
         
          switch (choice) {
              case 1:
                  System.out.println("1-Jalmudah || 2-Fanateer  ||  3-Deffi ");
                  break;
              case 2:
                  // Logic for activity
                  Scanner user = new Scanner(System.in);
                  System.out.println("1. Add Activity");
                  System.out.println("2. Show Activities");
                  String userInputChoice = user.nextLine();
                  switch (userInputChoice){
                      case "1":
                          Scanner scanner = new Scanner(System.in);

                          System.out.print("Enter activity name: ");
                          String name = scanner.nextLine();

                          System.out.print("Enter number of people: ");
                          int numPeople = scanner.nextInt();

                          System.out.print("Enter time: ");
                          String time = scanner.nextLine();

                          scanner.nextLine(); // Consume the newline character

                          System.out.print("Enter location: ");
                          String location = scanner.nextLine();

                          System.out.print("Enter information: ");
                          String info = scanner.nextLine();

                          System.out.print("Enter age: ");
                          String age = scanner.nextLine();
                          
                          System.out.print("Enter Rate : ");
                          double Rate = scanner.nextDouble();
                          
                          activityObject.addActivity( name, numPeople, time, location, info, age ,Rate);
                          break;
                       
                      case "2":
                          Scanner Ch = new Scanner(System.in);
                  System.out.println("1.Jalmudah\n2-Fanateer\n3-Deffi\n4-All");
                  
                  String choice2 = user.nextLine();
                      switch (choice2){
                      case "1":
                          jalmudahAct.ActivityJ();
                          break;
                      case "2":
                          FanateerAct.ActivityF();
                          
                          break;
                       case "3":
                          DeffiAct.ActivityD();
                                 
                          break;
                       
                      case "4":
                          activityObject.viewActivities();
                          break;
                       
   
                      default:
                          System.out.println("Invalid Input");
                          break;
                  }
                         
                      default:
                          System.out.println("Invalid Input");
                  }
          

                  break;
              case 3:
                  Scanner userInput = new Scanner(System.in);
                  System.out.println("1. View Services");
                  System.out.println("2. Search Service");
                  System.out.println("Enter Your Choice : ");
                  String option = userInput.nextLine();
                  switch (option){
                      case "1":
                          Scanner Ch = new Scanner(System.in);
                          System.out.println("Choose a neighboor:\n1-Jalmudah\n2-Fanateer\n3-Deffi\n4-All");
                          String choice3 = Ch.nextLine();
                          switch(choice3){
                              case "1":
                                  jalmudahS.viewServicesJ();
                                  break;
                              case "2":
                                  Fanateers.viewServicesF();
                                  break;
                              case "3":
                                  Deffis.viewServicesD();
                                  break;
                              case "4":
                                  servicesObject.viewServices();
                                  break;
                              default:
                                  System.out.println("Error");
                                  break;
                          
                          }
                          break;
                          
                      case "2":
                          System.out.println("Enter the service Name ");
                          String searchData = userInput.nextLine();
                          servicesObject.searchService(searchData);
                          break;
                      default:
                          System.out.println("Invalid Input");
                          
                  
                  }break;
        
              case 5:
                 flag=false;
                 break;
              default:
                  System.out.println("Invalid choice");
          }
      }while(flag);
}