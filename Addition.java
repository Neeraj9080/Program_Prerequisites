import java.util.Scanner;
class Addition
{
  public static void main(String args[])
  {
   Scanner input = new Scanner(System.in);
   int num1,num2;
   
   System.out.println("Enter first number : ");
   num1 = input.nextInt();
   
   System.out.println("Enter second number : ");
   num2 = input.nextInt();
   
   System.out.println("Addition is = " + (num1+num2));
  }
}    