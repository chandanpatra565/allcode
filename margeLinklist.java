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
	    int number1=sc.nextInt();
	    int number2=sc.nextInt();
	    Node head1=null;
	    Node temp1=null;
	    
	    for(int i=0;i<number1;i++){
	        Node obj=new Node();
	        obj.data=sc.nextInt();
	        
	        if(head1==null){
	            head1=obj;
	            temp1=head1;
	        }else{
	            temp1.next=obj;
	            temp1=temp1.next;
	        }
	    }
	    Node head2=null;
	    Node temp2=null;
	    for(int i=0;i<number2;i++){
	        Node obj=new Node();
	        obj.data=sc.nextInt();
	        
	        if(head2==null){
	            head2=obj;
	            temp2=head2;
	        }else{
	            temp2.next=obj;
	            temp2=temp2.next;
	        }
	    }
	    
	    Node sortNode=sortedMerge(head1,head2);
	    PrintList(sortNode);
	   // PrintList(head2);
	    
	}
	public static void PrintList(Node head){
	    while(head != null){
	    System.out.print(head.data+" ");
	    head=head.next;
	    }
	    System.out.println();
	}
	public static Node sortedMerge(Node h1, Node h2) {
     Node LL1=h1;
     Node LL2=h2;
     
     if(LL1.data>LL2.data){
         Node tmp=LL2;
         LL2=LL1;
         LL1=tmp;
     }
     Node head=LL1;
     while(LL1 != null && LL2 != null){
         Node temp=null;
         while(LL1 != null && LL1.data<=LL2.data){
             temp=LL1;
             LL1=LL1.next;
         }
         temp.next=LL2;
         Node tmp=LL2;
         LL2=LL1;
         LL1=tmp;
         
     }
     return head;
   }
}
class Node{
    int data;
    Node next;
    
}