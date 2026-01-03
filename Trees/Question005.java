package Trees;
import java.util.*;
public class Question005 {
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
        Node node=new Node(data);
        if(root==null){
            root=node;
            return;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node current=queue.poll();
            if(current.left==null){
                current.left=node;
                return;
            }else{
                queue.add(current.left);
            }
            if(current.right==null){
                current.right=node;
                return;
            }else{
                queue.add(current.right);
            }
        }
    }
    public static int size(Node root){
        if(root==null){
            return 0;
        }
        return size(root.left)+size(root.right)+1;
    }
    public static int sumofval(Node root){
        if(root==null){
            return 0;
        }
        return root.data+sumofval(root.left)+sumofval(root.right);
    }
    public static void main(String[] args) {
        System.out.print("Enter number of nodes:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            insert(val);
        }
        int count=size(root);
        System.out.println("Size is:- "+count);
        int ans=sumofval(root);
        System.out.print("Sum is:- "+ans);
    }
}