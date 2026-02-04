
package Arrays;

import java.util.*;

public class Question010 {
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] number=new int[size];

        System.out.print("Enter Values:- ");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }

        System.out.print("Enter K Element:- ");
        int k=sc.nextInt();
        if(k>size){
            System.out.print("Invalid Input");
            return;
        }

        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(number[i]<number[j]){
                    int temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
        }
        System.out.print("The Kth max element is:- "+number[k-1]);
    }
}
