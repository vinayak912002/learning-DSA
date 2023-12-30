package trees.traversal;

import trees.TreeNode;
import java.util.List;
import java.util.ArrayList;
public class Preorder {

    public static void preorder(TreeNode root, List<Integer> nums){
        if(root == null) return;
        nums.add(root.value);
        preorder(root.left, nums);
        preorder(root.right, nums);
    }

    public static List<Integer> preorderTraversal(TreeNode root){
        List<Integer> nums = new ArrayList<>();
        preorder(root, nums);
        return nums;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,new TreeNode(2),new TreeNode(3) );
        TreeNode itr = root.left;
        itr.left = new TreeNode(4);
        itr.right = new TreeNode(4, new TreeNode(5), new TreeNode(8));
        System.out.println(preorderTraversal(root));
    }
}
