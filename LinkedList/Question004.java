package LinkedList;
import java.util.*;
public class Question004 {
    public static class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;
    public static void insert(String data){
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
    public static void search(String data){
        if(head==null){
            System.out.print("The list is empty");
            return;
        }else{
            Node temp=head;
            while(temp!=null&&!temp.data.equals(data)){
                temp=temp.next;
            }
            if(temp==null){
                System.out.print("The element dosen't exists");
                return;
            }else{
                System.out.print(data+" is present");
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
            insert(data);
        }
        System.out.print("Enter node to search:- ");
        String data=sc.nextLine();
        search(data);
    }
}