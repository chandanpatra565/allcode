/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		longestPalin(s);
	}
	public static void longestPalin(String S){
        // code here
        int low=0;
        int high=0;
        
        int start=0;
        int end=0;
        int len=0;
        for(int i=1;i<S.length();i++){
            System.out.println(i);
            low=i-1;
            high=i;
            while(low>=0 && high<S.length() && S.charAt(low) == S.charAt(high)){
                if(high-low+1>len){
                    start=low;
                    end=high;
                    len=high-low+1;
                }
                System.out.println(len);
                low--;
                high++;
                System.out.println(start+" "+end+" even start end");
                System.out.println(low+" "+high+" even low high");
            }
            low=i-1;
            high=i+1;
            while(low>=0 && high<S.length() && S.charAt(low) == S.charAt(high)){
                if(high-low+1>len){
                    start=low;
                    end=high;
                    len=high-low+1;
                }
                System.out.println(len);
                low--;
                high++;
                System.out.println(start+" "+end+" odd start end");
                System.out.println(low+" "+high+" odd low high");
            }
        }
        System.out.println(S.substring(start,end+1));
        
    }
}
