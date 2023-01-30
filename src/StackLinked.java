public class StackLinked {
    // stack implementation using linked nodes (for string data type)
    // uses around 40N memory to represent a stack;
    private Node first = null;

    public static void main(String[] args) {
        String one = "one";
        String two = "two";
        String three = "three";
        String four = "four";
        String five = "five";

        StackLinked stack = new StackLinked();

        System.out.println(stack);
        stack.push(one);
        System.out.println(stack);
        System.out.println("pop: " + stack.pop());
        System.out.println(stack);
        stack.push(four);
        System.out.println(stack);
        stack.push(two);
        System.out.println(stack);
        stack.push(three);
        stack.push(four);
        System.out.println(stack);
        stack.push(five);
        System.out.println(stack);
        System.out.println("pop: " + stack.pop());
        System.out.println(stack);
        System.out.println("pop: " + stack.pop());
        System.out.println(stack);
        stack.push(five);
        System.out.println(stack);
        System.out.println("pop: " + stack.pop());
        System.out.println(stack);
        System.out.println("pop: " + stack.pop());
        System.out.println(stack);
        System.out.println("pop: " + stack.pop());
        System.out.println(stack);
        System.out.println("pop: " + stack.pop());
        System.out.println(stack);
        System.out.println("pop: " + stack.pop());
        System.out.println(stack);


    }

    public void push(String item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    public String pop() {
        String item = first.item;
        first = first.next;
        System.out.println(item);
        return item;
    }

    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public String toString() {
        return first != null ? first.toString() : null;
    }

    private class Node {
        String item;
        Node next;

        @Override
        public String toString() {
            StringBuilder toString = new StringBuilder();
            toString.append("{");
            toString.append(item);
            while (next != null) {
                toString.append(",");
                toString.append(next.item);
                next = next.next;
            }
            toString.append("}");
            return toString.toString();
        }
    }
}
