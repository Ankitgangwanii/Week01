import java.util.Scanner;
public class CountWordsAndDisplay{
	
	//method to count the length of string
	public static int countLengthOfString(String str ){
		
		//initialize a variable count to store the length of string
		int count = 0;
		for(char ch : str.toCharArray()){
			count++;
		}
		return count;
	}

	//method to calculate the number of words in a string
	public static int countWords(String str, int size){
		int count = 1; 
		for(int i = 0 ;  i < size; i++){
			if(str.charAt(i)  == ' '){
				count++;
			}
		}	
		//return the number of counts
		return count;
	}
	
	//method to split the string and store the words in 2D array
	public static String [][] splitAndStore(String str,int size){
		
			
		String resultantString = "";
		int rowIndex = 0;
		int count = 0;
		String [][]resultString=new String[size][2];
			 
	
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != ' ') {
					resultantString += str.charAt(i);
					count++;

				} else if (str.charAt(i) == ' ' && str.charAt(i - 1) != ' ') {
					resultString[rowIndex][0] = resultantString;
				resultantString = "";
				resultString[rowIndex++][1] = String.valueOf(count);
				count = 0;
				}
			}
			resultString[rowIndex][0] = resultantString;
		resultString[rowIndex++][1] = String.valueOf(count);
		return resultString;
		}
	public static void displayMatrix(String resultantArray[][]){
		for(int i = 0; i < resultantArray.length; i++){
			System.out.println(resultantArray[i][0] + " - " + resultantArray[i][1]);
		}
	}
	
	
	public static void main(String[] args){
	
		//create an instance of scanner class
		Scanner input = new Scanner(System.in);
		
		//get first string input from user
		System.out.println("Enter string: ");
		String str = input.nextLine().trim();
		
		int size = countLengthOfString(str);
	
		// invoke countWords method to count the number of words
		int wordsLength = countWords(str, size);
		
		//initialize a 2D array to store the word with it's length
		String resultantArray[][] = splitAndStore(str, wordsLength);
		
		//invoke splitAndStore method and pass parameters as str and resultantArray
		System.out.println(splitAndStore(str, wordsLength));
		
		//invoke displayMatrix method to print the output
		displayMatrix(resultantArray);
		
		
		input.close();
	}
}