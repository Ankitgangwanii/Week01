
import java.util.Scanner;
public class ExceptionProblemTwo {
    public static char stringIndexOutOfBound(String string)
    {
        return string.charAt(string.length());
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String");
        String string = input.next();
        try{
            char stringIndexOutOfBound = stringIndexOutOfBound(string);
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(e + " is found");
        }
    }
}
