import java.util.*;

class Title {

    public String toTitleCase(String sentence) {

        String[] words = sentence.split(" ");

        StringBuilder sb = new StringBuilder();

        for (String word : words) {

            if (word.length() > 0) {

                sb.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1).toLowerCase())
                  .append(" ");
            }
        }

        return sb.toString().trim();
    }
}

public class Case {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        Title obj = new Title();

        System.out.println("Title Case: " +
                obj.toTitleCase(sentence));
    }
}