package algorithm_9_Palindrome;

public class Main {
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome1(121)); // should be true
        System.out.println(Palindrome.isPalindrome1(-121)); // should be false
        System.out.println(Palindrome.isPalindrome1(10)); // should be false
        System.out.println(Palindrome.isPalindrome1(5)); // should be true

        System.out.println("\n");

        System.out.println(Palindrome.isPalindrome2(121)); // should be true
        System.out.println(Palindrome.isPalindrome2(-121)); // should be false
        System.out.println(Palindrome.isPalindrome2(10)); // should be false
        System.out.println(Palindrome.isPalindrome2(5)); // should be true

        System.out.println("\n");

        System.out.println(Palindrome.isPalindrome3(121)); // should be true
        System.out.println(Palindrome.isPalindrome3(-121)); // should be false
        System.out.println(Palindrome.isPalindrome3(10)); // should be false
        System.out.println(Palindrome.isPalindrome3(5)); // should be true
    }
}
