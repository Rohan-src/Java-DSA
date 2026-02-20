package String;

import java.util.*;

public class Question009 {
    public static void main(String[] args) {

        System.out.print("Enter string:- ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        int balance=0;
        int count=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){
                balance++;
            }else if(str.charAt(i)=='1'){
                balance--;
            }
            if(balance==0){
                count++;
            }
        }
        if(balance==0){
            System.out.print(count);
        }else{
            System.out.println(-1);
        }
    }
}