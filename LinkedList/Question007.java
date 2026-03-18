package LinkedList;
import java.util.*;
public class Question007 {

    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    public static void insert(int data) {
        Node val = new Node(data);
        if (head == null) {
            head = val;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = val;
        }
    }
    public static void delete(Node input) {
        if (input == null || input.next == null) {
            System.out.println("Can't delete the last node or null node.");
            return;
        }
        input.data = input.next.data;
        input.next = input.next.next;
    }

    public static void print() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node findNode(int value) {
        Node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.data == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            insert(data);
        }

        System.out.print("Enter node value to delete (not last node): ");
        int val = sc.nextInt();

        Node nodeToDelete = findNode(val);
        if (nodeToDelete == null) {
            System.out.println("Node not found or it's the last node, can't delete.");
        } else {
            delete(nodeToDelete);
        }

        print();
    }
}