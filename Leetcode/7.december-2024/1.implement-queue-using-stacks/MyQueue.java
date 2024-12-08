class MyQueue {
    
    private int[] data;
    private static int DEFAULT_SIZE = 10; 
    private int start = 0; 
    private int end = 0; 
    private int size = 0;

    public MyQueue() {
        this.data = new int[DEFAULT_SIZE];
    }

    public MyQueue(int size) {
        this.data = new int[size];
    }
    
    public void push(int v) {
        data[end] = v;
        end++;
        end %= data.length;
        size++;
    }
    
    public int pop() {
        int r = data[start];
        start++;
        start %= data.length;
        size--;
        return r;
    }
    
    public int peek() {
        return data[start];
    }
    
    public boolean empty() {
        return size == 0;  
    }
}
