package NODE;

public class Test {
    public static void main(String[] args) {
        Node<Integer> meetingNode = new Node<Integer>(32);

        Node<Integer> chain = new Node<Integer>(123, new Node<Integer>(
                5, new Node<Integer>(7, new Node<Integer>(-65, meetingNode))));

        Node<Integer> chain1 = new Node<Integer>(932, new Node<Integer>(
                93, new Node<Integer>(75, new Node<Integer>(-81, meetingNode))));

        meetingNode.setNext(new Node<Integer>(999, new Node<Integer>(
                666, new Node<Integer>(5312, new Node<Integer>(-5123)))));
    }
}
