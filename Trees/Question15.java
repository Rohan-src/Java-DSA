package Trees;
import java.util.*;
public class Question15 {
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
    public static boolean helper(Node t1,Node t2){
        if(t1==null&&t2==null){
            return true;
        }
        if(t1==null||t2==null){
            return false;
        }
        return (t1.data==t2.data)&&helper(t1.left,t2.right)&&helper(t1.right,t2.left);
    }
    public static boolean Symmetry(Node root){
        if(root==null){
            return true;
        }
        return helper(root.left,root.right);
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
        boolean isTrue=Symmetry(root);
        System.out.print(isTrue);
    }
}