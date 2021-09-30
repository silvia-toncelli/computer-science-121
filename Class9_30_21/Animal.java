public class Animal
{
   //attributes
   private int numberOfLegs;
   private double age;
   private double height;
   private double weight;
   
   //constructor
   public Animal(double hgt, double wgt)
   {
      this.numberOfLegs = 4;
      this.height = hgt;
      this.weight = wgt;
   }
   
   public Animal()
   {
      this.age = 10;
   }
   
   //methods
   public void setNumOfLegs(int legs) 
   {
      this.numberOfLegs=legs;
   }
   public double getAge()
   {
      return this.age;
   }
   public void printMessage()
   {
      System.out.println("Welcome to our zoo!");
   }
   public int getNumOfLegs()
   {
      return this.numberOfLegs;
   }
}
