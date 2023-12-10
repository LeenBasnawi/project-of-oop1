/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lenobas22;

import java.util.ArrayList;
import java.util.List;
public class Fanateer extends  Neighborhoods{
    
   
    public Fanateer(){
    //Fanateer Act
    ActivityF("Renting boats", 100,"24 hour" , "Fanateer", "Before going, you must know that the policies are\n" +
"1- Full payment will be made in advance.\n" +
"2- There is no cancellation or refund.\n" +
"3- The appointment must be reached.You can visit ootlah website or go to their place in Al-Fanateer beach","all age groups", 5.0);
    ActivityF("corniche Fanateer", 1000, "24 hour", "Fanateer", "you can enjoy walking and do a lot of  things like fishing and you can book boat by hours ", "all age groups" ,4.5);
    ActivityF("water parks", 100, "5:00pm-12:00am", "banana Beach-fanateer", "a seasonal event in the summer only. It consists of water games for children so that they can have fun in the water and be happy together. Entry is 50 riyals,", "12 years and under" ,4.0);
    ActivityF("Sparky's game park", 100, "4:00pm-11:00Pm", "Fanateer", "Sparky's is considered one of the most important amusement parks that adults and children go to because of the various means of entertainment it provides, including electric games, a skating rink, a video game hall", "for kids and family" ,3.3);
    
    defaultSearchesF = new ArrayList<>();
    defaultRatesF = new ArrayList<>();
    ServiceF("**\nHotels:\nBoudl ", 4.1);
    ServiceF("Karan ", 4.1);   
    ServiceF("**\nCompounds:\nWareef", 3.5);
    ServiceF("Nurjan ",3.9);
    ServiceF("**\nHospitals:\nAl-lulu ", 3.0 );
    ServiceF("Karan ", 4.1); 
    ServiceF("**\nPharmacys:\nAldawaa", 3.8);
    ServiceF("Aram ", 4.0); 
    ServiceF("Al-Nahdi ", 4.2); 
    ServiceF("Boots ", 3.2);
    ServiceF("**\nRestaurants:\nWe Burger ", 4.8 );
    
    ServiceF("Stake House ", 4.1);
    ServiceF("ShrimpNation ", 4.0); 
    ServiceF("Muqsaf Dareen", 4.1);
    ServiceF("**\nCafes:\nLatteWorks", 4.2);
    ServiceF("Zoya ", 4.1);
    ServiceF("Ratio ", 4.1);
    ServiceF("Tai Tea House", 4.0);
    ServiceF("Methods ", 4.1);
    ServiceF("Swing ", 4.3);
    ServiceF("Guarantee tea", 4.3);
    ServiceF("**\nCenters:\nThe Move  ",4.5 );
    ServiceF("Galleria mall ",4.2 );
    ServiceF("Banana Beach ", 3.8);
    ServiceF("**\nSuperMarkets:\nAl-Tamimi ",4.2);  
    ServiceF("Lulu Hiber",4.2 );
    ServiceF("**\nEducation:\nNajd Secondary School ",4.1  ); 
    ServiceF("Fanateer Elemantary School",4.3 );
    ServiceF("14Th Elementary School ",3.5);
    
    }
    
     
}