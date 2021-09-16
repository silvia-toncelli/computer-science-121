public class MainProgram // declares main class
{
      
   public static void main(String[] args) // declare main method 
   {
   
      Car car1= new Car(); // create new object 
      
      car1.setFuelCapacity(5.5); // set the fuel capacity to 5.5
      double val= car1.getFuelCapacity(); // get the fuel capacity and assign double val to it 
      
      System.out.println("\nFuel Capacity: " + val); // print double variable "val" 
      System.out.println("Fuel Capacity: " + car1.getFuelCapacity()); // gets and prints cars fuelCapacity in the same line
      
      System.out.println("\nFuel Amount: " + car1.getFuelAmount()); // should print 0.0 because double fuelAmount has not been set/initialized
      
      car1.setNumDoors(8);
      System.out.println("\nYour car has " + car1.getNumDoors() + " doors.");
   }
}