import java.util.Scanner;

public class NumberOfRounds {

    
    public static int calculateRounds(double side1, double side2, double side3, double totalDistance) {
        
        double perimeter = side1 + side2 + side3;

       
        double distanceInMeters = totalDistance * 1000;

        
        return (int) Math.ceil(distanceInMeters / perimeter); 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the first side of the triangular park (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter the length of the second side of the triangular park (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter the length of the third side of the triangular park (in meters): ");
        double side3 = input.nextDouble();

        double totalDistance = 5.0;

        
        int numberOfRounds = calculateRounds(side1, side2, side3, totalDistance);

        System.out.println("The athlete needs to complete " + numberOfRounds + " rounds to cover 5 kilometers.");

        input.close();
    }
}
