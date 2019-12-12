package NODE;

public class Node<T> {
    private T value;
    private Node<T> nextNode;

    public Node(T value) {
        this.value = value;
        this.nextNode = null;
    }

    public Node(T value, Node<T> nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public boolean hasNext() {
        return this.nextNode != null;
    }

    @Override
    public String toString() {
        return this.getValue() + " " + this.getNextNode();
    }

    public void setValue(T value){
        this.value = value;
    }


    public void setNext(Node<T> next){
        this.nextNode = next;
    }
}
