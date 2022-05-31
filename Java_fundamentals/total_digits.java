class Solution {
    static long totalDigits(long n){
        // code here
     String s;
     int count=0;
     for(long i=1;i<=n;i++)
     {
         s=Integer.toString((int)i);
         count+=s.length();
         
     }
     return count;
     
    }
}