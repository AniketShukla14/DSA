import java.io.*;

class GFG {
	public static void main (String[] args) {
		int n=5;
		int sp=n-1;
		int st=1;
		for(int i=0;i<n;i++)
		{
		    for(int j=1;j<=sp;j++)
		    {
		    System.out.print(" ");
		    }
		    for(int k=1;k<=st;k++)
		    {
		        System.out.print("* ");
		    }
		sp--;
		st++;
		    System.out.println();
		}
	}
}