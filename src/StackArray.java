import java.util.Arrays;

//Basic stack implementation with fixed array
public class StackArray {
    String[] stack;
    private int pointer = 0;

    public StackArray(int size) {
        stack = new String[size];
    }

    public String pop() {
        return stack[--pointer];
    }

    public void push(String item) {
        stack[pointer++] = item;
    }

    public boolean isEmpty() {
        return stack[0] == null;
    }

    @Override
    public String toString() {
        return "StackArray{" +
                "stack=" + Arrays.toString(stack) +
                ", pointer=" + pointer +
                '}';
    }
}
