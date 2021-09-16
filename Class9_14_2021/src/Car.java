public class Car // declare Car class
{

   // class attributes
   private double fuelCapacity; // "private" key word means only the person who made the class or is editing the class can access this 
   private double fuelAmount;
   private int numDoors;
   
   // class methods
   public void setFuelCapacity(double capacity) // setter allows the user to change the values of the properties of the class, NOT ACCESS OR VIEW
   {
      fuelCapacity= capacity; // sets fuelCapacity to the value the user imputs when calling the method
   }
   
   public double getFuelCapacity() // getter allows the user to access or view the values of the properties of the class, NOT CHANGE
   {
      return fuelCapacity; // return the value of the fuelCapacity to the user calling the method
   }
   
   public double getFuelAmount()
   {
      return fuelAmount;
   }
   
   public void setNumDoors(int num) // num is an example of a local variable 
   {
      numDoors=num;
   }
   
   public int getNumDoors() 
    // return type must match the type of the variable being returned
   {
      return numDoors;
   }

}