package String;

import java.util.*;

public class Question005 {
    public static void main(String[] args) {

        System.out.print("Enter string 1:- ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        System.out.print("Enter String 2:- ");
        String str2 = sc.nextLine();

        System.out.print("Enter String 3:- ");
        String str3 = sc.nextLine();

        String combined = str1 + str2;

        char[] combinedchar = combined.toCharArray();
        char[] String3 = str3.toCharArray();

        if (combinedchar.length == String3.length) {
            Arrays.sort(combinedchar);
            Arrays.sort(String3);

            int i = 0;
            int j = 0;

            while (i < combinedchar.length && j < String3.length) {
                if (combinedchar[i] == String3[j]) {
                    i++;
                    j++;
                } else {
                    System.out.println("Not a valid shuffle");
                    return;
                }
            }
            System.out.println("It is a valid shuffle.");
        } else {
            System.out.println("Not a valid shuffle.");
        }
    }
}