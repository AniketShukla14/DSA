class Solution
{
    public void countOddEven(int[] arr, int n)
    {
        // Code here
        int e=0,o=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            e++;
            else 
            o++;
        }
        System.out.println(o+" "+e);
    }
}