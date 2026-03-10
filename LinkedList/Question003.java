package LinkedList;
import java.util.*;
public class Question003 {
    public static class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;
    public static void Insert(String data){
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
    public static void delete(String data){
        if(head==null){
            System.out.print("The list is Empty");
            return;
        }else if(head.data.equals(data)){
            head=head.next;
            return;
        }else{
            Node temp=head;
            while(temp.next!=null&&!temp.next.data.equals(data)){
                temp=temp.next;
            }
            if(temp.next==null){
                System.out.print("The node dosent exists");
                return;
            }else {
                temp.next = temp.next.next;
            }
        }
    }
    public static void print(){
        if(head==null){
            System.out.print("The list is empty");
            return;
        }else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args){
        System.out.print("Enter number of nodes:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            String data=sc.nextLine();
            Insert(data);
        }
        System.out.print("Enter element to delete:- ");
        String data=sc.nextLine();
        delete(data);

        System.out.print("Final list is:- ");
        print();
    }
}