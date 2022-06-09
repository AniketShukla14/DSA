class Solution
{
    public static Node findIntersection(Node head1, Node head2)
    {
        Node dummy =new Node(-1);
        Node temp=dummy;
        HashMap<Integer, Integer> map=new HashMap<>();
        Node temp1=head1;
        Node temp2=head2;
        while(temp2!=null)
        {
             map.put(temp2.data,map.getOrDefault(temp2.data,0) + 1);
             temp2=temp2.next;
        }
        while(temp1!=null)
        {
            if(map.containsKey(temp1.data))
            {
               temp.next=new Node(temp1.data);
               temp=temp.next;
            }
            temp1=temp1.next;
        }
        return dummy.next;
    }
}