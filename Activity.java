/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lenobas22;

import java.util.ArrayList;
import java.util.List;

public class Activity  {
    private List<String> names;
    private List<Integer> numOfPeople;
    private List<String> times;
    private List<String> locations;
    private List<String> information;
    private List<String> ages;
    private List<Double> rates;

    // Constructor initializing ArrayLists
    public Activity() {
        names = new ArrayList<>();
        numOfPeople = new ArrayList<>();
        times = new ArrayList<>();
        locations = new ArrayList<>();
        information = new ArrayList<>();
        ages = new ArrayList<>();
        rates = new ArrayList<>();

        // Adding initial default data
        addActivity("Rc Beach Camp1", 100, "open from 10Am -midnight", "jalmudah", "A camp with beach view, suitable for small parties (camp A : 750 SAR) (Camp B: 150 SAR)", "all age groups" ,4.10);
        addActivity("Jalmudah Park", 100, "24 hour", "jalmudah", "it is a park where the whole family can have a nice time freely, with play area, a water pool, and a small shop selling","all age groups" ,4.4);
        addActivity("Taiba Beach", 100,"24 hour" , "jalmudah", "place that you can enjoy with your family and frinds with a  lot of features like walking and running","all age groups", 4.5);
        addActivity("Renting boats", 100,"24 hour" , "Fanateer", "Before going, you must know that the policies are\n" +
"1- Full payment will be made in advance.\n" +
"2- There is no cancellation or refund.\n" +
"3- The appointment must be reached.You can visit ootlah website or go to their place in Al-Fanateer beach","all age groups", 5.0);
        addActivity("deffi park", 100, "24 hour", "deffi", " you can enjoy with your family with a lot of features: BBQ place, walking and running paths , and more", "all age groups" ,4.5);
        addActivity("water parks", 100, "5:00pm-12:00am", "banana Beach-fanateer", "a seasonal event in the summer only. It consists of water games for children so that they can have fun in the water and be happy together. Entry is 50 riyals,", "12 years and under" ,4.0);
        addActivity("corniche Fanateer", 1000, "24 hour", "Fanateer", "you can enjoy walking and do a lot of  things like fishing and you can book boat by hours ", "all age groups" ,4.5);
        addActivity("", 100, "open from 10Am -midnight", "jalmudah", "A camp with beach view, suitable for small parties (camp A : 750 SAR) (Camp B: 150 SAR)", "all age groups" ,4.10);
        addActivity("Sparky's game park", 100, "4:00pm-11:00Pm", "Fanateer", "Sparky's is considered one of the most important amusement parks that adults and children go to because of the various means of entertainment it provides, including electric games, a skating rink, a video game hall", "for kids and family" ,3.3);
       // Add more default activities as needed... 
    }

    // Method to add an activity data
    public void addActivity(String name, int numOfPeople, String time, String location, String information, String age , double rate){
        names.add(name);
        this.numOfPeople.add(numOfPeople);
        times.add(time);
        locations.add(location);
        this.information.add(information);
        ages.add(age);
        rates.add(rate);
        this.rates.add(rate);
    }

    // Method to view activities
    public void viewActivities() {
        System.out.println("Printing All Activities");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " | " + ages.get(i) + " | " + locations.get(i) + " | " + information.get(i) + " | " + times.get(i) + " | " + numOfPeople.get(i));
        }
    }

}