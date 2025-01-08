import java.util.Scanner;
class TemperatureConversion
{
  public static void main(String args[])
  {
   Scanner input = new Scanner(System.in);
   double celsius,fahrenheit;
   
   System.out.println("Enter temperature in Celsius : ");
   celsius = input.nextDouble();
   
   fahrenheit = (celsius * 1.8) + 32;
   
   System.out.println("Temperature in Fahrenheit is = " + (fahrenheit));
  }
} 