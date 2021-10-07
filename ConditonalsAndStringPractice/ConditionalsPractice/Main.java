public class Main
{
   public static void main(String[] args)
   {
      boolean a;
      boolean b;
      boolean c;
      boolean d;
      
      int x = 1;
      int y = 2;
      int z = 3;
      
      a = x > y; // should be false
      b = y < z; // should be true 
      c = a && b; // false and true - should be false (only would be true if a and b were true) 
      d = a || b; // false or true - should be true (would be false if a and b were false, only one has to be true for it to be true)
      
      if ( x < z && y < z ) // uses boolean operator &&, only executes if both the statements are true
      {
         System.out.println("the biggest one is z");
      }
      
      String s = "Hello World!"; 
      int lengthOfS = s.length(); //uses string length() method and stores returned variable in the int lengthOfS
      System.out.println(lengthOfS);
      
      String s1 = "Umbrella";
      String s2 = "Flower";
      System.out.println(s1.compareTo(s2)); // will return 15 because the ascii value of U is 15 greater than that of F
      
      s1 = "Apple";
      s2 = "Applb";
      System.out.println(s1.compareTo(s2)); // will return 3 because the acsii value of e is 3 greater than the asii value of b
   }

}