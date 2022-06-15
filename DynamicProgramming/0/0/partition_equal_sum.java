class Solution{
    static int equalPartition(int n, int arr[])
      {
          // code here
          int sum=0;
          for(int x:arr)sum+=x;
          
          if(sum%2!=0) return 0;
          
          Boolean[][] dp=new Boolean[n+1][sum/2+1];
          
          for(int i=0;i<=n;i++) 
              dp[i][0]=true;
  
          for(int j=1;j<=sum/2;j++)
              dp[0][j]=false;
          
          for(int i=1;i<=n;i++){
              for(int j=1;j<=sum/2;j++){
                  if(arr[i-1]<=j){
                      dp[i][j]=dp[i-1][j] || dp[i-1][j-arr[i-1]];
                  }else if(arr[i-1]>j){
                      dp[i][j]=dp[i-1][j];
                  }
              }
          }
          return dp[n][sum/2]==true?1:0;
      }
  }