package Trees;
import java.util.*;
public class Question11 {
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

    Node root = null;

    public void insert(int data) {
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

    public static boolean sametree(Node p, Node q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.data != q.data) {
            return false;
        }
        return sametree(p.left, q.left) && sametree(p.right, q.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes for first tree:- ");
        int n1 = sc.nextInt();
        System.out.print("Enter elements for first tree:- ");
        Question11 tree1 = new Question11();
        for (int i = 0; i < n1; i++) {
            int data = sc.nextInt();
            tree1.insert(data);
        }
        Node root1 = tree1.root;

        System.out.print("Enter number of nodes for second tree:- ");
        int n2 = sc.nextInt();
        System.out.print("Enter elements for second tree:- ");
        Question11 tree2 = new Question11();
        for (int i = 0; i < n2; i++) {
            int data = sc.nextInt();
            tree2.insert(data);
        }
        Node root2 = tree2.root;

        boolean isTrue = sametree(root1, root2);
        System.out.println(isTrue);

    }
}