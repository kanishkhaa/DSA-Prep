class Node {
    int key;
    Node next;
    Node(int key) {
        this.key = key;
        this.next = null;
    }
}
class MyHashSet {
  private Node[] set;
    public MyHashSet() {
        set = new Node[1000];
        for(int i = 0; i<1000 ; i++) {
            set[i] = new Node(-1);
        }
    }
    
    public void add(int key) {
        int hash = hash(key);
        Node curr = set[hash];
        while(curr.next != null) {
            if(curr.next.key == key) {
                return;
            }
            curr = curr.next;
        }
        curr.next = new Node(key);
    }
    
    public void remove(int key) {
        int hash = hash(key);
        Node curr = set[hash];
        while(curr.next != null) {
            if(curr.next.key == key) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }
    
    public boolean contains(int key) {
        int hash = hash(key);
        Node curr = set[hash];
        while(curr.next != null) {
            if(curr.next.key == key) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
    private int hash(int key) {
        return key % 1000;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */