class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code here'
        int p=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                 map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
            }
            else 
            map.put(arr[i],1);
        }
        for(int i=0;i<map.size();i++)
        {
            if(map.get(arr[i])>1)
            {
                p=i+1;
                break;
            }
        }
        return p;
    }
}