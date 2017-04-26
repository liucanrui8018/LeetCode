/**
 * Created by 刘灿锐 on 2017/4/20 0020.
 * 110. Balanced Binary Tree
 * Given a binary tree, determine if it is height-balanced.
 *
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 */
public class IsBalanced {
    public int depth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        int left = depth(root.left);
        int right = depth(root.right);

        return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
}
