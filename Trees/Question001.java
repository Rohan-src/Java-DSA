package Trees;

import java.util.*;
//This is Level Order Traversal which is used to find (Shortest path, BFS problems) implemented using recursion
//Iterative implementation is also asked in interview to check understanding (Do practice that)
public class Question001 {
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
        root=recursive(root,data);
    }
    private static Node recursive(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left=recursive(root.left,data);
        }else if(data>root.data){
            root.right=recursive(root.right,data);
        }
        return root;
    }
    public static void print(){
        if(root==null){
            System.out.print("Tree is empty");
            return;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp=queue.poll();

            System.out.print(temp.data+" ");
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            insert(val);
        }
        print();
    }
}

//TC: O(n^2)
//SC: o(n)