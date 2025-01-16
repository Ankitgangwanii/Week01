import java.util.Scanner;

public class ExceptionProblemFive {
    public static int arrayIndexOutOfBoundsException(int arr[]) {

        return arr[arr.length];
    }
    public static void arrayIndexOutOfBoundsExceptionHandler(int [] arr) {
        
        try{
            int number = arrayIndexOutOfBoundsException(arr);
            
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBound Exception");
        } 
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the number of Array");
        for(int i = 0;i<5;i++)
        {
           
            arr[i] = input.nextInt();
        }
        try{
            int number = arrayIndexOutOfBoundsException(arr);
            
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBound Exception");
        }
        arrayIndexOutOfBoundsExceptionHandler(arr);
    }
}
