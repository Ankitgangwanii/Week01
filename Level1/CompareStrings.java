
import java.util.Scanner;

class CompareStrings
{
        public static boolean compareStringCharAt(String string1,String string2)
        {
                for(int i=0;i<string1.length();i++)
                {
                    if(string1.charAt(i)!=string2.charAt(i))
                    {
                        
                        System.out.println("Strings are not equal using charAt");
                        return false;
                    }
                }
                System.out.println("Strings are equal using charAt");
                return true;
        }
        public static boolean compareStringEquals(String string1,String string2)
        {
            if(string1.equals(string2))
            {
                System.out.println("Strings are equal using Equals Method");
            }
            else
            {
                System.out.println("Strings are not equal using Equals Method ");
            }
            return string1.equals(string2);
        }
        public static void main(String args[])
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the First String");
            String string1 = input.next();
            System.out.println("Enter the Second String");
            String string2 = input.next();
            boolean resultOfCharAt = compareStringCharAt(string1, string2);
            boolean resultOfEquals = compareStringEquals(string1, string2);
            if(resultOfCharAt==resultOfEquals)
            {
                    System.out.println("Result is same on both Practices");
            }
            else
            {
                    System.out.println("Result is not same on both Practices");
            }
           

        }
}