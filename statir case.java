class Solution
{
    public int nthPoint(int n)
    {
        // Code here
        int ans=climbingStairs(n,new int[n+1]);
        return ans%1000000007;
    
        
    }
    public  static int climbingStairs(int n ,int[]dp){
        if(n == 0 || n==1) return 1;
        if (n < 0) return 0;
		if(dp[n] != 0) return dp[n];
        int oneStep = climbingStairs(n-1,dp)  %1000000007;
        int twoSteps = climbingStairs(n-2,dp) %1000000007;
// 		int treeStep = climbingStairs(n-3,dp);
        int res=oneStep+twoSteps;
      
        dp[n]=res;
        return res;
    }
}