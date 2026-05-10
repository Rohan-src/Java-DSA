package String;

import java.util.*;

public class Question013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string A: ");
        String s = sc.nextLine();

        System.out.print("Enter string B: ");
        String str = sc.nextLine();

        if (s.length() != str.length()) {
            System.out.println("Strings must be of the same length.");
            return;
        }

        char[] aArr = s.toCharArray();
        char[] bArr = str.toCharArray();
        Arrays.sort(aArr);
        Arrays.sort(bArr);

        if (!Arrays.equals(aArr, bArr)) {
            System.out.println("Transformation not possible (strings are not anagrams).");
            return;
        }

        int i = s.length() - 1;
        int j = str.length() - 1;

        while (i >= 0) {
            if (s.charAt(i) == str.charAt(j)) {
                j--;
            }
            i--;
        }

        int steps = j + 1;
        System.out.println("Minimum steps required: " + steps);
    }
}