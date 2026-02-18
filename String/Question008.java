package String;

import java.util.*;

public class Question008 {
    public static void main(String[] args) {

        System.out.println("Enter string:- ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] charArray = str.toCharArray();

        int n = charArray.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Swap characters at i and j
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;

                System.out.println(new String(charArray));

                temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
            }
        }
    }
}