package NODE;


public class IntNode {
    private int value;
    private IntNode next;

    public IntNode(int x) {
        this.value = x;
        this.next = null;
    }

    public IntNode(int x, IntNode next) {
        this.value = x;
        this.next = next;
    }

    public int getValue() {
        return this.value;
    }

    public IntNode getNext() {
        return this.next;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    @Override
    public String toString() {
        return "" + this.value;
    }

    public String chainToString(){
        IntNode chain = this;
        String str = "";
        while (chain.hasNext()) {
            str += chain + ", ";
            chain = chain.getNext();
        }
        str +=chain;
        return str;

    }

    public void setValue(int x) {
        this.value = x;
    }

    public void setNext(IntNode next) {
        this.next = next;
    }

    public int getLength(){
        IntNode chain = this;
        int counter = 1;
        while (chain.hasNext()){
            counter++;
            chain = chain.getNext();
        }
    return counter;
    }
}