package LinkedList;
import java.util.*;
public class Question009 {
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
    public static void delete(int num){
        Node slow=head;
        Node fast=head;
        for(int i=0;i<num;i++){
            if(fast==null){
                System.out.print("The list is empty");
                return;
            }
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        if(slow.next!=null) {
            slow.next = slow.next.next;
        }
    }
    public static void print(){
        if(head==null){
            System.out.print("The list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
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
        System.out.print("Enter index needs to be deleted:- ");
        int val=sc.nextInt();
        delete(val);
        print();
    }
}