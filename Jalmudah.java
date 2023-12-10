/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lenobas22;
import java.util.ArrayList;
import java.util.List;

public class Jalmudah extends  Neighborhoods{


  
    public Jalmudah(){
    
    ActivityJ("Rc Beach Camp1", 100, "open from 10Am -midnight", "jalmudah", "A camp with beach view, suitable for small parties (camp A : 750 SAR) (Camp B: 150 SAR)", "all age groups" ,4.10);
    ActivityJ("Jalmudah Park", 100, "24 hour", "jalmudah", "it is a park where the whole family can have a nice time freely, with play area, a water pool, and a small shop selling","all age groups" ,4.4);
    ActivityJ("Taiba Beach", 100,"24 hour" , "jalmudah", "place that you can enjoy with your family and frinds with a  lot of features like walking and running","all age groups", 4.5);
    
    defaultSearchesJ = new ArrayList<>();
    defaultRatesJ = new ArrayList<>();
    ServiceJ("**\nHotels:\nHolidayIn ", 4.8);
    ServiceJ("Park Inn by Radisson ", 4.3);
    ServiceJ("**\nHospitals:\nRC ", 3.5 );
    ServiceJ("**\nPharmacys:\nAldawaa", 3.8);
    ServiceJ("Alnahdi ", 4.2);
    ServiceJ("**\nRestaurants:\nDouble i Burger ", 4.8 );
    ServiceJ("Holycow Burgers", 4.2);
    ServiceJ("Hashi Basha ", 3.7);
    ServiceJ("Gourmandiz Burger ", 4.0);
    ServiceJ("3eggs ", 4.0);
    ServiceJ("**\nCafes:\nLatteWorks", 4.2);
    ServiceJ("Shot ", 4.1);
    ServiceJ("19Th ",4.3);
    ServiceJ("**\nSuperMarkets:\nFarm ",3.7);
    ServiceJ("Banda ",4.0 );
    ServiceJ("**\nSports clup:\nFittness Time Gym ",4.0 );
    ServiceJ("Fittness Time Gym Ladies ",4.3 );
    ServiceJ("**\nCenters:\nTaibah Center ", 4.1);
    ServiceJ("**\nEducation:\n Alwaha Elementary school  ", 5.0 ); 
    ServiceJ("Jalmudah Elementary School ",3.7 );
    ServiceJ("10Th Middle School ",4.6 );
    

    
}


}