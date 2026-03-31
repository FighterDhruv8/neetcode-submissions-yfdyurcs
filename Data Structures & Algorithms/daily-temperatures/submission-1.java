class Solution
{
    public int[] dailyTemperatures(int[] temperatures)
    {
        Stack<Integer> st = new Stack<Integer>();
        int[] res = new int[temperatures.length];
        for(int i = 0 ; i < temperatures.length ; i++ )
        {
            int today = temperatures[i];
            if(st.isEmpty() || temperatures[st.peek()] >= today)
                st.push(i);
            else
            {
                int a = 0;
                while(!st.isEmpty() && temperatures[st.peek()] < today)
                {
                    a = st.pop();
                    res[a] = i-a;
                }
                st.push(i);
            }
        }
        return res;
    }
}
