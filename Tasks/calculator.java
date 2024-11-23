import java.util.*;
class calculator
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of the subjects : ");
      int n = sc.nextInt();//no.  of subjects
      int totalmarksobtained = 0;
      System.out.println("Total marks : " + n * 100);
      for(int i = 1;i<=n;i++)
      {
          System.out.print("Enter the marks of subject " + i + "(out of 100) : ");
          int marksobtained = sc.nextInt();
          totalmarksobtained = totalmarksobtained + marksobtained;
      }
      System.out.println("Results : ");
      double percentage = totalmarksobtained / n;
      System.out.println("Total marks obtained : " + totalmarksobtained);
      System.out.println("Percentage : " + percentage);
      if(percentage >= 90)
      {
          System.out.println("Grade : A+");
      }
      else if(percentage >= 80)
      {
          System.out.println("Grade : A");
      }
      else if(percentage >= 70)
      {
          System.out.println("Grade : B");
      }
      else if(percentage >= 60)
      {
          System.out.println("Grade : C");
      }
      else if(percentage >= 50)
      {
          System.out.println("Grade : D");
      }
      else
      {
          System.out.println("Grade : F");
      }
    }
}