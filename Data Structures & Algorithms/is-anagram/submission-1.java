class Solution
{
    public boolean isAnagram(String s, String t)
    {
        int len1 = s.length(), len2 = t.length();
        if (len1 != len2)
            return false;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0 ; i < len1 ; i++ )
        {
            char ch = s.charAt(i);
            if (map.get(ch) != null)
                map.put(ch, map.get(ch)+1);
            else
                map.put(ch, 1);
        }
        for (int i = 0 ; i < len2 ; i++ )
        {
            char ch = t.charAt(i);
            if(map.get(ch) != null)
            {
                if (map.get(ch) == 1)
                    map.remove(ch);
                else
                    map.put(ch, map.get(ch)-1);
            }
            else
                return false;
        }  
        if (map.size() != 0)
            return false;
        else
            return true;      
    }
}
