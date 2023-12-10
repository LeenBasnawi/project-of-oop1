/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lenobas22;

import java.util.ArrayList;
import java.util.List;

public class Services {
    public List<String> defaultSearches;
    public List<Double> defaultRates;

    public Services() {
        defaultSearches = new ArrayList<>();
        defaultRates = new ArrayList<>();
//add default services
        addService("**\nHotels:\nHolidayIn ", 4.8);
        addService("Boudl ", 4.1);
        addService("Karan ", 4.1);
        addService("Park Inn by Radisson ", 4.3);
        addService("**\nCompounds:\nWareef ", 3.5);
        addService("Alfarooq ", 3.8);
        addService("SCIEZ 52 Amaer Unit, Alzakari Group ", 3.0 );
        addService("INDEX ",3.9);
        addService("**\nHospitals:\nRoyal Commission ",3.1 );
        addService("Mouwasat ", 2.8);//deffi
        addService("Al-mana ", 3.1 );//deff
        addService("RC ", 3.5 );//j
        addService("Al-lulu  ", 3.0);
        addService("**\nPharmacys:\nAldawaa", 3.8);
        addService("Alnahdi ", 4.2);
        addService("Al-muwasat ", 3.1);
        addService("Zahrat Alrawdah ", 3.8);
        addService("Al-lulu  ", 3.0);
        addService("Nabaa ", 4.0);
        addService("Boots ", 3.2);
        addService("**\nRestaurants:\nDouble i Burger ", 4.8);
        addService("We Burger ", 4.0);
        addService("Holycow Burgers", 4.2);
        addService("Hashi Basha ", 3.7);
        addService("3eggs ", 4.0);
        addService("Gourmandiz Burger ", 4.0);
        addService("Stake House ", 4.1);
        addService("ShrimpNation ", 4.0);
        addService("Muqsaf Dareen", 4.1);
        addService("**\nCafes:\nZoya  ", 4.1);
        addService("LatteWorks", 4.2);
        addService("Valley ", 4.4);
        addService("Colleste Corner ", 4.5);
        addService("Shot ", 4.1);
        addService("19Th ",4.3);
        addService("Candle ", 4.2);
        addService("Crafter ", 4.4);
        addService("Polka ", 4.5);
        addService("Ratio ", 4.1);
        addService("Methods ", 4.1);
        addService("Tai Tea House", 4.0);
        addService("Guarantee tea", 4.3);
        addService("**\nCenters:\nThe Move  ",4.5 );
        addService("Galleria mall ",4.2 );
        addService("Deffi Center ", 3.9);
        addService("Banana Beach ", 3.8);
        addService("Taibah Center ", 4.1);
        addService("Almaseef Commercial Center ", 4.0);
        addService("Taibah Center ", 4.1);
        addService("**\nSuperMarkets:\nAswaq Alothaim  ",4.0 );
        addService("Al-ghethaa Al-Daeem  ", 3.5);
        addService("Al-Tamimi ", 4.2);
        addService("Bandah ", 4.0);
        addService("Aswaq Al-Badr ", 4.6);
        addService("Taibah  ", 3.8);
        addService(" Danoub", 4.1);
        addService("Farm ", 3.7);
        addService("**\nSports clup:\nFittness Time Gym ",4.0 );
        addService("Fittness Time Gym Ladies ",4.3 );
        addService("Snap Fittness ", 4.0);
        addService("Alhowailat Gym ", 3.8);
        addService("Hadeed Recreation Gym Centre ", 4.1 );
        addService("PaintBall Centre ", 4.4);
        addService("**\nSports clup:\nFittness Time Gym ",4.0 );
        addService("**\nEducation:\nSchools:\nJalmudah Elementary School ",3.7 );
        addService("Najd Secondary School ",4.1);
        addService("10Th Middle School ", 5.0 );
        addService("Alwaha Elementary school ",4.6 );
        addService("14Th Elementary School ",3.5);
        addService("Colleges:\nJubail Industrial College" ,4.1 );
        addService("Jubail University College ",4.0);
        addService("Saudi Electronic University, Jubail Branch "  ,4.0);
        addService("King Fahd Navalآ College "  ,4.4);

    }

    // Method to add a service
    public void addService(String search, double rate) {
        defaultSearches.add(search);
        defaultRates.add(rate);
    }

    // Method to view services
    public void viewServices() {
        System.out.println("Printing Services Data");
        for (int i = 0; i < defaultSearches.size(); i++) {
            System.out.println(defaultSearches.get(i) + " || " + defaultRates.get(i));
        }
    }

    public void searchService(String serviceName) {
        boolean found = false;
        for (int i = 0; i < defaultSearches.size(); i++) {
            if (defaultSearches.get(i).equalsIgnoreCase(serviceName)) {
                System.out.println("Service found:");
                System.out.println(defaultSearches.get(i) + " || " + defaultRates.get(i));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Service not found.");
        }
    }