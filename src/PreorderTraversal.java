import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by 刘灿锐 on 2017/4/27 0027.
 * 144. Binary Tree Preorder Traversal
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * <p>
 * For example:
 * Given binary tree {1,#,2,3},
 * 1
 *  \
 *   2
 *  /
 * 3
 * return [1,2,3].
 * <p>
 * Note: Recursive solution is trivial, could you do it iteratively?
 */
public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode node) {
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> rights = new Stack<>();
        while (node != null) {
            list.add(node.val);
            if (node.right != null) {
                rights.push(node.right);
            }
            node = node.left;
            if (node == null && !rights.isEmpty()) {
                node = rights.pop();
            }
        }
        return list;
    }
}
