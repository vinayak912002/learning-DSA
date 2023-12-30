package trees.traversal;

import trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Inorder {
    public static List<Integer> inorderTraversal(TreeNode root){
        List<Integer> nums = new ArrayList<>();
        inorder(root, nums);
        return nums;
    }
    public static void inorder(TreeNode root, List<Integer> nums){
        if (root == null) return;
        inorder(root.left, nums);
        nums.add(root.value);
        inorder(root.right, nums);
    }


    public static void main(String[] args) {
        TreeNode head = new TreeNode(1,new TreeNode(2),new TreeNode(3) );
        TreeNode itr = head.left;
        itr.left = new TreeNode(4);
        itr.right = new TreeNode(4, new TreeNode(5), new TreeNode(8));
        System.out.println(inorderTraversal(head));
    }
}


