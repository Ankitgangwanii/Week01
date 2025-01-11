import java.util.Scanner;


class MeanHeight 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        
        double[] heights = new double[11];
        double totalHeight = 0.0;

        
        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < heights.length; i++) 
        {
            heights[i] = input.nextDouble();
            totalHeight += heights[i]; 
        }

        
        double meanHeight = totalHeight / heights.length;
        System.out.println("Mean height of the team: " + meanHeight);

        input.close(); 
    }
}
