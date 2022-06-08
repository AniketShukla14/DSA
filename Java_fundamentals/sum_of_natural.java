class Solution{
    public static sum(int n)
    {
        int sum=0;
        if(n==0)
        return n;
        return n+sum(n-1);
    }
}