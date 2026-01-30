class MyLinkedList {

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    int size;
    Node head;

    public MyLinkedList() {
        size = 0;
        head = null;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.data;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(val);
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;

        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }

        Node newNode = new Node(val);
        newNode.next = curr.next;
        curr.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        if (index == 0) {
            head = head.next;
            size--;
            return;
        }

        Node curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;
        size--;
    }
}
