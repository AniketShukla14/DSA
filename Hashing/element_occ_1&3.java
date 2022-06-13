
class Solution {
    static int singleElement(int[] arr , int N) {
        // code here
        int ans=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<N;i++)
        {
            if(!hm.containsKey(arr[i]))
            {
                hm.put(arr[i],1);
            }
            else 
            {
                hm.put(arr[i],hm.getOrDefault(arr[i],0) + 1);
            }
        }
        for(int i=0;i<N;i++)
        {
            if(hm.get(arr[i])==1)
            {
                ans=arr[i];
            }
            else if(hm.get(arr[i])==3)
            continue;
            else 
            {
                ans=-1;
            }
        }
        return ans;
    }
}