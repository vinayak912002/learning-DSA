package trees.traversal;

import trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Postorder {

    public static void postorder(TreeNode root, List<Integer> nums){
        if(root == null) return;
        postorder(root.left, nums);
        postorder(root.right, nums);
        nums.add(root.value);
    }

    public static List<Integer> postorderTraversal(TreeNode root){
        List<Integer> nums = new ArrayList<>();
        postorder(root, nums);
        return nums;
    }

    public static void main(String[] args){
        TreeNode head = new TreeNode(1,new TreeNode(2),new TreeNode(3) );
        TreeNode itr = head.left;
        itr.left = new TreeNode(4);
        itr.right = new TreeNode(4, new TreeNode(5), new TreeNode(8));
        System.out.println(postorderTraversal(head));
    }
}
