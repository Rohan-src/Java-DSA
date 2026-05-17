package Recursion;
import java.util.*;
public class Question05 {
    public static int max(int[] arr,int ind){
        if(ind==arr.length-1){
            return arr[ind];
        }
        int maxrest=max(arr,ind+1);
        return Math.max(arr[ind],maxrest);
    }

    public static void main(String[] args) {
        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=max(arr,0);
        System.out.print(ans);
    }
}