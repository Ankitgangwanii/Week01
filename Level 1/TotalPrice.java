import java.util.Scanner;
class TotalPrice
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		double unit,totalPrice;
		int quantity; 
		unit = input.nextDouble();
		quantity = input.nextInt();
		totalPrice = unit * quantity;
	System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unit);
	input.close();
	}
}

