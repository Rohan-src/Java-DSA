package Arrays;

import java.util.*;

public class Question014{
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.print("Enter size 2:- ");
        int m=sc.nextInt();

        int[] a=new int[n];
        int[] b=new int[m];

        System.out.print("Enter values:- ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter values:- ");
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        Set<Integer> UnionSet=new HashSet<>();

        for(int i=0;i<n;i++){
            UnionSet.add(a[i]);
        }
        for(int i=0;i<m;i++){
            UnionSet.add(b[i]);
        }

        Integer[] UnionArray=UnionSet.toArray(new Integer[0]);

        System.out.println("Union is:- "+Arrays.toString(UnionArray));

        Set<Integer> IntersectionSet=new HashSet<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i]==b[j]){
                    IntersectionSet.add(a[i]);
                }
            }
        }
        Integer[] IntersectionArray=IntersectionSet.toArray(new Integer[0]);

        System.out.print("Intersection is:- "+Arrays.toString(IntersectionArray));
    }
}