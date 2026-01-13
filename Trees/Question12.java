package Trees;
import java.util.*;
public class Question12 {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Node root = null;

    public static void insert(int data) {
        Node node = new Node(data);
        if (root == null) {
            root = node;
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.left == null) {
                current.left = node;
                return;
            } else {
                queue.add(current.left);
            }
            if (current.right == null) {
                current.right = node;
                return;
            } else {
                queue.add(current.right);
            }
        }
    }

    public void helper(Node root, String s, List<String> ans) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            s += root.data;
            ans.add(s);
            return;
        }
        helper(root.left, s + root.data + "->", ans);
        helper(root.right, s + root.data + "->", ans);
    }

    public List<String> binaryTreePaths(Node root) {
        List<String> ans = new ArrayList<>();
        String s = "";
        helper(root, s, ans);
        return ans;
    }

    public static boolean sametree(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.data != root2.data) {
            return false;
        }
        return sametree(root1.left, root2.left) && sametree(root1.right, root2.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes for first tree: ");
        int n1 = sc.nextInt();
        System.out.print("Enter elements for first tree: ");
        Question12 tree1 = new Question12();
        for (int i = 0; i < n1; i++) {
            int data = sc.nextInt();
            tree1.insert(data);
        }
        Node root1 = tree1.root;

        System.out.print("Enter number of nodes for second tree: ");
        int n2 = sc.nextInt();
        System.out.print("Enter elements for second tree: ");
        Question12 tree2 = new Question12();
        for (int i = 0; i < n2; i++) {
            int data = sc.nextInt();
            tree2.insert(data);
        }
        Node root2 = tree2.root;

        boolean isTrue = sametree(root1, root2);

        System.out.println("Are the two trees the same? " + isTrue);
    }
}