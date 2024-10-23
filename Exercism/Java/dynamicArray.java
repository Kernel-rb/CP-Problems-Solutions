class dynamicArray {
    int size; 
    int capacity = 10; 
    Object[] arr;

    public dynamicArray() {
        this.arr = new Object[this.capacity];
    }
    
    public dynamicArray(int capacity) {
        this.arr = new Object[capacity];
    }
    
    public void add(Object data) {
        if (size >= capacity) {
            g();
        }
        arr[size] = data;
        size++;
    }
    
    public void insert(int idx, Object data) {
        if (size >= capacity) {
            g();
        }
        for (int i = size; i > idx; i--) {
            arr[i] = arr[i - 1];
        }
        arr[idx] = data;
        size++;
    }
     
    public void delete(Object data) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(data)) {
                for (int j = 0; j < size - i - 1; j++) {
                    arr[i + j] = arr[i + j + 1];
                }
                arr[size - 1] = null;
                size--;
                if (size <= (int) capacity / 3) {
                    shrink();
                }
                break;
            }
        }
    }
    
    public int search(Object data) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }
    
    private void g() {
        int nCapacity = (int)(capacity * 2);
        Object[] nArr = new Object[nCapacity];
        for (int i = 0; i < size; i++) {
            nArr[i] = arr[i];
        }
        capacity = nCapacity;
        arr = nArr;
    }
    
    private void shrink() {
        int nCapacity = (int)(capacity / 2);
        Object[] nArr = new Object[nCapacity];
        for (int i = 0; i < size; i++) {
            nArr[i] = arr[i];
        }
        capacity = nCapacity;
        arr = nArr;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s += arr[i] + ",";
        }
        if (!s.equals("")) {
            s = "[" + s.substring(0, s.length() - 1) + "]";
        } else {
            s = "[]";
        }
        return s;
    }
}
