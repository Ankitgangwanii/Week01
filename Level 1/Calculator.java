import java.util.Scanner;
class Calculator
{
	public double addition(double a,double b)
		{
			return a+b;
		}
	public double subtraction(double a,double b)
		{
			return a-b;
		}
	public double multip	lication(double a,double b)
		{
			return a*b;
		}
	public double division(double a,double b)
		{
			return a/b;
		}
   public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		Calculator ob = new Calculator();
	System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + ob.addition(number1,number2) + "," + ob.subtraction(number1,number2) + "," + ob.multiplication(number1,number2) + ",and " + ob.division(number1,number2));
	}
	input.close();
}

