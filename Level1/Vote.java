import java.util.Scanner;
class Vote
{
        public static void main(String args[])
        {
            Scanner input = new Scanner(System.in);
            int age[] = new int[10];
            System.out.println("Enter the Age of Students");
            for(int i=0;i<age.length;i++)
            {
                age[i] = input.nextInt();
                if(age[i]<0)
                {
                    System.out.println("Invalid input");
                }

              
            }
            for(int i=0;i<age.length;i++)
            {
                if(age[i]>=18)
                {
                    System.out.println("The Student with the age " + age[i] + "can vote" );

                }
                else{
                        System.out.println("The Student with the age "+age[i]+ " cannot vote");
                }
            }

        }

}