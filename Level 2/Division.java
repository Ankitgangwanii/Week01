import java.util.Scanner;
class Division
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int number1, number2,remainder,quotient;
		number1 = input.nextInt();
		number2 = input.nextInt();
		remainder = number1 % number2;
		quotient = number1 / number2;
	System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1 + " and " + number2);
	input.close();
	}
}

 
		