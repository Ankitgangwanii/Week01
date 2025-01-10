import java.util.Scanner;
class HandShakes
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int noOfStudents = input.nextInt();
		int handshake = (noOfStudents * ( noOfStudents - 1 )) / 2;
	System.out.println("The total Number Of HandShakes are " + handshake);
	input.close();
	}
}