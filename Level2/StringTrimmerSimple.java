
import java.util.Scanner;
public class StringTrimmerSimple{
    // Method to find the start and end indices to trim leading and trailing spaces
    public static int[] findTrimPoints(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Trim leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        // Trim trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

   
    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result +=(str.charAt(i));
        }
        return result;
    }

    // Method to compae two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter a string with leading and trailing spaces:");
        String inputText = input.nextLine();

        
        int[] trimPoints = findTrimPoints(inputText);
        String trimmedCustom = customSubstring(inputText, trimPoints[0], trimPoints[1]);

        
        String trimmedBuiltIn = inputText.trim();

        
        boolean areEqual = compareStrings(trimmedCustom, trimmedBuiltIn);
        
       
        System.out.println("Custom trimmed string: '" + trimmedCustom + "'");
        System.out.println("Built-in trimmed string: '" + trimmedBuiltIn + "'");
        System.out.println("Are the two strings equal? " + areEqual);
        input.close();
    }
}
