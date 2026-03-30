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
        this.st.push(val);
        if (this.minst.isEmpty() || val <= this.minst.peek())
            this.minst.push(val);
    }
    
    public void pop()
    {
        int a = this.st.pop();
        if(this.minst.peek() == a)
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
