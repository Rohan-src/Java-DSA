package String;

import java.util.*;

public class Question011{
    public static void main(String[] args) {

        System.out.print("Enter number of Strings:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        sc.nextLine();

        ArrayList<String> Final=new ArrayList<>();

        System.out.print("Enter Strings:- ");
        for(int i=0;i<n;i++){
            Final.add(sc.nextLine());
        }

        Map<String,List<String>> sortedstr =new HashMap<>();

        for(String str:Final){
            char[] ch=str.toCharArray();

            Arrays.sort(ch);
            String store=new String(ch);

            if(!sortedstr.containsKey(store)){
                sortedstr.put(store, new ArrayList<>());
            }
            sortedstr.get(store).add(str);
        }

        Collection<List<String>> anagramgroup=sortedstr.values();
        List<List<String>> group=new ArrayList<>(anagramgroup);

        for(int i=0;i<group.size();i++){
            List<String> gr=group.get(i);

            System.out.println(gr);
        }
    }
}