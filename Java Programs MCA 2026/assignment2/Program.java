import java.util.*;

class Profanity {

    private String[] badWords = {
            "bad", "ugly", "stupid"
    };

    public String filterText(String text) {

        for (String word : badWords) {
            text = text.replaceAll(
                    "(?i)" + word,
                    "***");
        }

        return text;
    }
}

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        Profanity obj = new Profanity();

        String result = obj.filterText(text);

        System.out.println("Filtered text: " + result);
    }
}