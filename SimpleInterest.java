import java.util.Scanner;
class SimpleInterest
{
  public static void main(String args[])
  {
  Scanner input = new Scanner(System.in);
  
  double principal,rate,time,si;
  System.out.println("Enter the principal amount : ");
  principal = input.nextDouble();
  
  System.out.println("Enter the rate : ");
  rate = input.nextDouble();
  
  System.out.println("Enter the time : ");
  time = input.nextDouble();
  
  si = (principal*rate*time)/100;
  
  System.out.println("SimpleInterest Is = " + (si));
  }
}
  