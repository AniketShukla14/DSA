
class Solution {
    static int isPerfectNumber(Long n) {
        // code here
      long sum = 1;

   // Find all divisors and add them
   for (int i = 2; i<=Math.sqrt(n); i++)  
   {
         if (n%i==0)
       {
       
               sum = sum + i + n/i;
 
       }
   }
   // If sum of divisors is equal to
   // n, then n is a perfect number
   if (sum == n && n != 1)
       return 1;

   return 0;
   }
};