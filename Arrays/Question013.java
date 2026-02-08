
package Arrays;

import java.util.*;

public class Question013{
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] number=new int[size];

        System.out.print("Enter values:- ");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        int x=number[size-1];

        for(int i=size-1;i>0;i--){
            number[i]=number[i-1];
        }
        number[0]=x;

        System.out.print("After one cyclically rotation:- ");
        for(int i=0;i<size;i++){
            System.out.print(number[i]+" ");
        }
    }
}
