


class FootballTeamHeight{

    
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int i=0;i<heights.length;i++) {
            sum += heights[i]; 
        }
        return sum;
    }

    
    public static double calculateMean(int[] heights) {
        int sum = calculateSum(heights); 
        return (double) sum / heights.length; 
    }

    
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0]; 
        for (int i=0;i<heights.length;i++) {
            if (heights[i] < shortest) {
                shortest = heights[i]; 
            }
        }
        return shortest;
    }

   
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0]; 
        for (int i=0;i<heights.length;i++) {
            if (heights[i] > tallest) {
                tallest = heights[i]; 
            }
        }
        return tallest;
    }

    public static void main(String[] args){
		
        
		
        int[] heights = new int[11];
        

        
        for (int i = 0; i < heights.length; i++) {
            //heights[i] = random.nextInt(101) + 150;
            heights[i] = (int)Math.floor(Math.random()*101+150);
        }

        
        System.out.println("Player Heights ");
        for (int i=0;i<heights.length;i++) {
            System.out.print(heights[i] + " ");
        }
        System.out.println();
		
		
		int shortestHeight = findShortestHeight(heights);
		int tallestHeight = findTallestHeight(heights);
		double meanHeight = calculateMean(heights);

        
        System.out.println("Shortest Player Height: " + shortestHeight + "\nTallest Player Height: " + tallestHeight + "\nMean Player Height: " + meanHeight);
    }
}
