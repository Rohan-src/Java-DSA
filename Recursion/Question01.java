package Recursion;


import java.util.*;
public class Question01 {
    public static int fib(int n){
        if(n==1||n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=fib(n);
        System.out.print(ans);
    }
}