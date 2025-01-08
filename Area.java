import java.util.Scanner;
class Area
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
	double radius,area;
	
	System.out.println("Enter the radius : ");
	radius = input.nextDouble();
	
	area = 3.14 * (radius * radius);
	
	System.out.println("Area of a circle is = " + (area));
   }
}