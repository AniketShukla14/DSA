class Solution
{
    public long reverse_digit(long n)
    {
     long num=0;
        while(n!=0)
        {
            long a=n%10;
            num=(num*10)+a;
            n=n/10;
           
        }
        return num;
    }
}