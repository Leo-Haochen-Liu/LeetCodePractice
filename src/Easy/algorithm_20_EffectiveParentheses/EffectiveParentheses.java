package Easy;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
import java.util.Stack;

public class EffectiveParentheses {
//    static Map<Character, Character> map1 = new HashMap<>(Map.of(
//            '(', ')',
//            '[', ']',
//            '{', '}'));
//
//    public static boolean isValid1(String s) {
//
//        if (s.length() % 2 != 0) return false;
//        if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}' ||
//        s.charAt(s.length() - 1) == '(' || s.charAt(s.length() - 1) == '[' || s.charAt(s.length() - 1) == '{')
//        return false;
//
//        if (s.equals("()") || s.equals("[]") || s.equals("{}")) return true;
//
//        int index0 = 0;
//        boolean checks1;
//        for (int i = 1; i < s.length(); i++) {
//            char a = s.charAt(0);
//            if (s.charAt(i) == map1.get(a)) {
//                if (i % 2 != 1) return false;
//                index0 = i;
//                i = s.length(); // A good way to stop the for loop
//            }
//        }
//        if (index0 == 0) return false;
//        else if (index0 == 1) {
//            checks1 = true;
//        } else {
//            StringBuilder s1 = new StringBuilder();
//            for (int i = 1; i < index0; i++) {
//                s1.append(s.charAt(i));
//            }
//            checks1 = isValid(s1.toString());
//        }
//
//        if (index0 < s.length() - 1) {
//            if (s.charAt(index0 + 1) == ']' || s.charAt(index0 + 1) == ')' || s.charAt(index0 + 1) == '}') return false;
//            StringBuilder s2 = new StringBuilder();
//            for (int i = index0 + 1; i < s.length(); i++) {
//                s2.append(s.charAt(i));
//            }
//            boolean checks2 = isValid(s2.toString());
//
//            checks1 = checks1 && checks2;
//        }
//
//        return checks1;
//    }
//
//    public static boolean isValid(String s) {
//        if (s.length() % 2 != 0) return false;
//
//        if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}' ||
//                s.charAt(s.length() - 1) == '(' || s.charAt(s.length() - 1) == '[' || s.charAt(s.length() - 1) == '{')
//            return false;
//
//        if (s.equals("()") || s.equals("[]") || s.equals("{}")) return true;
//
//        boolean checks1 = checkValid(s, 0);
//        boolean checks2;
//        boolean checks3;
//
//        int index1 = 0;
//        for (int i = 1; i < s.length(); i++) {
//            if (s.charAt(i) != s.charAt(0) && s.charAt(i) != map1.get(s.charAt(0))) {
//                index1 = i;
//                i = s.length();
//            }
//        }
//        if (index1 == 0) checks2 = true;
//        else checks2 = checkValid(s, index1);
//
//        int index2 = 0;
//        for (int i = 1; i < s.length(); i++) {
//            if (s.charAt(i) != s.charAt(0) && s.charAt(i) != map1.get(s.charAt(0))
//                    && s.charAt(i) != s.charAt(index1) && s.charAt(i) != map1.get(s.charAt(index1))) {
//                index2 = i;
//                i = s.length();
//            }
//        }
//        if (index2 == 0) checks3 = true;
//        else checks3 = checkValid(s, index2);
//
//        return checks1 && checks2 && checks3;
//    }
//
//    public static boolean checkValid(String s, int x) {
//        ArrayList<Integer> indexArr1 = new ArrayList<>();
//        ArrayList<Integer> indexArr2 = new ArrayList<>();
//        for (int i = x; i < s.length(); i++) {
//            if (s.charAt(i) == s.charAt(x)) indexArr1.add(i);
//            if (s.charAt(i) == map1.get(s.charAt(x))) indexArr2.add(i);
//        }
//        if (indexArr1.size() != indexArr2.size()) {
//            return false;
//        }
//        for (int i = 0; i < indexArr1.size(); i++) {
//            if (indexArr1.get(i) > indexArr2.get(i)) {
//                return false;
//            }
//        }
//        return true;
//    }

    static boolean isValid(String s) {

        // Stack to keep track of the opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate over each character in the string
        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push it to the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // If it's a closing bracket, check if the stack is not empty and if it matches the correct opening bracket
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
            // If no match or stack is empty, it's invalid
            else {
                return false;
            }
        }
        // If stack is empty, all brackets were matched
        return stack.isEmpty();
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
