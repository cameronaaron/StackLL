public class StackA {
    private int n;
    private int head;

    public StackA() {
        n = 0;

    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void pop() {


    }

    public void top() {


    }

    public void push() {

    }

    public void printStack() {
        System.out.println(n);
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(head[i].getKey());


        }
    }

}
}
