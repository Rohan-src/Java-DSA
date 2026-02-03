
package Arrays;

import java.util.*;

public class Question009 {
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] number=new int[size];

        for(int i=0;i<size;i++){
            if(i==0){
                System.out.print("Enter values:- ");
            }
            number[i]=sc.nextInt();
        }

        int largest=number[0];

        for(int i=0;i<size;i++){
            if(largest<number[i]){
                largest=number[i];
            }
        }
        System.out.println("Largest number is:- "+largest);

        int Smallest=number[0];

        for(int i=0;i<size;i++){
            if(Smallest>number[i]){
                Smallest=number[i];
            }
        }
        System.out.print("Smallest Number is:- "+Smallest);
    }
}
