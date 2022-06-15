class Solution {
    int findMidSum(int[] ar1, int[] ar2, int n) {
        // code here
       int a[]=new int[n+n];
       int i=0;
        for(int k:ar1)
       {
            a[i++]=k;
        }
        for(int l:ar2)
        {
            a[i++]=l;
        }
        Arrays.sort(a);
        int mid=i/2;
        return a[mid]+a[mid-1];
    }
}