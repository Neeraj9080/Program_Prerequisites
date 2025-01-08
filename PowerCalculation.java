import java.util.Scanner;
class PowerCalculation
{
  public static void main(String args[])
  {
  Scanner input = new Scanner(System.in);
  
  double power,base,exponent;
  System.out.println("Enter base of a number : ");
  base = input.nextDouble();
  
  System.out.println("Enter exponent of a number : ");
  exponent = input.nextDouble();
  
    power = Math.pow(base,exponent);

  
  System.out.println("Power is = " + (power));
  }
}
  