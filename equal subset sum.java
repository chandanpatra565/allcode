class Solution{
    static int equalPartition(int N, int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        if(sum%2!=0) return 0;
        
        int[][] dp=new int[N+1][(sum/2)+1];
                for (int i = 0; i < dp.length; i++) {
                    Arrays.fill(dp[i], -1);
                }
        return equalpartition(sum/2,arr,0,dp);
    
    }
    public static int equalpartition(int s,int[] arr,int i,int[][] dp){
        if(i==arr.length){
            if(s==0){
                return 1;
            }
            return 0;
        }
        // if(s<0) return 0;
        if(s==0) return 1;
        
        if(dp[i][s] != -1) return dp[i][s];
        
        int sel= s>= arr[i] ? equalpartition(s-arr[i],arr,i+1,dp) : 0;
        
        int rej=equalpartition(s,arr,i+1,dp);
        
        return dp[i][s]=Math.max(sel,rej);
       
    }
}