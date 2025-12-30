package Trees;
import java.util.Scanner;
public class BT {
    private class Node{
        private int val;
        private Node left;
        private Node right;

        public Node(int value){
            this.val=value;
        }
        public Node(int value,Node left,Node right){
            this.val=value;
            this.left=left;
            this.right=right;
        }
    }

    private Node Root;

    public void pop(Scanner sc){
        System.out.print("Enter value for root:");
        int val=sc.nextInt();
        Root=new Node(val);
        Mpop(sc,Root);
    }

    public void Mpop(Scanner sc,Node n) {
        System.out.println("Do you want to enter to left of " + n.val);
        Boolean lbool = sc.nextBoolean();
        if (lbool == true) {
            System.out.println("Enter the value for the left of " + n.val + ":");
            int val = sc.nextInt();
            n.left = new Node(val);
            Mpop(sc, n.left);
        }
        System.out.println("Do you want to enter to right of:" + n.val);
        Boolean rbool = sc.nextBoolean();
        if(rbool == true){
            System.out.println("Enter the value for the right of " + n.val + ":");
            int val = sc.nextInt();
            n.right = new Node(val);
            Mpop(sc, n.right);
        }
    }
    public void display(){
        display(this.Root,"");
    }
    private void display(Node n,String indent){
        if(n==null)return;
        System.out.println(indent+n.val);
        display(n.left,indent+"\t");
        display(n.right,indent+"\t");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BT tree=new BT();
        tree.pop(sc);
        tree.display();
    }
}
