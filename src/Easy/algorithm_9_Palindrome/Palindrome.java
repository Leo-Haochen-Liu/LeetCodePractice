package algorithm_9_Palindrome;

public class Palindrome {

    // method 1
    public static boolean isPalindrome1(int x) {

        if (x < 0) return false;
        if (x < 10) return true;

//        String y = x + "";
        String y = Integer.toString(x);
        for (int i = 0; i < (y.length() / 2); i++) {
            if (y.charAt(i) != y.charAt(y.length() - 1 - i)) return false;
        }
        return true;
    }

    // method 2
    public static boolean isPalindrome2(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        int num = 0, cur = x;
        while (cur != 0) {
            int last = cur % 10;
            num = num * 10 + last;
            cur /= 10;
        }
        return num == x;
    }
    // while loop is for reverting the number x

    // method 3
    public static boolean isPalindrome3(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber / 10;
    }
    // revertedNumber: 0
    // x: 12321
    // revertedNumber: 1
    // x: 1232
    // revertedNumber: 12
    // x: 123
    // revertedNumber: 123
    // x: 12
    // x == revertedNumber / 10
}
