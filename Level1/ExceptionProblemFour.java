import java.util.Scanner;
public class ExceptionProblemFour {
    public static int numberFormatException(String string)
    {
        int number = Integer.parseInt(string);
        return number;
    }
    public static void refactorNumberFormatException(String string)
    {
        try
        {
            int number = numberFormatException(string);
        }
        catch(NumberFormatException e){
            System.out.println("It shows number format exception");
        }
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String");
        String string = input.next();
        try
        {
            int number = numberFormatException(string);
        }
        catch(NumberFormatException e){
            System.out.println("It shows number format exception");
        }
        refactorNumberFormatException(string);
        
    }
}
