import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();


        System.out.println(arr1);
        System.out.println(arr2);

        for(int i = 0; i< arr1.length; i++){

            if(map1.containsKey(arr1[i]))
                map1.put(arr1[i], map1.get(arr1[i])+1);
            else
                map1.put(arr1[i],1);
        }
        for(int i = 0; i< arr2.length; i++){

            if(map2.containsKey(arr2[i]))
                map2.put(arr2[i], map2.get(arr2[i])+1);
            else
                map2.put(arr2[i],1);
        }

        System.out.println(map1);
        System.out.println(map2);

        if(map1.equals(map2))
            System.out.println("they are anagram");
        else
            System.out.println("They are not anagram");


    }
}
