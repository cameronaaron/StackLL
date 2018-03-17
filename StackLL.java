public class StackLL {
    private int n;
    private Node head;
    private Node temp;

    public StackLL() {
        n = 0;
        head = null;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public Node pop() {
        Node x = head;
        head = head.getNext();
        n--;
        return x;

    }

    public Node top() {
        return head;

    }

    public void push(Node xNode) {
        Node temp = head;
        head = new Node();
        head.setNext(temp);
        n++;
    }

    public void printStack() {
        System.out.println(n);
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getKey());
            temp = temp.getNext();

        }
    }

}





