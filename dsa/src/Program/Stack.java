package Program;

public class Stack<t> {
    int count = 0;
    private node start = null, current = null;

    public Stack() {
        start = null;
        current = null;
        count = 0;

    }

    public void push(t item) {
        node temp = new node(item, start);
        start = temp;
        count++;
    }

    //method to get value form stack and then remove it
    public t pop() {
        t x = null;
        if (start != null) {
            x = start.item;
            start = start.link;
            count--;
        }
        return x;
    }

    //peeking top values of stack without removing the value
    public t peek() {
        t x = start.item;
        return x;
    }

    public int length() {

        return count;
    }

    //getting length of stack

    private class node {
        protected t item;
        protected node link;

        node(t item, node link) {
            this.item = item;
            this.link = link;
        }
    }
}
