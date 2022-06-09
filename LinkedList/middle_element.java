class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
       Node p = head;
        int i =0;
        int count =1;
        while(p.next!=null){
           p = p.next;
           count++;
        }
     
        i = (count/2)+1;
        
        for(int j =1; j<i; j++)
        head = head.next;
        
        int val = head.data;
        return val;
    }
}