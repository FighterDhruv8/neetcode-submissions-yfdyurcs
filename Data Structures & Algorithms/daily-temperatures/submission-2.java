class Solution
{
    public int[] dailyTemperatures(int[] temperatures)
    {
        Stack<Integer> st = new Stack<Integer>();
        int[] res = new int[temperatures.length];
        for(int i = 0 ; i < temperatures.length ; i++ )
        {
            int a = 0;
            while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i])
            {
                a = st.pop();
                res[a] = i-a;
            }
            st.push(i);
        }
        return res;
    }
}
