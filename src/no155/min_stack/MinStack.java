package no155.min_stack;

import java.util.Arrays;

public class MinStack {
    int[] stack;
    int[] minStack;
    int top;
    int min;

    public MinStack() {
        this(1000);
    }

    public MinStack(int size) {
        this.stack = new int[size];
        this.minStack = new int[size];
        this.top = 0;
        this.min = 0;
    }

    public void push(int val) {
        stack[top] = val;
        pushInMinStack(val);
        top++;
    }

    public void pop() {
        if (top == 0) throw new IllegalStateException("Empty stack!!");
        top--;
    }

    public int top() {
        if (top == 0) throw new IllegalStateException("Empty stack!!");
        return stack[top-1];
    }

    public int getMin() {
        if (top == 0) throw new IllegalStateException("Empty stack!!");
        return minStack[top-1];
    }

    private void pushInMinStack(int val) {
        if (top == 0 || minStack[top-1] > val) {
            minStack[top] = val;
        } else {
            minStack[top] = minStack[top-1];
        }
    }

    public void print() {
        System.out.println(Arrays.toString(stack));
        System.out.println(Arrays.toString(minStack));
        System.out.println("Top: " + top);
        System.out.println("Top value: " + stack[top-1]);
    }
}