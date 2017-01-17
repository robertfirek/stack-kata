public class Stack {
    private Object pushed;

    public Object pop() {
        if (this.isEmpty()) {
            throw new IllegalArgumentException("you can not pop an empty stack");
        }
        return pushed;
    }

    private boolean isEmpty() {
        return pushed == null;
    }

    public void push(Object pushed) {
        this.pushed = pushed;
    }
}
