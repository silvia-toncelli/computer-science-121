public class MainProgram // declares main class
{
      
   public static void main(String[] args) // declare main method 
   {
   
      Car car1= new Car(6); // creates new object and sets fuelCapacity to 6 (calls the constructor asking only for fuel capacity)
      
      double val= car1.getFuelCapacity(); // get the fuel capacity and assign double val to it 
      
      System.out.println("Car 1");
      
      System.out.println("\nFuel Capacity: " + val); // print double variable "val" 
      System.out.println("Fuel Capacity: " + car1.getFuelCapacity()); // gets and prints car 1s fuelCapacity in the same line
      
      System.out.println("\nFuel Amount: " + car1.getFuelAmount());
      
      car1.setNumDoors(8);
      System.out.println("\nYour car has " + car1.getNumDoors() + " doors.\n");
      
      Car car2= new Car(15.5, 5); // calls second construtor with 2 variables for parameters 
      
      System.out.println("Car 2");
      
      System.out.println("\nFuel Capacity: " + car2.getFuelCapacity()); 
      
      System.out.println("\nFuel Amount: " + car2.getFuelAmount()); 
      
      System.out.println("\nYour car has " + car2.getNumDoors() + " doors.");

   }
}