import java.util.Scanner;
public class ConvertToLowerCase {
    public static String compareLowerCaseUsingCharAt(String string) {
        String newString = "";
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i)==' ')
            {
                newString +=" ";
            }
            else if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                int newChar = string.charAt(i) + 32;
                newString += (char) newChar;
            }
            else
            {
                newString +=string.charAt(i);
            }
        }
        System.out.println(newString);
        return newString;
    }

    public static String compareUsingLowerCase(String string) {

        return string.toLowerCase();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String");
        String string = input.nextLine();
        
            String result1 = compareLowerCaseUsingCharAt(string);
            String result2 = compareUsingLowerCase(string);
            if(result1.equals(result2))
            {
                System.out.println("Both give the Same result");
            }
        
    }

}
