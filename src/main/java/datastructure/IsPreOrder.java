package datastructure;

/**
 * Created by byjumanikkan on 5/10/16.
 */
public class IsPreOrder {

    public static boolean isPreOrder(int [] array){
        BinaryTree binaryTree = new BinaryTree();
        for (int i : array) {
            if(!binaryTree.preOrderAdded(i))
            {
                return false;
            }
        }
        return true;
    }

    static class BinaryTree{
        TreeNode root;
        boolean preOrderAdded( int data)
        {
            TreeNode node = new TreeNode();
            node.data = data;
            boolean inPreOrder = true;
            if (root == null) {
                root = node;
            } else {
                TreeNode focusNode = root;
                while(true){
                    if(focusNode.rightVisited && data < focusNode.data){
                        inPreOrder = false;
                        break;
                    }
                    if(data < focusNode.data) {
                        if (focusNode.left == null){
                            focusNode.left = node;
                            break;
                        }
                        else {
                            focusNode = focusNode.left;
                        }
                    } else if(data > focusNode.data) {
                        focusNode.rightVisited = true;
                        if (focusNode.right == null){
                            focusNode.right = node;
                        break;
                        }
                        else {
                            focusNode = focusNode.right;
                        }
                    }
                }
            }
            return inPreOrder;
        }
    }
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        boolean rightVisited;
    }

    public static void main(String[] args) {
        System.out.println(isPreOrder(new int[]{40, 30, 35, 20, 80, 100}));
    }
}
