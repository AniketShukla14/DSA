import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0)
	 {
	     int n=sc.nextInt();
	     int arr[]=new int[n];
	     for(int i=0;i<n;i++)
	     {
	         arr[i]=sc.nextInt();
	     }
	     int start=0;
	     int end=n-1;
	     while(start<end)
	     {
	         int temp=arr[start];
	         arr[start]=arr[end];
	         arr[end]=temp;
	         start++;
	         end--;
	     }
	     
	     for(int j=0;j<n;j++)
	     {
	         System.out.print(arr[j]+" ");
	         
	     }
	     System.out.println();
	    
	 }
	 }
}