class Solution {
    static long nthFibonacci(long n){
        // code here
        long a=0;
        long b=1;
        long c=0;
        for(long i=0;i<n;i++)
        {
            c=(a+b)%1000000007;
            a=b;
            b=c;
        }
        return a;
    }
}