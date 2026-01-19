
package array;

import java.util.*;

public class Array3{
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] number=new int[size];

        for(int i=0;i<size;i++){
            if(i==0){
                System.out.print("Enter number:- ");
            }
            number[i]=sc.nextInt();
        }

        System.out.print("Enter the value for index number:- ");
        int x=sc.nextInt();

        for(int i=0;i<number.length;i++){
            if(number[i]==x){
                System.out.print("The index number is:- "+i);
            }
        }
    }
}
