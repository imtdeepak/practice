package algo.problem;

import java.util.HashMap;

public class LRUCache<T> {
    private final int capacity;
    private final Node<T> head;
    private final Node<T> tail;
    private final HashMap<Integer, Node<T>> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.head = new Node<>(0, null);
        this.tail = new Node<>(0, null);
        head.next = tail;
        tail.prev = head;
        map = new HashMap<>();
    }

    public T get(int key) {
        if (map.containsKey(key)) {
            Node<T> node = map.get(key);
            remove(node);
            insertAtHead(node);
            return node.value;
        }
        return null;
    }

    public void put(int key, T value) {
        if (map.containsKey(key)) {
            Node<T> node = map.get(key);
            node.value = value;
            remove(node);
            insertAtHead(node);
        } else {
            if (map.size() == capacity) {
                map.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node<T> newNode = new Node<>(key, value);
            insertAtHead(newNode);
            map.put(key, newNode);
        }
    }

    private void remove(Node<T> node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insertAtHead(Node<T> node) {
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    private static class Node<T> {
        int key;
        T value;
        Node<T> prev;
        Node<T> next;

        public Node(int key, T value) {
            this.key = key;
            this.value = value;
        }
    }
    
}
