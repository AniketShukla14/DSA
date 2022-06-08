class Solution
{
    public int find(int n)
    {
        // code here
        if(n==1)
        return 1;
        int count=0;
        boolean flag=false;
        int i=1,s=0;
        while(i<n)
        {
        count++;
        s+=i;
        i++;
        if(s==n)
        {
            flag=true;
            break;
        }
        
        }
      if(flag==true)
      return count;
      
      return -1;
    }
}