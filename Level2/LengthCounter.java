import java.util.Scanner;
class LengthCounter
{
    public static int countLengthUsingLoop(String string )
    {
        int count=0;
        try{
            //infinite loop 
        while (true) {
            //it will catch an StringoutofBound exception
            string.charAt(count);
            count++; 
            
        }
    }
        //it will handle StringOutOfBoundException and will return the count
        catch(Exception e)
        {
            return count;
        }
    }
        
    
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String string = input.next();
       System.out.println(countLengthUsingLoop(string)); 
       input.close();
    }
}