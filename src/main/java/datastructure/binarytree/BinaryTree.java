package datastructure.binarytree;

/**
 * Created by Deepak Kumar on 7/19/16.
 */
public class BinaryTree {
    private Node root;

    public void add(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            Node tempNode = root;
            Node parent;
            while (true) {
                parent = tempNode;
                if (data < tempNode.getData()) {
                    tempNode = tempNode.getLeft();
                    if (tempNode == null) {
                        parent.setLeft(newNode);
                        return;
                    }
                } else {
                    tempNode = tempNode.getRight();
                    if (tempNode == null) {
                        parent.setRight(newNode);
                        return;
                    }
                }
            }


        }

    }
}
