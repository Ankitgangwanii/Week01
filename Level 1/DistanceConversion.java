import java.util.Scanner;
class DistanceConversion
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		double distanceInFeet,distanceInYards;
		int distanceInMile,yardsInMiles;
		distanceInFeet = input.nextDouble();
		distanceInYards = distanceInFeet / 3;
		distanceInMile = (int)distanceInYards / 1760;
		yardsInMiles = (int)distanceInYards % 1760;
	System.out.println(" Distance of " + distanceInFeet + " feet in Miles and yard is " + distanceInMile + " and " + yardsInMiles);
	input.close();
	}
} 
		
