class Solution {
    static String armstrongNumber(int n){
        // code here
        int sum=0,digit=0;
        int p=n;
        while(p!=0)
        {
            digit++;
            p/=10;
        }
        p=n;
        while(p!=0)
        {
            int rem=p%10;
            sum+=Math.pow(rem,digit);
            p=p/10;

        }
        if(sum==n)
        return "Yes";
        else 
        return "No";
    }
}
