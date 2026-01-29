
package Arrays;

import java.util.*;

public class Question006{
    public static void main(String[] args){

        System.out.print("Enter Size:- ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        if(size<3){
            System.out.print("Invalid Input");
            return;
        }
        int[] number=new int[size];

        for(int i=0;i<size;i++){
            if(i==0){
                System.out.print("Enter values:- ");
            }
            number[i]=sc.nextInt();
        }

        int FirstNumber= Integer.MIN_VALUE;
        int SecondNumber= Integer.MIN_VALUE;
        int ThirdNumber= Integer.MIN_VALUE;

        for(int i=0;i<size;i++){
            if(FirstNumber<number[i]){
                ThirdNumber=SecondNumber;
                SecondNumber=FirstNumber;
                FirstNumber=number[i];
            }else if(SecondNumber<number[i]){
                SecondNumber=ThirdNumber;
                SecondNumber=number[i];
            }else if(ThirdNumber>number[i]){
                ThirdNumber=number[i];
            }
        }
        System.out.println("Largest Number:- "+FirstNumber);
        System.out.println("2nd Largest Number:- "+SecondNumber);
        System.out.println("3rd Largest Number:- "+ThirdNumber);
    }
}
