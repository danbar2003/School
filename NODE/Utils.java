package NODE;


public class Utils {

    public static boolean isCircled(Node<?> chain) {
        Node<?> pos1 = chain;
        Node<?> pos2 = chain;
        while (pos2.hasNext() && pos2.getNextNode().hasNext()) {
            pos2 = pos2.getNextNode().getNextNode();
            pos1 = pos1.getNextNode();
            if (pos1 == pos2)
                return true;
        }
        return false;
    }

    private static <T> Node<T> findMeetingNode(Node<T> chain) {
        Node<T> pos1 = chain;
        Node<T> pos2 = chain;
        if (isCircled(chain)) {
            while (pos2.hasNext() && pos2.getNextNode().hasNext()) {
                pos2 = pos2.getNextNode().getNextNode();
                pos1 = pos1.getNextNode();
                if (pos1 == pos2)
                    return pos1;
            }
        }
        return null;
    }

    public static <T> Node<T> getStartLoop(Node<T> chain) {
        Node<T> meetingNode;
        Node<T> pos2 = chain;
        if (isCircled(chain)) {
            meetingNode = findMeetingNode(chain);
            //TODO
        }
        return null;
    }

    public static boolean isAlphaBet(Node<String> chain) {

        while (chain.hasNext()) {
            Node<String> pos = chain;
            while (pos.hasNext()) {
                pos = pos.getNextNode();
                if (chain.getValue().compareTo(pos.getValue()) > 0)
                    return false;
            }
            chain = chain.getNextNode();
        }
        return true;
    }

    public static <T extends Comparable<T>> T maxValueInChan(Node<T> chain) {
        T max = chain.getValue();
        chain = chain.getNextNode();
        while (chain.hasNext()) {
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

    public static Node<Integer> getIntChain(int n) {
        Node<Integer> chain = new Node<Integer>(n);
        for (int i = n; i > 1; i--) {
            chain = new Node<Integer>(n - 1, chain);
        }
        return chain;
    }

    public static <T> void printChain(Node<T> chain) {
        while (chain.hasNext()) {
            System.out.print(chain.getValue() + "--> ");
            chain = chain.getNextNode();
        }
        System.out.println(chain.getValue());
    }

    //chain is not circled
    public static int chainLength(Node<?> chain) {
        if (isCircled(chain))
            return -1;
        int counter = 0;
        while (chain.hasNext()) {
            counter++;
            chain = chain.getNextNode();
        }
        return counter;
    }

    //both chains should not be circled
    private static <T> Node<T> findMeetingNode(Node<T> chain1, Node<T> chain2) {
        int difference = Math.abs(chainLength(chain1) - chainLength(chain2));

        if (chainLength(chain1) > chainLength(chain2)) {
            for (int i = 0; i < difference; i++) {
                chain1 = chain1.getNextNode();
            }
        } else {
            for (int i = 0; i < difference; i++) {
                chain2 = chain2.getNextNode();
            }
        }

        while (chain1 != chain2) {
            if (chain1.hasNext() && chain2.hasNext()) {
                chain1 = chain1.getNextNode();
                chain2 = chain2.getNextNode();
            } else {
                return null;
            }
        }
        return chain1;
    }

    private static <T> Node<T> findNodeBefore(Node<T> chain, Node<T> node) {
        while (chain.hasNext()) {
            if (chain.getNextNode() == node)
                return chain;
            chain = chain.getNextNode();
        }
        System.out.println("The chain never reaches the node");
        return null;
    }

    public <T> void breakChains(Node<T> chain1, Node<T> chain2) {
        Node<T> meetingNode = findMeetingNode(chain1, chain2);
        Node<T> beforeMeetingNode1 = findNodeBefore(chain1, meetingNode);
        Node<T> beforeMeetingNode2 = findNodeBefore(chain2, meetingNode);
        System.out.println("asd");
        if (beforeMeetingNode1 != null && beforeMeetingNode2 != null) {
            while (beforeMeetingNode1.hasNext() && beforeMeetingNode2.hasNext()) {
                beforeMeetingNode1.setNext(new Node<T>(beforeMeetingNode1.getNextNode().getValue(), beforeMeetingNode1.getNextNode().getNextNode()));
                beforeMeetingNode2.setNext(new Node<T>(beforeMeetingNode2.getNextNode().getValue(), beforeMeetingNode2.getNextNode().getNextNode()));
                beforeMeetingNode1 = beforeMeetingNode1.getNextNode();
                beforeMeetingNode2 = beforeMeetingNode2.getNextNode();
            }
        }
    }


}

