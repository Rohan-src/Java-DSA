package Arrays;

import java.util.*;

public class Question004 {
    public static void main(String[] args){

        System.out.print("Enter Size of array:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] number=new int[size];

        for(int i=0;i<size;i++){
            if(i==0){
                System.out.print("Enter values of array:- ");
            }
            number[i]=sc.nextInt();
        }
        int largest=number[0];

        for(int i=0;i<size;i++){
            if(number[i]>largest){
                largest=number[i];
            }
        }
        System.out.print("Largest number is:- "+largest);
    }
}