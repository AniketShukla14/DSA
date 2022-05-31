class gfg{
public static int[] nextgreater(int arr[],int n)
{
    Stack<Integer> st=new Stack<>();
    int a[]=new int[n];
    for(int i=n-1;i>=0;i++)
    {
        if(st.size()==0)
        st.push(-1)
        else if(st.size()>0&& st.peek()>arr[i])
        {
            a[i]=st.peek();
        }
        else if(st.size()>0 && st.peek()<arr[i])
        {
            while(st.size()>0 && st.peek()<arr[i])
            {
                st.pop();
                if(st.size()==0)
                a[i]=-1;
                else 
                a[i]=st.peek();
            }
        }
        st.push(arr[i]);
    }
    return a;
}
}