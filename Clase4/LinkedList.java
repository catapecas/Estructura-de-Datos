public class LinkedList {
    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void add(Object o) {
        if ((head == null)) {
            head = new Node(o);

        } else {
            Node newHead = new Node(o);
            newHead.setNextnNode(head);
            head = newHead;
        }
    }

    public String toString() {
        Node iter = head;
        String retuString = "";
        while (iter != null) {
            retuString = retuString + " , " + iter.getData();
            iter = iter.getNextnNode();

        }
        return retuString;
    }

    public int size() {
        Node iter = head;
        int size = 0;
        while (iter != null) {
            size++;
            iter = iter.getNextnNode();
        }
        return size;

    }
}