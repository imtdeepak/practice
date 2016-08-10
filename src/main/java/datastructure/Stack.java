package datastructure;

import java.util.NoSuchElementException;

/**
 * Created by deepak.kumar on 2/24/16.
 */
public class Stack<T> {
    Node head;

    public boolean isEmpty()
    {
        return head == null;
    }
    public T pop()
    {
        if(head == null) {
            throw new NoSuchElementException();
        }
        T data = head.data;
        head = head.next;
        return data;
    }

    public T peek()
    {
        if(head == null) {
            throw new NoSuchElementException();
        }
        return head.data;
    }
    public void push(T i)
    {
        Node node = new Node();
        node.data = i;
        node.next = head;
        head = node;
    }

    private class Node{
        T data;
        Node next;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        System.out.println("Poping from stack");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
