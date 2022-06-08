
class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        boolean status=true;
        if(a.length()!=b.length())
        return false;
        char [] char1=a.toCharArray();
        char [] char2=b.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
      status =Arrays.equals(char1,char2);
        return status;
        
    }
}