package Arrays;

import java.util.*;

public class Question007 {
    public static void main(String[] args){

        System.out.print("Enter Size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] number=new int[size];

        for(int i=0;i<size;i++){
            if(i==0){
                System.out.print("Enter values:- ");
            }
            number[i]=sc.nextInt();
        }

        for(int i=size-1;i>=0;i--){
            System.out.println(number[i]);
        }
    }
}