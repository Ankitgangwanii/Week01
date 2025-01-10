import java.util.*;
class CtoF
{
	public static void main(String args[])
	{
	Scanner input = new Scanner(System.in);
	int celcius = input.nextInt();
	int farenheitResult  = (c * 9 / 5) + 32;
	System.out.println("The " + celcius + " celsius is " + fahrenheitResult + " fahrenheit ");
	input.close();
	
	}
}
