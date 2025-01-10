import java.util.Scanner;
class TriangleArea
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Give the input in inches");
		double height = input.nextDouble();
		double base = input.nextDouble();
		double AreaInSquareInches = 0.5 * height * base;
		double AreaInSquareCm = AreaInSquareInches * 6.4516;
	System.out.println("Area of Traingle in SquareInches is " + AreaInSquareInches + " and in SquareCentimeters is " + AreaInSquareCm);
	input.close();
	}
	
	
}