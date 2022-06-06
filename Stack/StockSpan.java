class Solution
{
    public static int[] calculateSpan(int price[], int n)
  {
        Stack<Integer>st=new Stack<>();
        int s[]=new int[n];
        st.push(0);
        s[0]=1;
        for(int i=1;i<n;i++)
        {
            while(st.size()>0 && price[st.peek()]<=price[i])
            {
                st.pop();
            }
            if(st.size()==0)
            {
                s[i]=i+1;
            }
            else 
            {
                s[i]=i-st.peek();
            }
            st.push(i);
        }
        return s;
    }
}