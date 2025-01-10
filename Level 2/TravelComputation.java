import java.util.Scanner;
class TravelComputation 
{
   
   public static void main(String[] args)
	 {

           Scanner input = new Scanner(System.in);
	   String name = input.next();
      
           String fromCity = input.next(), viaCity = input.next(), toCity = input.next();

           double distanceFromToVia = input.nextDouble();
     
      	   int timeFromToVia = input.nextInt();

           double distanceViaToFinalCity = input.nextDouble();

      
            int timeViaToFinalCity = input.nextInt();

            double totalDistance = distanceFromToVia + distanceViaToFinalCity;

            int totalTime = timeFromToVia + timeViaToFinalCity;
	System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and " +     	"the Total Time taken is " + totalTime + " minutes");
	input.close();
   }
}

