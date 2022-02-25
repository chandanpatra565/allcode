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

class Main {
	public static void main(String[] args) throws IOException
	{
            Scanner sc=new Scanner(System.in);
            long N=sc.nextLong();
            long[] a=new long[(int)N];
            for(int i=0;i<a.length;i++){
                a[i]=sc.nextLong();
            }
            long k=sc.nextLong();
            Solution obj = new Solution();
            pair ans = obj.indexes(a, k);
            if (ans.first == -1 && ans.second == -1)
                System.out.println(-1);
            else
                System.out.println(ans.first+" "+ans.second);
            
        
	}
}
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
