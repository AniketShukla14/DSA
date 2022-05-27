import java.io.*;

class GFG {
	public static void main (String[] args) {
	int n=5;
	int sp=n-1,st=1;
	for(int i=1;i<=n;i++)
	{
	    for(int j=1;j<=sp;j++)
	    {
	        System.out.print("\t");
	    }
	    for(int j=1;j<=st;j++)
	    {
	        System.out.print("*\t");
	    }
	    
	    sp--;
	
	    System.out.println();
	}
	
	}
}