
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int[] arr1=new int[n1];
		int[] arr2=new int[n2];
		for(int i=0;i<n1;i++){
		    arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n2;i++){
		    arr2[i]=sc.nextInt();
		}
		int i=0;
		int j=0;
		int k=0;
		int[] ArrMix=new int[arr1.length+arr2.length];
		while(i<arr1.length && j<arr2.length){
		    ArrMix[k]=arr1[i];
		    i++;
		    k++;
		    ArrMix[k]=arr2[j];
		    j++;
		    k++;
		}
		while(i<arr1.length){
		    ArrMix[k]=arr1[i];
		    i++;
		    k++;
		}
		while(j<arr2.length){
		    ArrMix[k]=arr2[j];
		    j++;
		    k++;
		}
		for(int temp:ArrMix){
		    System.out.print(temp+" ");
		}
		
	}
}
