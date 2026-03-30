class Solution
{
    public boolean isValid(String s)
    {
        Stack<Character> st = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        for (int i = 0 ; i < s.length() ; i++ )
        {
            char ch = s.charAt(i);
            if (ch == '[' || ch == '{' || ch == '(')
            {
                st.push(ch);
            }
            else
            {
                if (st.isEmpty() == true || st.peek() != map.get(ch))
                    return false;
                else
                    st.pop();
            }
        }
        return st.isEmpty();
    }
}
