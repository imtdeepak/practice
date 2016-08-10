package datastructure;

/**
 * Created by deepak.kumar on 2/24/16.
 */
public class LinkedList<T> {
    private Node head;

    public void addAtHead(T i)
    {
        Node node = new Node();
        node.data = i;
        node.next = head;
        head = node;
    }

    public void addAtTail(T i)
    {
        Node node = new Node();
        node.data = i;
        node.next = null;
        if(head == null){
            head = node;
        }else{
            Node focusNode = head;
            while(focusNode.next != null){
                focusNode = focusNode.next;
            }
            focusNode.next = node;
        }
    }

    public void reverse()
    {
        Node reversed = null;
        while(head != null){
            Node currentNode = head;
            head = head.next;
            currentNode.next = reversed;
            reversed = currentNode;
        }
        head = reversed;
    }

    public void reverse1()
    {
        LinkedList<T> reversed = new LinkedList<>();
        Node focusNode = head;
        while(focusNode != null){
            reversed.addAtHead(focusNode.data);
            focusNode = focusNode.next;
        }
        head = reversed.head;
    }

    @Override
    public String toString(){
        Node focusNode = head;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        while(focusNode != null){
            stringBuffer.append(focusNode.data);
            focusNode = focusNode.next;
            if(focusNode != null) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    private class Node {
        T data;
        Node next;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        System.out.println(list);
        list.addAtHead(10);
        list.addAtHead(11);
        System.out.println(list);
        list.addAtTail(20);
        System.out.println(list);
        list.reverse();
        System.out.println(list);
        list.reverse1();
        System.out.println(list);

        LinkedList<String> strList = new LinkedList<String>();
        strList.addAtHead("Hello");
        strList.addAtHead("World");
        System.out.println(strList);
    }
}
