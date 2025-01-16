public class ExceptionProblem {
    public static char nullPointerException(String string){
        return string.charAt(0);
    }
    public static void nullPointerExceptionHandler(String string)
    {
        try
        {
            char nullPointerException = nullPointerException(string);
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointerException");
        }
    }
    public static void main(String args[])
    {
        String text = null;
        try
        {
            char nullPointerException = nullPointerException(text);
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointerException");
        }
        nullPointerExceptionHandler(text);
    }
}
