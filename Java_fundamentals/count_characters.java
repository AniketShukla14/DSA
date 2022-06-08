class Sol
{
    int getCount (String S, int N)
    {
        // your code here
        HashMap<Character,Integer> map=new HashMap<>();
        char prev='#';
        //int count =0;
        for(char c:S.toCharArray())
        {
            if(prev!=c)
            {
                map.put(c,map.getOrDefault(c,0)+ 1);
            }
            prev=c;
        }
        int count =0;
        for(Character c:map.keySet())
        {
            if(map.get(c)==N)
            count++;
        }
        return count ;
    }
} 