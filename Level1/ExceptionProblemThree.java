
import java.util.Scanner;

public class ExceptionProblemThree {
    public static String  stringIllegalArgument(String string, int start,int end)
    {
        String subString = string.substring(start,end);
        return subString;
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String string = input.next();
        try{
            String string1 = stringIllegalArgument(string, string.length(), 12);
        }
        catch(Exception e)
        {
            System.out.println("IllegalArgument Exception ");
        }
    }

}
