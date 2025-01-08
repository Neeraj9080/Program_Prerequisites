import java.util.Scanner;
class PerimeterOfRectangle
{
  public static void main(String args[])
  {
  Scanner input = new Scanner(System.in);
  
  double length,width,perimeter;
  System.out.println("Enter length of the rectangle : ");
  length = input.nextDouble();
  
  System.out.println("Enter width of the rectangle : ");
  width = input.nextDouble();
  
  perimeter = 2 * (length + width);
  
  System.out.println("Perimeter of a Rectangle = " + (perimeter));
  }
}
  