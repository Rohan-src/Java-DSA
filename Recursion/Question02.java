package Recursion;

import java.util.*;

public class Question02 {
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args){
        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=factorial(n);
        System.out.print(ans);
    }
}