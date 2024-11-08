package Easy.algorithm_20_EffectiveParentheses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EffectiveParenthesesTry {
    static boolean isValid(String s) {

        List<Character> arr = new ArrayList<>();
        Map<Character, Character> map = new HashMap<>(Map.of(
                '(', ')',
                '[', ']',
                '{', '}',
                ')', '(',
                ']', '[',
                '}', '{'
        ));

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') arr.add(s.charAt(i));
            else if (arr.size() != 0 && arr.get(arr.size() - 1) == map.get(s.charAt(i))) {
                arr.remove(arr.size() - 1);
            } else return false;
        }

        return arr.size() == 0;
    }

    public static void main(String[] args) {
        String s = "([{)]}";
        System.out.println(isValid(s) + "\n"); // false
        String s0 = "([]){}";
        System.out.println(isValid(s0) + "\n"); // true
        String s1 = "()";
        System.out.println(isValid(s1) + "\n"); // true
        String s2 = "()[]";
        System.out.println(isValid(s2) + "\n"); // true
        String s3 = "([)]";
        System.out.println(isValid(s3) + "\n"); // false
        String s4 = "([])";
        System.out.println(isValid(s4) + "\n"); // true
    }
}
