import java.util.*;

class Anagram {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}

public class Check {
    public static void main(String[] args) {

        Anagram obj = new Anagram();

        String s = "anagram";
        String t = "nagaram";

        System.out.println("Result: " +
                obj.isAnagram(s, t));
    }
}