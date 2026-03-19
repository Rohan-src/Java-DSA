
package LinkedList;
import java.util.*;

public class Question008 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;
    static int count = 0;

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
        count++;
    }

    public static void findNthFromEnd(int val) {
        if (val <= 0 || val > count) {
            System.out.println("Invalid index.");
            return;
        }

        int index = count - val;
        int currentIndex = 0;
        Node temp = head;

        while (temp != null) {
            if (currentIndex == index) {
                System.out.println("The " + val + "th node from the end is: " + temp.data);
                return;
            }
            currentIndex++;
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            insert(data);
        }

        System.out.print("Enter index from end to find: ");
        int val = sc.nextInt();

        findNthFromEnd(val);
    }
}
