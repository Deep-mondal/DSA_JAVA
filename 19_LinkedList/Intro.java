class MyLinkedList {

    private class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;
    private int length;

    public MyLinkedList() {
        length = 0;
        head = null;
        tail = null;
    }
    
    public int get(int index) {
        if (index < 0 || index >= length) {
            return -1;
        }

        Node currNode;
        if (index < length / 2) {
            currNode = head;
            for (int i = 0; i < index; i++) {
                currNode = currNode.next;
            }
        } else {
            currNode = tail;
            for (int i = length - 1; i > index; i--) {
                currNode = currNode.prev;
            }
        }

        return currNode.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > length) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
        } else if (index == length) {
            addAtTail(val);
        } else {
            Node newNode = new Node(val);
            Node currNode = head;
            for (int i = 0; i < index; i++) {
                currNode = currNode.next;
            }
            newNode.prev = currNode.prev;
            newNode.next = currNode;
            currNode.prev.next = newNode;
            currNode.prev = newNode;
            length++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= length) {
            return;
        }
        if (index == 0) {
            if (length == 1) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        } else if (index == length - 1) {
            tail = tail.prev;
            tail.next = null;
        } else {
            Node currNode = head;
            for (int i = 0; i < index; i++) {
                currNode = currNode.next;
            }
            currNode.prev.next = currNode.next;
            if (currNode.next != null) {
                currNode.next.prev = currNode.prev;
            }
        }
        length--;
    }
}