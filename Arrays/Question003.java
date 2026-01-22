package Arrays;

import java.util.*;


public class Question003 {
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] number=new int[size];

        for(int i=0;i<size;i++){
            if(i==0){
                System.out.print("Enter Values :- ");
            }
            number[i]=sc.nextInt();
        }

        System.out.print("Enter index value:- ");
        int x=sc.nextInt();

        System.out.println("The answer is:- "+number[x]);
    }
}