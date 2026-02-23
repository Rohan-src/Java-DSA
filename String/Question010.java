
package String;

import java.util.*;

public class Question010 {
    public static void main(String[] args) {

        System.out.print("Enter string:- ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        boolean found =true;

        Stack<Character> values=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch=='['||ch=='{'||ch=='('){
                values.push(ch);
            }
            else if((ch==']'||ch=='}'||ch==')')){
                if(values.empty()) {
                    found = false;
                    break;
                }
                char top=values.pop();
                if((ch==')'&&top!='(')||
                        (ch=='}'&&top!='{')||
                        (ch==']'&&top!='[')){
                    found=false;
                    break;
                }
            }
        }
        System.out.println(found);
    }
}
