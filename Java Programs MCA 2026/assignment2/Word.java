import java.util.*;

class Longest {

    public String findLongestWord(String sentence) {

        String[] words = sentence.split(" ");

        String longest = "";

        for (String word : words) {

            word = word.replaceAll("[^a-zA-Z]", "");

            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }
}

public class Word {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        Longest obj = new Longest();

        System.out.println("Longest Word: " +
                obj.findLongestWord(sentence));
    }
}