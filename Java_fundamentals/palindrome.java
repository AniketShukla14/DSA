class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
          int temp = n;
     int reverse = 0;
     
     while(temp !=0){
         
         int r = temp %10; 
         reverse = (reverse * 10) + r;
         temp = temp / 10;
     }
     return (n == reverse)?"Yes":"No";
     
 }
}