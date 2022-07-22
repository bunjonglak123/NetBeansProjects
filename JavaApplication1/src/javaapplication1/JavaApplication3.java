
import java.util.Scanner;
public class JavaApplication3
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
                System.out.format("Enter three points for a triangle:");
		double x1 = input.nextFloat();
		double y1 = input.nextFloat();
		double x2 = input.nextFloat();
		double y2 = input.nextFloat();
		double x3 = input.nextFloat();
		double y3 = input.nextFloat();
		
		double side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		double side2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		
		double s = (side1 + side2 + side3)/2;
		
		double area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
		
		System.out.format("The area of the triangle is %f",area);
	}

}