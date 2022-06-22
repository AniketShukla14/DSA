class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        // add your code here
    HashSet<Integer> set=new HashSet<>();
    for(int i=0;i<head1.size();i++)
    {
        set.add(head1.get(i));
    }
    int count=0;
    for(int i=0;i<head2.size();i++)
    {
        int num=x-head2.get(i);
        if(set.contains(num))
        {
            count++;
        }
    }
    return count ;
    }
}
