class Pair
{
    int a;
    int b;

    Pair(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
}

class Solution
{
    public int carFleet(int target, int[] position, int[] speed)
    {

        int n = position.length;
        Pair[] pairs = new Pair[n];

        // Combine arrays
        for (int i = 0; i < n; i++) {
            pairs[i] = new Pair(position[i], speed[i]);
        }

        // Sort based on arr1 (a)
        Arrays.sort(pairs, (p1, p2) -> Integer.compare(p1.a, p2.a));

        // Unpack back to arrays
        for (int i = 0; i < n; i++) {
            position[i] = pairs[i].a;
            speed[i] = pairs[i].b;
        }

        Stack<Float> st = new Stack<Float>();
        for (int i = n-1 ; i >= 0 ; i-- )
        {
            float turns = (target - position[i]) / (float)speed[i];
            if (st.size() >= 1 && turns <= st.peek())
                continue;
            st.push(turns);
        }
        return st.size();
    }
}
