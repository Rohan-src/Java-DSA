
package Arrays;

import java.util.*;

public class Question008 {
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] number=new int[size];

        for(int i=0;i<size;i++){
            if(i==0){
                System.out.print("Enter Values:- ");
            }
            number[i]=sc.nextInt();
        }
        Arrays.sort(number);

        System.out.println("Smallest number is:- "+number[0]);
        System.out.print("Largest number is:- "+number[size-1]);
    }
}
