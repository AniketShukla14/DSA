class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        HashSet<Integer> h=new HashSet<Integer>();
       for(int i:arr)
       {
           if(h.contains(x-i))
           return true;
           else
           h.add(i);
       }
       return false;
    }
}