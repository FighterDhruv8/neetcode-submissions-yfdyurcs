class Solution
{
    public int[] dailyTemperatures(int[] temperatures)
    {
        Stack<Integer> st = new Stack<Integer>();
        int[] result = new int[temperatures.length];
        for(int i = 0 ; i < temperatures.length ; i++ )
        {
            int today = temperatures[i];
            if(st.isEmpty() == false && today > st.peek())
            {
                Stack<Integer> copy = (Stack<Integer>)st.clone();
                int ct = 0;
                while(copy.isEmpty() == false && today > copy.peek())
                {
                    // System.out.println(ct+" "+ i);
                    ct++;
                    copy.pop();
                    if(result[i-ct] == 0)
                        result[i-ct] = ct;
                }
            }
            st.push(today);
        }
        return result;
    }
}
