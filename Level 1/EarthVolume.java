import java.lang.Math;
class EarthVolume
{
	public static void main(String args[])
	{
		double radiusKm = 6378;
		double kmToMiles = radiusKm * 0.621371;
		double pi = Math.PI;
		double volumeInKm = (4.0/ 3.0) * pi * Math.pow(radiusKm , 3);
		double volumeInMile = (4.0 / 3.0) * pi * Math.pow(kmToMiles , 3);
	System.out.println("The volume of earth in cubic kilometers is " + volumeInKm + " and cubic miles is " + volumeInMile );
	}
}


		