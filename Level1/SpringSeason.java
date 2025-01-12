
public class SpringSeason 
{
    public static void main(String[] args) 
    {
        int day = Integer.parseInt(args[1]);
        int month = Integer.parseInt(args[0]);
        

        if (isSpringSeason(month, day)) 
        {
            System.out.println(day + "-" + month + " is a Spring Season");
        } else {
            System.out.println(day + "-" + month + " is  not a Spring Season");
        }
    }

    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20 && day <= 31) ||
            (month == 4 && day >= 1 && day <= 30) ||
            (month == 5 && day >= 1 && day <= 31) ||
            (month == 6 && day >= 1 && day <= 20)) {
            return true;
        }
        return false;
    }
}
