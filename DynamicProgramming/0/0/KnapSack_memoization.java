class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         int dp[][]=new int[n+1][W+1];
         if(W==0||n==0)
         return 0;
        for(int i=0;i<n+1;i++)
        {
            for(int w=0;w<W+1;w++)
            {
                dp[i][W]=-1;
            }
        }
        if(dp[n][W]!=-1)
        return dp[n][W];
         if(wt[n-1]<=W)
         {
            dp[n][W] = Math.max(val[n-1]+knapSack(W-wt[n-1],wt,val,n-1),knapSack(W,wt,val,n-1));
         }
         else if (wt[n-1]>W)
         {
             dp[n][W]=knapSack(W,wt,val,n-1);
         }
         return dp[n][W];
    } 
}
