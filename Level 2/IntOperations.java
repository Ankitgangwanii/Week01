import java.util.Scanner;
class IntOperations
{
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		int a,b,c;
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		int result1,result2,result3,result4;
		result1 = a + b *c;
		result2 = a * b + c;
		result3 = c + a / b;
		result4 = a % b + c;
	System.out.println(" The results of Int Operations are " + result1 + "," + result2 + "," + result3 + " and " + result4);
	input.close();
	}
}