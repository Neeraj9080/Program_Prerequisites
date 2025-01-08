import java.util.Scanner;
class KilometersToMiles
{
  public static void main(String args[])
  {
   Scanner input = new Scanner(System.in);
   double kilometers,miles;
   
   System.out.println("Enter the kilometers : ");
   kilometers = input.nextDouble();
   
   miles = kilometers * 0.621371;
   
   System.out.println("Kilometers To Miles Conversion is = " + (miles));
  }
}    