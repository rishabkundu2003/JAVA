import java.util.*;

class Checker {

    public boolean hasUniqueCharacters(String str) {

        Set<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {

            if (set.contains(ch))
                return false;

            set.add(ch);
        }

        return true;
    }
}

public class Unique {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Checker obj = new Checker();

        if (obj.hasUniqueCharacters(str))
            System.out.println("All characters are unique.");
        else
            System.out.println("String contains duplicate characters.");
    }
}