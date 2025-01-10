import java.util.Scanner;
class Swapping
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int number1,number2;
		number1 = input.nextInt();
		number2 = input.nextInt();
		number1 = number1 ^ number2;
		number2 = number1 ^ number2;
		number1 = number1 ^ number2;
	System.out.println("The swapped numbers are " + number1 + " and " + number2);
	input.close();
	}
}	