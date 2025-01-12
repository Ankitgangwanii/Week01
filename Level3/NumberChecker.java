
import java.util.Scanner;

class NumberChecker{

    
    public static int countDigits(int number) {
		
		int numberCount = String.valueOf(Math.abs(number)).length();
        
		
		return numberCount;
    }

    
    public static int[] getDigitsArray(int number) {
		
		
        int size = countDigits(number);
		
		
        int[] digits = new int[size]; 
        for (int i = size - 1; i >= 0; i--) {
            digits[i] = number%10;
            number = number/10;
        }
		
        return digits;
    }

    
    public static boolean isDuckNumber(int number) {
		
		
        String numStr = String.valueOf(Math.abs(number));
		
		
		boolean isDuck = numStr.contains("0");
		
        return isDuck;
    }

    
    public static boolean isArmstrongNumber(int number) {
		
		
        int[] digits = getDigitsArray(number);
		
		
        int power = digits.length; 
		
        int sum = 0;
        for (int i=0;i<digits.length;i++) {
            sum += Math.pow(digits[i], power); 
        }
		
		
        boolean isSame = (sum == number);
		
		
		return isSame;
    }
 
    
    public static int[] findLargestAndSecondLargest(int[] digits) {
		
		
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        
        for (int i = 0;i<digits.length;i++) {
            if (digits[i] > largest) {
				 
                secondLargest = largest;
				
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
				
                secondLargest = digits[i];
            }
        }

        
        int[] twoLargestNumber = new int[]{largest, secondLargest};
		return twoLargestNumber;
    }
	
	
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
		
		
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        
        for (int i = 0;i<digits.length;i++) {
            if (digits[i] < smallest) {
				
                secondSmallest = smallest;
				
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
				
                secondSmallest = digits[i];
            }
        }

        
        int[] twoSmallestNumber = new int[]{smallest, secondSmallest};
		return twoSmallestNumber;
    }
	
    
    public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter a number");
        int number = input.nextInt();

        
        System.out.println("Number " + number + "\nIs a Duck Number " + isDuckNumber(number) + "\nIs Armstrong Number " + isArmstrongNumber(number));
        
		
        int[] digits = getDigitsArray(number);
       

        
        int[] largestResults = findLargestAndSecondLargest(digits);
        System.out.println("Largest Digit: " + largestResults[0] + "\nSecond Largest Digit: " + largestResults[1]);
        

        
        int[] smallestResults = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Digit: " + smallestResults[0] + "\nSecond Smallest Digit: " + smallestResults[1]);
    
	    
		input.close();
    }
}
