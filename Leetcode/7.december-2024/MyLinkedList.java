class MyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        this.size = 0;
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public int get(int index) {
        if (index >= size || index < 0) return -1;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next; 
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        if (head == null) {
            head = new Node(val);
            tail = head;
            size++;
            return;
        }
        Node newNode = new Node(val, head);
        head = newNode;
        size++;
    }
    
    public void addAtTail(int val) {
        if (tail == null) {
            tail = new Node(val);
            head = tail;
            size++;
            return;
        }
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size || index < 0) return;
        if (index == 0) {
            addAtHead(val);
            return; 
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        Node prevNode = head;
        for (int i = 0; i < index - 1; i++) {
            prevNode = prevNode.next;
        }
        Node newNode = new Node(val, prevNode.next);
        prevNode.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index >= size || index < 0) return;
        if (index == 0) {
            head = head.next; 
            if (head == null) {
                tail = null;
            }
            size--;
            return;
        }
        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        if (index == size - 1) {
            tail = prev;
            prev.next = null;
        } else {
            prev.next = prev.next.next;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index, val);
 * obj.deleteAtIndex(index);
*/