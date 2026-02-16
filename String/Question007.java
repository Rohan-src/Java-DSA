package String;

import java.util.*;

public class Question007 {
    public static void main(String[] args) {

        System.out.print("Enter string:- ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        char[] chararray=str.toCharArray();

        Arrays.sort(chararray);

        String str1 =new String(chararray);

        for(int i = 0; i< str1.length(); i++){
            for(int j = i; j< str1.length(); j++){
                System.out.println(str1.substring(i,j+1));
            }
        }
    }
}