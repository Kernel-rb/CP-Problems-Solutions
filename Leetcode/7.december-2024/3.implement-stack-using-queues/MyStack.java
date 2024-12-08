class MyStack {

    private int[] data;
    private int DEFAULT_SIZE = 10;
    private int ptr = -1;

    public MyStack() {
        this.data = new int[DEFAULT_SIZE];   
    }
    
    public void push(int v) {
        ptr++;
        data[ptr] = v; 
    }
    
    public int pop() {
        return data[ptr--];        
    }
    
    public int top() {
        return data[ptr];
    }
    
    public boolean empty() {
        return ptr == -1;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
