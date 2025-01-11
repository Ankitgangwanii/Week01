
import java.util.Scanner;

public class SignCheck
 {
        public static void main(String args[])
        {
            Scanner input = new  Scanner(System.in);
            int arr[] = new int[5];
            System.out.println("Enter the Elements of Array");
                for(int i=0;i<arr.length;i++)
                {
                    arr[i]=input.nextInt();
                }
                 for(int i=0;i<arr.length;i++)
                 {
                    if(arr[i]<0)
                    {
                        System.out.println("The number is Negative");
                    }
                    if(arr[i]==0)
                    {
                        System.out.println("The number is Zero");
                    }
                    else
                    {
                        System.out.print("The number is Positive and ");
                        if(arr[i]% 2==0)
                        {
                            System.out.println("The number is Even");
                        }
                        else
                        {
                            System.out.println("The number is Odd");
                        }
                    }
                 }
                 if(arr[0]>arr[arr.length - 1])
                 {
                    System.out.println("The First Number is greater than Last Number of array");
                 }
                 if(arr[0]==arr[arr.length - 1])
                 {
                    System.out.println("The First Number is equal to Last Number of array");
                 }
                 else
                 {
                    System.out.println("The First Number is less than Last Number of array ");
                 }
                 
        }
    

}
