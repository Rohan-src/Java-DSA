package String;

import java.util.*;

public class Question001 {
    public static void main(String[] args) {

        System.out.println("Enter String:- ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String Reverse="";

        for(int i=str.length()-1;i>=0;i--){
            Reverse += str.charAt(i);
        }
        if(Reverse.equals(str)){
            System.out.print("String is palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}