import java.util.*;
public class MainProgram
{
   public static void main (String[] args) 
   {
      //Random rand= new Random();
      //System.out.println(rand.nextInt(44));
      
      Animal cat = new Animal(5, 10);
      System.out.println("The number of legs on the cat is: "+ cat.getNumOfLegs());
   }
}
