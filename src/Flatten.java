/**
 * Created by 刘灿锐 on 2017/4/20 0020.
 * 114. Flatten Binary Tree to Linked List
 * Given a binary tree, flatten it to a linked list in-place.
 * <p>
 * For example,
 * Given
 * <p>
 *     1
 *    / \
 *   2   5
 *  / \   \
 * 3   4   6
 * The flattened tree should look like:
 * 1
 *  \
 *   2
 *    \
 *     3
 *      \
 *       4
 *        \
 *         5
 *          \
 *           6
 */
public class Flatten {
    private TreeNode prev = null;

    public void flatten(TreeNode root) {
        if (root == null)
            return;
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
}
