class LinkedListImpl<T> implements LinkedList<T> {
    private Node<T> head;

    LinkedListImpl() {
        head = null;
    }

    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public void delete(T data) {
        Node<T> curr = head;
        Node<T> prev = null;
        while (curr != null && !curr.data.equals(data)) {
            prev = curr;
            curr = curr.next;
        }
        if (curr != null) {
            if (prev == null) {
                head = curr.next;
            } else {
                prev.next = curr.next;
            }
        }
    }

    public void display() {
        Node<T> curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}