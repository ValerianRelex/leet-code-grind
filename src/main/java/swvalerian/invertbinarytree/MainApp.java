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

//        traverse(root);
//
//        TreeNode invertedTree = InvertBinaryTree.invertTreeRecursive(root);
//
//        System.out.println("Корень инверт дерева = " + invertedTree.val);
//
//        traverse(invertedTree);


//        traverse(two); // до
//
//        System.out.println("\n\nмой алгос \n");
//
//        reverseTreeNode(two);
//        traverse(two); // после

        System.out.println("\n\n");
        printTreeHelper(two, " ", true);
        traverse(two); // до

        System.out.println(bfs(two));

        System.out.println("\n\nмой алгос \n");

        invertTree(two);
        traverse(two); // после

        System.out.println("\n\n");
        printTreeHelper(root, " ", true);

    }

    // мой варик
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }

        invertTree(root.left);
        invertTree(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }

    public static TreeNode reverseTreeNode(TreeNode root) {
        if (root == null) {
            return root;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        TreeNode result = root;

        queue.add(root);

        while (!queue.isEmpty()) {

            root = queue.poll();

            if (root.left != null) {
                queue.add(root.left);
            }
            if (root.right != null) {
                queue.add(root.right);
            }

            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

        }

        return result;
    }

    private static void traverse(TreeNode node) {
        if (node == null) return;

        traverse(node.left);
        System.out.println(node.val);

        traverse(node.right);
    }
    // пытаюсь изобразить итеративный вариант реверса тринод



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
