import java.util.Scanner;

class ArraySumWithLimit
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (maximum 10 values). Enter 0 or a negative number to stop:");

        
        while (true) 
        {
            numbers[index] = input.nextDouble();

            
            if (numbers[index] <= 0 || index == 10) {
                break;
            }

            index++;
        }

        
        for (int i = 0; i < index; i++) 
        {
            total += numbers[i];
        }

        
        System.out.println("The entered numbers are:");
        for (int i = 0; i < index; i++)
        {
            System.out.println(numbers[i]);
        }

        System.out.println("The total sum of the numbers is " + total);

        input.close();
    }
}
