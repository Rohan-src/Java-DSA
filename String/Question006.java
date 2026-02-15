
package String;

import java.util.*;

public class Question006{
    public static void main(String[] args){

        System.out.print("Enter string:- ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String longestpalindrome="";

        for(int i=0;i<str.length();i++){
            //For odd conditions
            int left =i;
            int right =i;

            while(left >=0&& right <str.length()&&str.charAt(left)==str.charAt(right)){
                if(right-left+1>longestpalindrome.length()){
                    longestpalindrome=str.substring(left,right+1);
                }
                left--;
                right++;
            }
            //For even conditions
            left=i;
            right=i+1;

            while (left>=0&&right<str.length()&&str.charAt(left)==str.charAt(right)){
                if(right-left+1>longestpalindrome.length()){
                    longestpalindrome=str.substring(left,right+1);
                }
                left--;
                right++;
            }
        }
        System.out.print("Longest palindromic substring:- "+longestpalindrome);
    }
}
