import java.util.*;
public class Main2
{
   public static void main(String[] args)
   {
   
      //if else conditionals example program with boolean operators
      int currentTime; 
      Scanner scan = new Scanner(System.in);
      
      System.out.println("What time is it? Please only enter the hour.");
      currentTime = scan.nextInt();
      System.out.println("It is " + currentTime + " o'clock.");
      
      if (currentTime >= 6 && currentTime < 12)
      {
         System.out.println("Good Morning!");
      }
      else if (currentTime >= 12 && currentTime < 16)
      {
         System.out.println("Good Afternoon!");
      }
      else if (currentTime >= 16 && currentTime < 20)
      {
         System.out.println("Good Evening!");
      }
      else
      {
         System.out.println("Good Night!");
      }
      
   }
}
