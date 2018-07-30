package problems;

/**
 * @author Ahad
 */
public class Knapsack {
    // A utility function that returns maximum of two integers
    static int max(int a, int b) { return (a > b)? a : b; }
      
   // Returns the maximum value that can be put in a knapsack of capacity W
    static int knapSack(int W, int wt[], int val[], int n) {
	int K[][] = new int[n+1][W+1];
      
     	// Build table K[][] in bottom up manner
        for (int i = 0; i <= n; i++) {
           for (int w = 0; w <= W; w++) {
                if (i==0 || w==0) {
                    K[i][w] = 0;
                    System.out.print(K[i][w]+ "a ");
                } else if (wt[i-1] <= w) {
                    K[i][w] = max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);
                    System.out.print(K[i][w]+ "b ");
                } else {
                    K[i][w] = K[i-1][w];
                    System.out.print(K[i][w]+ "c ");
                }  
           }
           System.out.println();
        }
      
        return K[n][W];
    }
 
   
    // Driver program to test above function
    public static void main(String args[]) {
        int value[] = {1,2,5,6};
        int weight[] = {2,3,4,5};
        int weightOfKnapsack = 8;
        int numberOfObj = value.length;
        System.out.println(knapSack(weightOfKnapsack, weight, value, numberOfObj));
    }
}
