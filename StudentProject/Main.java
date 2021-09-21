public class Main
{
   public static void main(String[] args)
   {
      Student stuName = new Student(654321);
      System.out.println("The student's GPA is "+stuName.getStudentGPA());
      
      stuName.setStudentGPA(3.2);
      System.out.println("The student's new GPA is "+stuName.getStudentGPA());

   }
}