package no155.min_stack;

public class Main {
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(15);
        stack.push(12);
        stack.push(10);
        stack.push(20);
        stack.push(24);
        stack.push(8);
        stack.push(18);
        stack.push(25);

        stack.print();
    }
}
