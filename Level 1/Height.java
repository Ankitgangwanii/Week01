import java.util.Scanner;
class Height
{
	public static void main(String args[])
	{	
		double height, cmToInch;
		int feet,feetInInch ;
		Scanner input = new Scanner(System.in);
		height = input.nextDouble();
		cmToInch = height / 2.54;
		feet = (int) cmToInch / 12;
		feetInInch = (int) cmToInch % 12;
		
	System.out.println("Your Height in cm is " + height + " while in feet is " + feet + " and inches is " + feetInInch);
	}
	input.close();
}

		
		
		
		