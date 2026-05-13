package Recursion;

import java.util.*;
public class Question03 {
    public static void print(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        System.out.print(n+" ");
        print(n-1);
    }

    public static void main(String[] args) {
        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
}