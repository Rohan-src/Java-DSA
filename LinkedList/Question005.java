package LinkedList;
import java.util.*;
//insert at the middle of linked list
public class Question005 {
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
    public static void insertmid(int data,int num){
        if(head==null){
            System.out.print("The list is empty");
            return;
        }else{
            Node temp=head;
            while(temp!=null&&temp.data!=data){
                temp=temp.next;
            }
            if(temp==null){
                System.out.print("Not found");
                return;
            }else{
                Node newnode=new Node(num);
                newnode.next=temp.next;
                temp.next=newnode;
            }
        }
    }
    public static void print(){
        if(head==null){
            System.out.print("The list is empty:- ");
            return;
        }else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
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
        System.out.print("Enter element to insert after:- ");
        int after=sc.nextInt();
        System.out.print("Enter element to insert:- ");
        int ele=sc.nextInt();
        insertmid(after,ele);
        print();
    }
}