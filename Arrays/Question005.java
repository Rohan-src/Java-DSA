
package Arrays;

import java.util.*;

public class Question005 {
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        if(size<3){
            System.out.print("Invalid input");
            return;
        }

        int[] number=new int[size];

        for(int i=0;i<size;i++){
            if(i==0){
                System.out.print("Enter values:- ");
            }
            number[i]=sc.nextInt();
        }

        Arrays.sort(number);

        int ThirdLargest=number[size-3];

        System.out.print("The Third largest number is:- "+ThirdLargest);
    }
}
