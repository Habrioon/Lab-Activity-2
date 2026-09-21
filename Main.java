public class Main {
   public static void main(String[] args) {
   
      Vehicle car1 = new Vehicle();
      car1.brand = "Lamborghini";
      car1.model = "Aventador";
      car1.year = 2018;
      
      System.out.println("Vehicle 1:");
      car1.displayInfo();
      System.out.println("Age: " + car1.calculateAge());
      System.out.println("Vintage: " + car1.isVintage());
      
      System.out.println();
            
      Vehicle car2 = new Vehicle();
      car2.brand = "Mitsubishi";
      car2.model = "Lancer";
      car2.year = 2010;
      
      System.out.println("Vehicle 2:");
      car2.displayInfo();
      System.out.println("Age: " + car2.calculateAge());
      System.out.println("Vintage: " + car2.isVintage());
      
      System.out.println();
      
      Vehicle car3 = new Vehicle();
      car3.brand = "NIssan";
      car3.model = "Skyline";
      car3.year = 1998;
      
      System.out.println("Vehicle 3:");
      car3.displayInfo();
      System.out.println("Age: " + car3.calculateAge());
      System.out.println("Vintage: " + car3.isVintage());
      
      System.out.println();

   }
}