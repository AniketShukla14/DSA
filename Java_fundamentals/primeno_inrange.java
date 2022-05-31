class Solution {
    ArrayList<Integer> primeRange(int M, int N) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
         if(M==1)
            M=M+1;
        for(int low=M;low<=N;low++)
        {
            int count=0;
           
            for(int i=2;i*i<=low;i++)
            {
                if(low%i==0)
                {
                    count++;
                    break;
                }
               
            }
             if(count==0)
             arr.add(low);
        }
        return arr;
    }
}