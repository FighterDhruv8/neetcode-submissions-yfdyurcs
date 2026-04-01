class Pair
{
    int x;
    int y;

    Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString()
    {
        return "(Position = " + x + ", Speed = " + y + ")";
    }
}

class Solution
{
    public int carFleet(int target, int[] position, int[] speed)
    {
    //     Pair[] pairs = new Pair[position.length];
    //     for(int i = 0 ; i < position.length ; i++ )
    //         pairs[i] = new Pair(position[i], speed[i]);

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < position.length ; i++ )
            map.put(position[i], speed[i]);
        Arrays.sort(position);
        Stack<Float> st = new Stack<Float>();
        for(int i = position.length -1 ; i >= 0 ; i-- )
        {
            float turns = (target - position[i])/(float)map.get(position[i]);
            if(st.size() >= 1 && st.peek() >= turns)
                continue;
            st.push(turns);
        }

        return st.size();
    }
}
