import java.util.Scanner;
class Income
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int salary,bonus,totalIncome;
		salary = input.nextInt();
		bonus = input.nextInt();
		totalIncome = salary + bonus;
	System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
	input.close();
	}
}


