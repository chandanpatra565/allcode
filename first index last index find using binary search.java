//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            long k = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            pair ans = obj.indexes(a, k);
            if (ans.first == -1 && ans.second == -1)
                System.out.println(-1);
            else
                System.out.println(ans.first+" "+ans.second);
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    
    public pair indexes(long v[], long x)
    {
        // Your code goes here
        long left=findocarence(v,x,true);
        long right=findocarence(v,x,false);
        pair ob=new pair(left,right);
        return ob;
    }
    public static long findocarence(long[] arr,long k,boolean flag){
        long low=0;
        long high=arr.length-1;
        long res=-1;
        while(low<=high){
            long mid=low+(high-low)/2;
            if( arr[ (int)mid] == k){
                res = mid;
                if(flag){
                    high= mid - 1;
                }else{
                    low= mid + 1;
                }
            }else if( arr[ (int)mid] > k){
                high= mid - 1;
            }else{
                low= mid + 1;
            }    
        }
        return res;
    }
    
        
    
}