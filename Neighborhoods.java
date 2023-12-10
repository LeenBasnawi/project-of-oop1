/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lenobas22;
import java.util.ArrayList;
import java.util.List;
public class Neighborhoods {
    public Neighborhoods() {
        namesj = new ArrayList<>();
        numOfPeoplej = new ArrayList<>();
        timesj = new ArrayList<>();
        locationsj = new ArrayList<>();
        informationj = new ArrayList<>();
        agesj = new ArrayList<>();
        ratesj = new ArrayList<>();
        
        namesf= new ArrayList<>();
        numOfPeoplef = new ArrayList<>();
        timesf= new ArrayList<>();
        locationsf = new ArrayList<>();
        informationf = new ArrayList<>();
        agesf = new ArrayList<>();
        ratesf = new ArrayList<>();
        
        namesd = new ArrayList<>();
        numOfPeopled= new ArrayList<>();
        timesd= new ArrayList<>();
        locationsd = new ArrayList<>();
        informationd = new ArrayList<>();
        agesd= new ArrayList<>();
        ratesd = new ArrayList<>();
        
        defaultSearchesF = new ArrayList<>();
    defaultRatesF = new ArrayList<>();
        
        
    }
    private List<String> namesj;
    private List<Integer> numOfPeoplej;
    private List<String> timesj;
    private List<String> locationsj;
    private List<String> informationj;
    private List<String> agesj;
    private List<Double> ratesj;
    
    private List<String> namesf;
    private List<Integer> numOfPeoplef;
    private List<String> timesf;
    private List<String> locationsf;
    private List<String> informationf;
    private List<String> agesf;
    private List<Double> ratesf;
    
    private List<String> namesd;
    private List<Integer> numOfPeopled;
    private List<String> timesd;
    private List<String> locationsd;
    private List<String> informationd;
    private List<String> agesd;
    private List<Double> ratesd;
  
   
    
    public List<String> defaultSearchesJ;
    public List<Double> defaultRatesJ;

    public List<String> defaultSearchesF;
    public List<Double> defaultRatesF;
    
    public List<String> defaultSearchesD;
    public List<Double> defaultRatesD;

    //function for Jalmudah activities
    public void ActivityJ(String name, int numOfPeople, String time, String location, String information, String age , double rate){
        namesj.add(name);
        numOfPeoplej.add(numOfPeople);
        timesj.add(time);
        locationsj.add(location);
        informationj.add(information);
        agesj.add(age);
        ratesj.add(rate);

// The 'names' list is not initialized, causing a NullPointerException
        // Other code...
    }
        
    public void ActivityJ() {
        System.out.println("Jalmudah's Activuties: ");
        for (int i = 0; i < namesj.size(); i++) {
            System.out.println(namesj.get(i) + " | " + agesj.get(i) + " | " + locationsj.get(i) + " | " + informationj.get(i) + " | " + timesj.get(i) + " | " + numOfPeoplej.get(i));
        }
    }
    
    //fanateer Activity

        public void ActivityF(String name, int numOfPeople, String time, String location, String information, String age , double rate){
        namesf.add(name);
        numOfPeoplef.add(numOfPeople);
        timesf.add(time);
        locationsf.add(location);
        informationf.add(information);
        agesf.add(age);
        ratesf.add(rate);

    }
           public void ActivityF() {
        System.out.println("Fanateer's Activities: ");
        for (int i = 0; i < namesf.size(); i++) {
            System.out.println(namesf.get(i) + " | " + agesf.get(i) + " | " + locationsf.get(i) + " | " + informationf.get(i) + " | " + timesf.get(i) + " | " + numOfPeoplef.get(i));
        }
    }
           
           
    //Deffi 
        public void ActivityD(String name, int numOfPeople, String time, String location, String information, String age , double rate){
        namesd.add(name);
        numOfPeopled.add(numOfPeople);
        timesd.add(time);
        locationsd.add(location);
        informationd.add(information);
        agesd.add(age);
        ratesd.add(rate);

    }
        public void ActivityD() {
        System.out.println("Deffi's Activities: ");
        for (int i = 0; i < namesd.size(); i++) {
            System.out.println(namesd.get(i) + " | " + agesd.get(i) + " | " + locationsd.get(i) + " | " + informationd.get(i) + " | " + timesd.get(i) + " | " + numOfPeopled.get(i));
        }
    }
   
  
    //Function for Jalmudah Services
   public void ServiceJ(String search, double rate) {
        defaultSearchesJ.add(search);
        defaultRatesJ.add(rate);
    }
   
   
   
   //Function for view serv Jalmudah
   public void viewServicesJ() {
        System.out.println("Jalmudah's Services:");
        for (int i = 0; i < defaultSearchesJ.size(); i++) {
            System.out.println(defaultSearchesJ.get(i) + " || " + defaultRatesJ.get(i));
        }
    }
   //function for Fanateer activities
    
     //Function for Fanateer Services
   public void ServiceF(String search, double rate) {
        defaultSearchesF.add(search);
        defaultRatesF.add(rate);
        
    }
   public void viewServicesF() {
        System.out.println("Fanateer's Services:");
        for (int i = 0; i < defaultSearchesF.size(); i++) {
            System.out.println(defaultSearchesF.get(i) + " || " + defaultRatesF.get(i));
        }
    }

   
       public void ServiceD(String search, double rate) {
        defaultSearchesD.add(search);
        defaultRatesD.add(rate);
        
    }
   public void viewServicesD() {
        System.out.println("Deffi Services");
        for (int i = 0; i < defaultSearchesD.size(); i++) {
            System.out.println(defaultSearchesD.get(i) + " || " + defaultRatesD.get(i));
}
}


}