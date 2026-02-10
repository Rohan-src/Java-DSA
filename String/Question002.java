package String;

import java.util.*;

public class Question002 {
    public static void main(String[] args){

        System.out.print("Enter String:- ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String hold="";

        for(int i=str.length()-1;i>=0;i--){
            hold+=str.charAt(i);
        }
        System.out.print("Reversed string:- "+hold);
    }
}