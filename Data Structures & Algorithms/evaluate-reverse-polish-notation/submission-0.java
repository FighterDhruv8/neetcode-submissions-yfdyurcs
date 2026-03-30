class Solution
{
    public int evalRPN(String[] tokens)
    {
        Stack<Integer> st = new Stack<>();
        for (int i = 0 ; i < tokens.length ; i++ )
        {
            String s = tokens[i];

            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))  // Operator
            {
                int b = st.pop();
                int a = st.pop();
                int res = 0;
                if (s.equals("+"))
                    res = a+b;
                else if (s.equals("-"))
                    res = a-b;
                else if (s.equals("*"))
                    res = a*b;
                else if (s.equals("/"))
                    res = a/b;
                st.push(res);
            }
            else
                st.push(Integer.valueOf(s));
        }
        return st.pop();
    }
}
