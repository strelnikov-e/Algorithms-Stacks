import java.util.Arrays;

/*
advanced implementation with resizable array
double the size of  the array if full;
half the size of the array if 1/4 of size;
uses around 8N to 32N to represent a stack;
*/
public class StackArrayAdv {
    String[] stack;
    private int pointer = 0;

    public StackArrayAdv() {
        stack = new String[1];
    }

    public String pop() {
        String value = stack[--pointer];
        stack[pointer] = null;
        if ((pointer > 0) && (stack.length / 4 == pointer)) {
            resize(stack.length / 2);
        }
        return value;
    }

    public void push(String item) {
        if (stack.length == pointer) {
            resize(stack.length * 2);
        }
        stack[pointer++] = item;
    }

    public boolean isEmpty() {
        return stack[0] == null;
    }

    private void resize(int length) {
        String[] newStack = new String[length];
        for (int i = 0; i < pointer; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

    private void incSize() {
        String[] newStack = new String[stack.length * 2];
        for (int i = 0; i < pointer; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

    private void decSize() {
        String[] newStack = new String[stack.length / 2];
        for (int i = 0; i <= pointer; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

    @Override
    public String toString() {
        return "StackArray {" + Arrays.toString(stack) +
                ", pointer=" + pointer +
                '}';
    }
}

