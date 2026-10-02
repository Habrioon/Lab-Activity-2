public class Main {
   public static void main(String[] args) {

      Vehicle car1 = new Vehicle("Lamborghini", "Aventador", 2018);

      System.out.println("Vehicle 1:");
      car1.displayInfo();
      System.out.println("Brand: " + car1.getBrand());
      System.out.println("Model: " + car1.getModel());
      System.out.println("Year: " + car1.getYear());
      System.out.println("Age: " + car1.calculateAge());
      System.out.println("Vintage: " + car1.isVintage());

      System.out.println();

      Vehicle car2 = new Vehicle("Mitsubishi", "Lancer", 2010);

      System.out.println("Vehicle 2:");
      car2.displayInfo();
      System.out.println("Brand: " + car2.getBrand());
      System.out.println("Model: " + car2.getModel());
      System.out.println("Year: " + car2.getYear());
      System.out.println("Age: " + car2.calculateAge());
      System.out.println("Vintage: " + car2.isVintage());

      System.out.println();

      Vehicle car3 = new Vehicle("NIssan", "Skyline", 1998);

      System.out.println("Vehicle 3:");
      car3.displayInfo();
      System.out.println("Brand: " + car3.getBrand());
      System.out.println("Model: " + car3.getModel());
      System.out.println("Year: " + car3.getYear());
      System.out.println("Age: " + car3.calculateAge());
      System.out.println("Vintage: " + car3.isVintage());

      System.out.println();

      System.out.println("Testing setYear:");

      System.out.println("setYear(2000): " + car1.setYear(2000));
      System.out.println("Stored year: " + car1.getYear());
      System.out.println("Age: " + car1.calculateAge());
      System.out.println("Vintage: " + car1.isVintage());

      System.out.println();

      System.out.println("setYear(1885): " + car1.setYear(1885));
      System.out.println("Stored year: " + car1.getYear());

      System.out.println();

      System.out.println("setYear(2027): " + car1.setYear(2027));
      System.out.println("Stored year: " + car1.getYear());

      System.out.println();

      Vehicle invalidLow = new Vehicle("Test", "LowYear", 1885);
      System.out.println("New vehicle with year 1885: " + invalidLow.getYear());

      Vehicle invalidHigh = new Vehicle("Test", "HighYear", 2027);
      System.out.println("New vehicle with year 2027: " + invalidHigh.getYear());
   }
}