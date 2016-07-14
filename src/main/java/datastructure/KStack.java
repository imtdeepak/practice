package datastructure;

/**
 * Created by byjumanikkan on 5/9/16.
 */
public class KStack<T> {
    private final int k;
    private final int n;
    private T[] data;
    private int[] top;
    private int[] next;
    private int free;

    public KStack(int k, int n){
        this.k = k;
        this.n = n;
        this.data = (T[]) new Object[n];
        this.top = new int[k];
        this.next = new int[n];
        for(int i = 0; i < k ; i++){
            this.top[i] = -1;
        }
        this.free = 0;
        for(int i =0; i < n -1 ; i++){
            this.next[i] = i + 1;
        }
        this.next[n-1] = -1;
    }

    public void push(int k, T element){
        if( free > n-1) {
            throw new RuntimeException("stack overflow");
        }
        if(this.top[k] == -1) {
            next[this.top[k]] = free;
        }
        this.top[k] = free;
        data[free] = element;
        free++;
    }
    public void pop(int k){
        T element;
        if(this.top[k] == -1) {
            throw new RuntimeException("No element in the stack");
        }
        element = data[this.top[k]];
        free++;
    }

}
