package Trees;
import java.util.*;
public class Question13 {
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
    public static Node lca(Node root, int p,int q){
        if(root==null||root.data==p||root.data==q){
            return root;
        }
        Node left=lca(root.left,p,q);
        Node right=lca(root.right,p,q);
        if(left!=null&&right!=null){
            return root;
        }
        if(left!=null){
            return left;
        }
        return right;
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
        System.out.print("Enter p:- ");
        int p=sc.nextInt();
        System.out.print("Enter q:- ");
        int q=sc.nextInt();
        Node current=lca(root,p,q);
        if(current!=null) {
            System.out.print(current.data);
        }else{
            System.out.print("LCA not found");
        }
    }
}