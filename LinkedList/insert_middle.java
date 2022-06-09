class Solution {
    
    public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        Node fast=head;
        Node slow=head;
        Node node =new Node(data);
        while(fast.next!=null && fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            
        }
        node.next=slow.next;
        slow.next=node;
        return head;
    }
}