class MinStack
{

    Stack<Integer> st, minst;

    public MinStack()
    {
        this.st = new Stack<Integer>();
        this.minst = new Stack<Integer>();
    }
    
    public void push(int val)
    {
        if (this.st.isEmpty())
        {
            this.minst.push(val);
        }
        else
        {
            if (this.minst.peek() >= val)
                this.minst.push(val);
        }
        this.st.push(val);
    }
    
    public void pop()
    {
        int a = this.st.pop();
        if (this.minst.peek() == a)
            this.minst.pop();
    }
    
    public int top()
    {
        return this.st.peek();
    }
    
    public int getMin()
    {
        return this.minst.peek();
    }
}
