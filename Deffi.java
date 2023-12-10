/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenobas22;
import java.util.ArrayList;
import java.util.List;
 
public class Deffi extends Neighborhoods {
    public Deffi(){
    ActivityD("deffi park", 100, "24 hour", "deffi", "you can enjoy with your family with a lot of features: BBQ place, walking and running paths, and more", "all age groups", 4.5);
    
           // Add Deffi Services
        defaultSearchesD = new ArrayList<>();
        defaultRatesD = new ArrayList<>();
    ServiceD("**\nHospitals:\nAl-mana ", 3.1 );
    ServiceD("Mouwasat ", 2.8 ); 
    ServiceD("**\nPharmacys:\nAldawaa", 3.8);
    ServiceD("Al-Nahdi ", 4.2);
    ServiceD("**\nRestaurants:\nBarbar Aga ", 3.6 );
    ServiceD("Fustat ", 3.8);
    ServiceD("Mix Chef ", 4.1); 
    ServiceD("**\nCafes:\nDair Mount", 4.6);
    ServiceD("Le Cafe ", 3.5);
    ServiceD("Attibassi ", 3.8);
    ServiceD("**\nCenters:\nDeffi Center ", 3.9 );
    ServiceD("**\nSuperMarkets:\nFarm ",4.0);  
    ServiceD("Multaqa Altawfeer ",5.0 );
    ServiceD("**\nEducation:\nDeffi Elematary School ",3.7  ); 
    ServiceD("Riyadh Al-Bayan School",3.5 );
    ServiceD("Deffi Secondary School",3.5 );
    
}

   
}