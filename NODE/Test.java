package NODE;

public class Test {
    public static void main(String[] args) {
        Node<Object> chain = new Node<>(5);
        Node<Object> temp = chain;
        for (int i = 0; i < 10; i++) {
            temp.setNext(new Node<>(i));
            temp = temp.getNextNode();
        }
        temp.setNext(chain);

        System.out.println(Utils.isCircled(chain));
    }
}
