class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    public LinkedList() {
        this.head = null;
    }
    public void add(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        Node curr = this.head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }
    public void remove(int data) {
        if (this.head == null) {
            return;
        }
        if (this.head.data == data) {
            this.head = this.head.next;
            return;
        }
        Node prev = this.head;
        Node curr = this.head.next;
        while (curr != null) {
            if (curr.data == data) {
                prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
    public boolean search(int data) {
        Node curr = this.head;
        while (curr != null) {
            if (curr.data == data) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
}
