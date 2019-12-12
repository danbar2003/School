package NODE;


import java.util.function.ToDoubleBiFunction;

public class Utils {

    public static boolean isCircled(Node<?> chain){
        Node<?> pos1 = chain;
        Node<?> pos2 = chain;
            while (pos2.hasNext() && pos2.getNextNode().hasNext()){
                pos2 = pos2.getNextNode().getNextNode();
                pos1 = pos1.getNextNode();
                if (pos1 == pos2)
                    return true;
            }
        return false;
    }

    private static <T> Node<T> findMeetingNode(Node<T> chain){
        Node<T> pos1 = chain;
        Node<T> pos2 = chain;
        if(isCircled(chain)){
            while (pos2.hasNext() && pos2.getNextNode().hasNext()){
                pos2 = pos2.getNextNode().getNextNode();
                pos1 = pos1.getNextNode();
                if (pos1 == pos2)
                    return pos1;
            }
        }
        return null;
    }

    private static int loopLength(Node<?> nodeInLoop){
        Node<?> pos = nodeInLoop;
        int counter = 1;
        pos = pos.getNextNode();
        while (pos != nodeInLoop){
            counter++;
            pos = pos.getNextNode();
        }
        return counter;
    }

    public static <T> Node<T> getStartLoop(Node<T> chain){
        Node<T> meetingNode;
        Node<T> pos2 = chain;
        if (isCircled(chain)){
            meetingNode = findMeetingNode(chain);
            //TODO
        }
        return null;
    }

    public static boolean isAlphaBet(Node<String> chain){

        while (chain.hasNext()){
            Node<String> pos = chain;
            while (pos.hasNext()){
                pos = pos.getNextNode();
                if (chain.getValue().compareTo(pos.getValue()) > 0)
                    return false;
            }
            chain = chain.getNextNode();
        }
        return true;
    }

    public static <T extends Comparable<T>> T maxValueInChan(Node<T> chain){
        T max = chain.getValue();
        chain = chain.getNextNode();
        while (chain.hasNext()){
            max = max.compareTo(chain.getValue()) >= 0 ? max : chain.getValue();
            chain = chain.getNextNode();
        }
        return max;
    }

    public static int maxValueInChane(Node<Integer> chain) {
        int max = chain.getValue();
        chain = chain.getNextNode();
        while (chain != null) {
            max = Math.max(max, chain.getValue());
            chain = chain.getNextNode();
        }
        return max;
    }

    public static int minValueInChane(Node<Integer> chain) {
        int min = 0;
        while (chain != null) {
            min = Math.min(chain.getValue(), min);
            chain = chain.getNextNode();
        }
        return min;
    }

    public static Node<Integer> getIntChain(int n){
        Node<Integer> chain = new Node<Integer>(n);
        for (int i = n; i > 1  ; i--){
            chain = new Node<Integer>(n-1, chain);
        }
        return chain;
    }

    public static <T> void printChain(Node<T> chain){
        while (chain.hasNext()){
            System.out.print(chain.getValue() + ", ");
            chain = chain.getNextNode();
        }
        System.out.println(chain.getValue());
    }
}

