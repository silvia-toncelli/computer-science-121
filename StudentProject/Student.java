public class Student
{
   //list of attributes
   
   private int studentID;
   private double studentGPA;
   
   //list of constructor(s)
   public Student(int studentID)
   {
       this.studentID = studentID;
       this.studentGPA = 4;
   }
   
   //list of methods
   public int getStudentID()
   {
      return this.studentID;
   }
   
   public void setStudentID(int idNum)
   {
      this.studentID = idNum;
   }
   
   public double getStudentGPA()
   {
      return this.studentGPA;   
   }
   
   public void setStudentGPA(double gpa)
   {
      this.studentGPA = gpa;
   }
   
} 
