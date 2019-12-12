package NODE;

public class BinaryNode<T> {
    private T value;
    private BinaryNode<T> nextNode1;
    private BinaryNode<T> nextNode2;

    public BinaryNode(T value) {
        this(value, null, null);
    }

    public BinaryNode(T value, BinaryNode<T> nextNode1) {
        this(value, nextNode1, null);
    }

    public BinaryNode(T value, BinaryNode<T> nextNode1, BinaryNode<T> nextNode2) {
        this.value = value;
        this.nextNode1 = nextNode1;
        this.nextNode2 = nextNode2;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public BinaryNode<T> getNextNode1() {
        return nextNode1;
    }

    public void setNextNode1(BinaryNode<T> nextNode1) {
        this.nextNode1 = nextNode1;
    }

    public BinaryNode<T> getNextNode2() {
        return nextNode2;
    }

    public void setNextNode2(BinaryNode<T> nextNode2) {
        this.nextNode2 = nextNode2;
    }
}