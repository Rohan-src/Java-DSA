package Trees;

import java.util.*;
//Inorder traversal: Used to retrieve elements of a binary search tree in sorted order.
//Left → Root → Right
public class Question00
2 {
    public static class Node{
        int data;
        Node left;
        Node right;
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
    public static void inorderdisplay(Node root){
        if(root==null){
            return;
        }
        inorderdisplay(root.left);
        System.out.print(root.data+" ");
        inorderdisplay(root.right);
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
            System.out.print("Inorder traversal:- ");
            inorderdisplay(root);
        }
    }
}