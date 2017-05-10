/**
 * Created by 刘灿锐 on 5/10/2017.
 * 222. Count Complete Tree Nodes Add
 * Given a complete binary tree, count the number of nodes.
 * In a complete binary tree every level, except possibly the last,
 * is completely filled, and all nodes in the last level are as far left as possible.
 * It can have between 1 and 2h nodes inclusive at the last level h.
 */
public class CountNodes {
    private int height(TreeNode root) {
        return root == null ? -1 : 1 + height(root.left);
    }

    private int countNodes(TreeNode root) {
        int h = height(root);
        return h < 0 ? 0 :
                height(root.right) == h - 1 ? (1 << h) + countNodes(root.right)
                        : (1 << h - 1) + countNodes(root.left);
    }

//    public int countNodes(TreeNode root) {
//        int nodes = 0, h = height(root);
//        while (root != null) {
//            if (height(root.right) == h - 1) {
//                nodes += 1 << h;
//                root = root.right;
//            } else {
//                nodes += 1 << h-1;
//                root = root.left;
//            }
//            h--;
//        }
//        return nodes;
//    }

//    public int countNodes(TreeNode root) {
//        if (root == null)
//            return 0;
//        TreeNode left = root, right = root;
//        int height = 0;
//        while (right != null) {
//            left = left.left;
//            right = right.right;
//            height++;
//        }
//        if (left == null)
//            return (1 << height) - 1;
//        return 1 + countNodes(root.left) + countNodes(root.right);
//    }

}
