
class Solution
{
    public int minimum_difference(int[] arr)
    {
        // code here
        int min=Integer.MAX_VALUE;
        Arrays.sort(arr);
    int i=0;
    while(i<arr.length-1)
    {
        int rem=arr[i+1]-arr[i];
        if(min>rem)
        min=rem;
        i++;
    }
    return min;
    }
}