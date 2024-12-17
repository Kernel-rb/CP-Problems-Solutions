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

    public  Node( int val){
      this.val = val;
      this.next = null;
    }

    public Node(int val , Node next){
      this.val = val;
      this.next = next;
    }
  }

  public int get(int index) {
    if(index > size || index < 0) return -1;
    Node temp = head;
    for(int i =  0 ; i < index - 1; i++){
      temp = temp.next; 
    }
    if(temp == null) return -1;
    return temp.val;
  }
    
  public void addAtHead(int val) {

  }
    
  public void addAtTail(int val) {
  }
    
  public void addAtIndex(int index, int val) {
        
  }
    
  public void deleteAtIndex(int index) {
        
  }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
