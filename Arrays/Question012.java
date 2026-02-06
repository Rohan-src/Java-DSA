package Arrays;

import java.util.*;

public class Question012 {
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] number=new int[size];

        System.out.print("Enter Values:- ");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
            if(number[i]!=0 && number[i]!=1 && number[i]!=2){
                System.out.print("Invalid Input");
                return;
            }
        }

        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(number[i]>number[j]){
                    int temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
        }
        System.out.print("Sorted Array:- ");
        for(int i=0;i<size;i++){
            System.out.print(number[i]+" ");
        }
    }
}