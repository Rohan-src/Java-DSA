package String;

import java.util.*;

public class Question015 {
    public static void main(String[] args) {

        List<String> Final=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of String1:- ");
        int n=sc.nextInt();

        sc.nextLine();
        System.out.print("Enter String1:- ");
        for(int i=0;i<n;i++){
            Final.add(sc.nextLine());
        }

        List<String> NewFinal=new ArrayList<>();
        System.out.print("Enter size of String2:- ");
        int m=sc.nextInt();

        sc.nextLine();
        System.out.print("Enter string2:- ");
        for(int i=0;i<m;i++){
            NewFinal.add(sc.nextLine());
        }

        List<String> result=new ArrayList<>();

        for(int i=0;i<Final.size();i++){
            String str=Final.get(i);
            for(int j=0;j<NewFinal.size();j++){
                String s=NewFinal.get(j);

                result.add(str+s);
            }
        }

        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i));
            System.out.println();
        }
    }
}