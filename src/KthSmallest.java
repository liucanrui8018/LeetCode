/**
 * Created by 刘灿锐 on 5/11/2017.
 * 230. Kth Smallest Element in a BST
 * Given a binary search tree,
 * write a function kthSmallest to find the kth smallest element in it.
 */
public class KthSmallest {
    public int kthSmallest(TreeNode root, int k) {
        int count = countNodes(root.left);
        if (k <= count) {
            return kthSmallest(root.left, k);
        } else if (k > count + 1) {
            return kthSmallest(root.right, k - 1 - count); // 1 is counted as current node
        }

        return root.val;
    }

    private int countNodes(TreeNode n) {
        if (n == null) return 0;

        return 1 + countNodes(n.left) + countNodes(n.right);
    }
}
