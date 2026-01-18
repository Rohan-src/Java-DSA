
package Arrays;

import java.util.*;

public class Question001{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size:- ");
        int size=sc.nextInt();

        int[] marks=new int[size];

        for(int i=0;i<size;i++) {
            if (i == 0) {
                System.out.print("Enter marks:- ");
            }
            marks[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(marks[i]);
        }
    }
}
