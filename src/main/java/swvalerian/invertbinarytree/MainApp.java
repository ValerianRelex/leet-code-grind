package swvalerian.invertbinarytree;

//  Input: root = [4,2,7,1,3,6,9]

import java.util.LinkedList;
import java.util.Queue;

public class MainApp {
    public static void main(String[] args) {

        TreeNode two = new TreeNode(2);
        TreeNode seven = new TreeNode(7);
        TreeNode one = new TreeNode(1);
        TreeNode three = new TreeNode(3);
        TreeNode six = new TreeNode(6);
        TreeNode nine = new TreeNode(9);

        TreeNode root = new TreeNode(4, two, seven);

        two.left = one;
        two.right = three;

        seven.left = six;
        seven.right = nine;


        TreeNode invertedTree = InvertBinaryTree.invertTreeRecursive(root);


        System.out.println(invertedTree.val);

        // предлагаю сначал сделать обход дерева.

//        printTreeHelper(root, "-", true);
//
//        String bfs = bfs(root);
//
//        System.out.println(bfs);

//        printTreeNode(root);




    }

    public static void printTreeNode(TreeNode root) {

        TreeNode head = root;

        System.out.println(root.val);

        if (root != null) {

            System.out.println("");

            if (root.left != null) {
                root = root.left;
            } else if (root.right != null) {
                root = root.right;
            }

            printTreeNode(root);
        }

    }

    private static void printTreeHelper(TreeNode node, String prefix, boolean isTail) {
        if (node == null) {
            return;
        }

        // Вывод текущего узла
        System.out.println(prefix + (isTail ? "└── " : "├── ") + node.val);

        // Рекурсивный обход потомков
        String childPrefix = prefix + (isTail ? "    " : "│   ");
        if (node.left != null || node.right != null) {
            if (node.left != null) {
                // Левый потомок (не последний, если есть правый)
                printTreeHelper(node.left, childPrefix, node.right == null);
            }
            if (node.right != null) {
                // Правый потомок (всегда последний)
                printTreeHelper(node.right, childPrefix, true);
            }
        }
    }

    public static String bfs(TreeNode root) {
        if (root == null) return "[]";

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        StringBuilder result = new StringBuilder("[");

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            result.append(node.val).append(", ");

            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }

        // Удаление последней запятой и пробела
        if (result.length() > 1) {
            result.setLength(result.length() - 2);
        }
        result.append("]");
        return result.toString();
    }
}
