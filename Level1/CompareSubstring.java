import java.util.Scanner;
public class CompareSubstring {
    public static String compareUsingCharAt(String string, int start,int end)
    {  
         String subString = "";
        for(int i=start;i<end;i++)
        {
            subString +=string.charAt(i);
        }
        System.out.println("The SubString is " +subString);
        return subString;
    }
    public static String compareUsingSubString(String string, int start, int end)
    {
        String subString = "";
        subString = string.substring(start,end); 
        System.out.println("The SubString is " +subString);
        return subString;
    }
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String");
        String string = input.next(); 
        System.out.println("Enter the Start Index");
        int start = input.nextInt();
        System.out.println("Enter the End Index");
        int end = input.nextInt();
        String resultUsingCharAt = compareUsingCharAt(string, start, end);
        String resultUsingSubString = compareUsingSubString(string, start, end);
        if(resultUsingCharAt.equals(resultUsingSubString))
        {
            System.out.println("The result are same");
        }
    }
}
