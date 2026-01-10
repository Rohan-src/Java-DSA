package Trees;
import java.util.*;
public class Question10 {
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
    public static int height(Node root,int min[]){
        if(root==null){
            return 0;
        }
        int left=height(root.left,min);
        int right=height(root.right,min);
        min[0]=Math.max(min[0],Math.abs(left-right));
        return 1+Math.max(left,right);
    }
    public static boolean balanced(Node root){
        int[] min=new int[1];
        height(root,min);
        if(min[0]>1){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.print("Enter number of nodes:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            insert(data);
        }
        boolean isTrue=balanced(root);
        System.out.print(isTrue);
    }
}
