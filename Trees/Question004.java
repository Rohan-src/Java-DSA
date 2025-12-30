package Trees;
import java.util.*;

//Postorder traversal: Used to delete or free nodes safely by visiting children before their parent.
//Left → Right → Root

public class Question004 {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int value){
            this.val=value;
            this.left=null;
            this.right=null;
        }
    }
    private static Node root;
    public void insert(int data){
       root= recursion(root,data);
    }
    private Node recursion(Node root,int val){
        if(root ==null) return new Node(val);
        if(val<root.val) root.left=recursion(root.left,val);
        if(val>root.val) root.right=recursion(root.right,val);
        return root;
    }

    public void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val);
    }

    public static void main(String[] args) {
        Question004 ans=new Question004();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of tree: ");
        int val=sc.nextInt();
        System.out.print("Enter the values: ");
        for (int i = 0; i < val ; i++) {
            int Val=sc.nextInt();
            ans.insert(Val);
        }
        if(root==null) System.out.println("Tree is empty");
        else ans.postorder(root);
    }
}
