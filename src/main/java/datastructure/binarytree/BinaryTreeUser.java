package datastructure.binarytree;

/**
 * Created by Deepak Kumar on 7/19/16.
 */
public class BinaryTreeUser {
    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();

        int[] arrayForTree = {30, 5, 10, 25, 20, 50};

        for (int i = 0; i < arrayForTree.length; i++) {

            binaryTree.add(arrayForTree[i]);
        }


        System.out.println(binaryTree);
    }
}
