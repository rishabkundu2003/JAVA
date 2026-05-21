import java.util.*;

class Phone {

    private static final String[] KEYS = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits == null || digits.length() == 0)
            return result;

        backtrack(result, "", digits, 0);

        return result;
    }

    private void backtrack(List<String> result,
                           String current,
                           String digits,
                           int index) {

        if (index == digits.length()) {
            result.add(current);
            return;
        }

        String letters = KEYS[digits.charAt(index) - '0'];

        for (char ch : letters.toCharArray()) {
            backtrack(result,
                    current + ch,
                    digits,
                    index + 1);
        }
    }
}

public class Comb {
    public static void main(String[] args) {

        Phone obj = new Phone();

        String digits = "23";

        System.out.println(obj.letterCombinations(digits));
    }
}