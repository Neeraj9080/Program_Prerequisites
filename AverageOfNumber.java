import java.util.Scanner;
class AverageOfNumber
{
  public static void main(String args[])
  {
   Scanner input = new Scanner(System.in);
   int num1,num2,num3;
   
   System.out.println("Enter first number : ");
   num1 = input.nextInt();
   
   System.out.println("Enter second number : ");
   num2 = input.nextInt();
   
   System.out.println("Enter third number : ");
   num3 = input.nextInt();
   
   double result = (1.0*(num1+num2+num3))/3;
   
   System.out.println("Average Of Three Number is = " + (result));
  }
}    