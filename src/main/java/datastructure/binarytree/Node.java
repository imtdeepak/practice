package datastructure.binarytree;

/**
 * Created by Deepak Kumar on 7/19/16.
 */
public class Node {

    private Integer data;
    private Node left;

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    private Node right;


    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
