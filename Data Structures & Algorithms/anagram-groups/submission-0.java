class Solution
{
    public static String letterCount(String s)
    {
        int[] arr = new int[26];
        for(int i = 0 ; i < s.length() ; i++ )
        {
            char ch = s.charAt(i);
            arr[(int)ch - 97]++;
        }
        String ns = "";
        for(int i = 0 ; i < 26 ; i++ )
        {
            if(arr[i] > 0)
            {
                ns += String.valueOf((char)(i+97))+String.valueOf(arr[i]);
            }
        }
        return ns;
    }
    public List<List<String>> groupAnagrams(String[] strs)
    {
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(int i = 0 ; i < strs.length ; i++ )
        {
            String hashed = letterCount(strs[i]);
            if (map.get(hashed) == null)
                map.put(hashed, new ArrayList<>(List.of(strs[i])));
            else
            {
                ArrayList<String> arr = map.get(hashed);
                arr.add(strs[i]);
                map.put(
                    hashed,
                    arr
                );
            }
        }
        List<List<String>> mylist = new ArrayList<>();
        for (String k: map.keySet())
        {
            mylist.add(
                map.get(k)
            );
        }
        return mylist;
    }
}
