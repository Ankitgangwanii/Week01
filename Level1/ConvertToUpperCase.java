import java.util.Scanner;
public class ConvertToUpperCase {
    
        public static String compareUpperCaseUsingCharAt(String string) {
            String newString = "";
            for (int i = 0; i < string.length(); i++) {
                if(string.charAt(i)==' ')
                {
                    newString +=" ";
                }
                else if (string.charAt(i) >= 97 && string.charAt(i) <= 122) {
                    int newChar = string.charAt(i) - 32;
                    newString += (char) newChar;
                }
                else
                {
                    newString +=string.charAt(i);
                }
            }
            return newString;
        }
    
        public static String compareUsingUpperCase(String string) {
            return string.toUpperCase();
        }
    
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String value = input.nextLine();
        String result1 =compareUsingUpperCase(value);
        String result2 =  compareUpperCaseUsingCharAt(value);
       
        if(result1.equals(result2))
        {
            System.out.println("The Result is same");
        }

    }
    
}
