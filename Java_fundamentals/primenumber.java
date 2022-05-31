
class Solution{
   static int isPrime(int N){
       // code here
       int count=2;
       if(N==1)
       return 0;
       for(int i=2;i*i<=N;i++)
       {
           if(N%i==0)
           {
           count++;
           break;
           }
       }
       if(count !=2 )
       return 0;
       else 
       return 1;
   }
}