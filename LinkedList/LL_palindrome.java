class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        ArrayList<Integer> list=new ArrayList<>();
        Node temp=head;
        while(temp!=null)
        {
            list.add(temp.data);
            temp=temp.next;
        }
        int i=0;
        int j=list.size()-1;
        while(i<j)
        {
            if(list.get(i)!=list.get(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }    
}
