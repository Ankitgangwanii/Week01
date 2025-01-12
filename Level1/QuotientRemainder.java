import java.util.Scanner;

class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter the dividend ");
        int number = input.nextInt();

        System.out.println("Enter the divisor ");
        int divisor = input.nextInt();

        
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero ");
            return;
        }

        
        int[] result = findRemainderAndQuotient(number, divisor);

        
        System.out.println("Quotient: " + result[1]);
        System.out.println("Remainder: " + result[0]);
    }

    
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;  // Calculate remainder
        int quotient = number / divisor;  // Calculate quotient
        return new int[]{remainder, quotient}; // Return both in an array
    }
}
