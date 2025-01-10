import java.util.Scanner;
import java.lang.*;
class TrainglePerimeter
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int side1,side2,side3,perimeter,totalRounds,runningDistanceInKm;
		side1 = input.nextInt();
		side2 = input.nextInt();
		side3 = input.nextInt();
		runningDistanceInKm = 5;
		perimeter = side1 + side2 + side3;
		runningDistanceInKm = 5;
		int runningDistanceInMetre = 5 * 1000;
		totalRounds = runningDistanceInMetre / perimeter;
	System.out.println(" The total number of rounds the athlete will run is " + Math.ceil(totalRounds) +" to complete 5 km");
	input.close();
	}
}

		