package LinkedList;
import java.util.*;
public class Question006 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;
    public static void insert(int data){
        Node val=new Node(data);
        if(head==null){
            head=val;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=val;
        }
    }
    public static void getindex(int val){
        if(head==null){
            System.out.print("The list is empty");
            return;
        }else{
            int count=0;
            Node temp=head;
            while(temp!=null){
                count++;
                if(count==val){
                    System.out.print(temp.data);
                    return;
                }else{
                    temp=temp.next;
                }
            }
        }
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
        System.out.print("Enter index:- ");
        int val=sc.nextInt();
        getindex(val);
    }
}