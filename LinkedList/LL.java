package LinkedList;

import java.util.*;
public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }

    private class Node{
        private int val;
        private Node next;

        public Node(int value){
            this.val=value;
        }
        public Node(int value,Node next){
            this.val=value;
            this.next=next;
        }
    }

    public void insertFirst(int val){
        Node n1=new Node(val);
        n1.next=head;
        head=n1;
        if(tail == null){
            tail=head;
        }
        size++;
    }

    public void insertLast(int val){
        Node n2=new Node(val);
        tail.next=n2;
        tail=n2;
        size++;
    }

    public void deleteFirst(){
        head=head.next;
        size--;
    }
    public void deleteLast(){
        head=head.next;
        size--;
    }

    public void display(){
        Node temp=head;

        while(temp !=null){
            System.out.print(temp.val + "->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        LL list=new LL();
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertFirst(8);
        list.insertLast(100);
        list.insertLast(500);
        list.deleteFirst();
        list.display();



    }
}
