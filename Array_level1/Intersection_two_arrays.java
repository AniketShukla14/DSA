
class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        int ans=0;
        HashSet<Integer> hm=new HashSet<>();
        for(int i=0;i<m;i++)
        {
            hm.add(b[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(hm.contains(a[i]))
            {
                ans++;
                hm.remove(a[i]); // Most important line of the code , it removes repetition 
            }
        }
        return ans;
    }
};
