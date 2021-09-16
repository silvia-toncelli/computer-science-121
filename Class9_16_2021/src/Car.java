public class Car // declare Car class
{

   // class attributes
   // do not assign values here, it works but it is bad practice
   
   private double fuelCapacity; // "private" key word means only the person who made the class or is editing the class can access this 
   private double fuelAmount;
   private int numDoors;
   
   // constructor: has no return type and name matches the class name 
   // constructer is called when the user initiates the new instance of the object Car
   // constructor is not necessary but extremely helpful when there are many variables
   public Car (double capacity)
   {
      fuelAmount=3; // sets default value for fuelAmount
      fuelCapacity=capacity; // sets value to variable given my user when the object is created
   }
   
   // can have multiple constructors that ask for different variables, depending on what user inputs the correct constructor will be called
   public Car(double capacity, int numberDoors)
   {
      fuelAmount=3;
      fuelCapacity=capacity;
      numDoors=numberDoors;
   }
   
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