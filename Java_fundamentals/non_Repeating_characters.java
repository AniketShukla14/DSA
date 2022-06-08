class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        char prev='#';
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:S.toCharArray())
        {
        map.put(c,map.getOrDefault(c,0) + 1);
          }
        
          for(char ch:S.toCharArray())
          {
              if(map.get(ch)==1)
              {
                  return ch;
                
              }
          }
          return '$';
    }
}