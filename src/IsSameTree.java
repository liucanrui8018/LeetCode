/**
 * Created by 刘灿锐 on 2017/3/20 0020.
 * Given two binary trees, write a function to check if they are equal or not.
 *
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 */
public class IsSameTree {
    private boolean isSameTree(TreeNode p, TreeNode q) {
        return p == null && q == null || !(p == null || q == null) && p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
