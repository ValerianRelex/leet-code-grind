package swvalerian.invertbinarytree;


/**
 * Given the root of a binary tree, invert the tree, and return its root.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: root = [4,2,7,1,3,6,9]
 * Output: [4,7,2,9,6,3,1]
 * Example 2:
 * <p>
 * <p>
 * Input: root = [2,1,3]
 * Output: [2,3,1]
 * Example 3:
 * <p>
 * Input: root = []
 * Output: []
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 100].
 * -100 <= Node.val <= 100
 */

public class InvertBinaryTree {

    // TODO: все равно нихера не понимаю, как к такому пришли???
    public static TreeNode invertTreeRecursive(TreeNode root) {
        if (root == null) {
            return root;
        }

        invertTreeRecursive(root.left);
        invertTreeRecursive(root.right);

        TreeNode tempRoot = root.left;
        root.left = root.right;
        root.right = tempRoot;
        return root;
    }


    private static TreeNode invertTreeIterative(TreeNode root) {
        // TODO: реализовать самому с помощью Queue !!!

        return root;
    }
}
