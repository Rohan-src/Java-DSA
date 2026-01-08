package Trees;
import java.util.*;
public class Question007 {
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
    public static int minvalue(Node root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int a=root.data;
        int b=minvalue(root.left);
        int c=minvalue(root.right);
        return Math.min(a,Math.min(b,c));
    }
    public static double product(Node root){
        if(root==null){
            return 1;
        }
        return root.data*product(root.left)*product(root.right);
    }

    public static void main(String[] args) {
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            insert(data);
        }
        int min=minvalue(root);
        System.out.println("Min value:- "+min);
        double mul=product(root);
        System.out.print("Product of elements:- "+mul);
    }
}