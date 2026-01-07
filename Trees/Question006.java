package Trees;
import java.util.*;
public class Question006 {
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
    public static int height(Node root,int max[]){
        if(root==null){
            return 0;
        }
        int left=height(root.left,max);
        int right=height(root.right,max);
        max[0]=Math.max(max[0],left+right);
        return 1+Math.max(left,right);
    }
    public static int diameter(Node root){
        int max[]=new int[1];
        height(root,max);
        return max[0];
    }

    public static void main(String[] args) {
        System.out.print("Enter number of nodes:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            insert(num);
        }
        int ans=diameter(root);
        System.out.print(ans);
    }
}