import java.util.Scanner;
class Volume
{
  public static void main(String args[])
  {
  Scanner input = new Scanner(System.in);
  
  double radius,height,volume;
  System.out.println("Enter radius of the cylinder : ");
  radius = input.nextDouble();
  
  System.out.println("Enter height of the cylinder : ");
  height = input.nextDouble();
  
  volume = 3.14 * (radius*radius) * height;
  
  System.out.println("Volume of a cylinder = " + (volume));
  }
}
  