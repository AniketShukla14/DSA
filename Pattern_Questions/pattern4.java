import java.io.*;

class GFG {
	public static void main (String[] args) {
	int n=5;
	int space=0;
	int st=n;
	for(int i=0;i<n;i++)
	{
	     for(int k=0;k<space;k++)
	    {
	        System.out.println("\t");
	    }
	    for(int j=0;j<st;j++)
	    {
	        System.out.print("*\t");
	    }
	    space++;
	   st--;
	   System.out.println();
	}
	}
}