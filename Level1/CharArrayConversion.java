
import java.util.Scanner;

public class CharArrayConversion {
    public static char[] charArrayUsingCharAt(String string)
    {
        char charArray[] = new char[string.length()];
        for(int i=0;i<string.length();i++)
        {
            charArray[i]=string.charAt(i);
        }
        return charArray;
    }
    public static char[] charArrayUsingMethod(String string)
    {
        return string.toCharArray();
        
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String ");
        String string = input.next();
        char [] charArrayUsingCharAt = charArrayUsingCharAt(string);
        char [] charArrayUsingMethod = charArrayUsingMethod(string);
        boolean result = true;
        for(int i=0;i<charArrayUsingCharAt.length;i++)
        {
            if(charArrayUsingCharAt[i]!=charArrayUsingMethod[i])
            {
                result = false;
                break;
            }
        }
        if(result){
        System.out.println("The result is same");
        }
    }
}
