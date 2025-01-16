
import java.util.*;
public class TextSplitter {

    // find the length of string without built-in length() method
    public static int TextSplitter(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }
    // Method to split the text  
    public static String[] customSplit(String text) {
        int length = TextSplitter(text);
        int wordCount = 1;

        // Count the number of words 
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount - 1];
        int spaceIndex = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndex++] = i;
            }
        }
        String[] words = new String[wordCount];
        int wordStart = 0;
        for (int i = 0; i < spaceIndexes.length; i++) {
            words[i] = text.substring(wordStart, spaceIndexes[i]);
            wordStart = spaceIndexes[i] + 1;
        }
        words[words.length - 1] = text.substring(wordStart);
        return words;
    }

    // Method created
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.println("Enter a line of text:");
        String inputText = input.nextLine();
        String[] customSplitWords = customSplit(inputText);
        String[] builtInSplitWords = inputText.split(" ");

        // Compare the two string 
        boolean areArraysEqual = compareStringArrays(customSplitWords, builtInSplitWords);

        // result sprint
        System.out.println("Are the two string arrays equal? " + areArraysEqual);

        //  the words for verified
        System.out.println("Custom Split Words:");
        for (String word : customSplitWords) {
            System.out.println(word);
        }
        System.out.println("Built-in Split Words:");
        for (String word : builtInSplitWords) {
            System.out.println(word);
        }
        input.close();
    }
}
