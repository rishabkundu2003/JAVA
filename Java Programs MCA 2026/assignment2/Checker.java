import java.util.*;

class Password {

    public int CheckPassword(String str, int n) {

        if (n < 4)
            return 0;

        if (Character.isDigit(str.charAt(0)))
            return 0;

        boolean hasDigit = false;
        boolean hasUpper = false;

        for (int i = 0; i < n; i++) {

            char ch = str.charAt(i);

            if (ch == ' ' || ch == '/')
                return 0;

            if (Character.isDigit(ch))
                hasDigit = true;

            if (Character.isUpperCase(ch))
                hasUpper = true;
        }

        if (hasDigit && hasUpper)
            return 1;

        return 0;
    }
}

public class Checker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String str = sc.nextLine();

        Password obj = new Password();

        System.out.println(obj.CheckPassword(str, str.length()));
    }
}