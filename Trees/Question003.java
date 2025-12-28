package Trees;
import java.util.*;
//Preorder traversal: It is used in store the binary tree into a inorder array
//Root → Left → Right
public class Question003 {
    public static class Node{
        int data;
        Node left;
        Node right ;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static Node root=null;
       public static void insert(int data){
        root=recursion(root,data);
    }
    private static Node recursion(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left=recursion(root.left,data);
        }
        if(data>root.data){
            root.right=recursion(root.right,data);
        }
        return root;
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        System.out.print("Enter number of nodes:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            insert(data);
        }
        if(root==null){
            System.out.print("The tree is empty");
        }else{
            System.out.print("Pre order traversal:- ");
            preorder(root);
        }
    }
}

//TC:O(n^2)
//SC:O(n)