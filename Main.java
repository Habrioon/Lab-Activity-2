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

      car1.setBrand("Ferrari");
      car1.setModel("F8");
      car1.setYear(2020);

      System.out.println("After updating Vehicle 1:");
      car1.displayInfo();

   }
}