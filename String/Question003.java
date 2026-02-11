
package String;

import java.util.*;

public class Question003 {
    public static void main(String[] args) {

        System.out.println("Enter string:- ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String duplicate="";

        for(int i=0;i<str.length()-1;i++){
            char Contains=str.charAt(i);
            if(duplicate.indexOf(Contains)==-1) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) == str.charAt(i)) {
                        duplicate += str.charAt(j);
                        break;
                    }
                }
            }
        }
        if(duplicate.isBlank()){
            System.out.print("Not duplicate element found");
        }else{
            System.out.print("Duplicate elements are:- "+duplicate);
        }
    }
}
