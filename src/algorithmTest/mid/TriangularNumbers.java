package comp1110.lab2;

public class TriangularNumbers {
    static int triangularNumber(int n){
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        // n should be integer >= 0
        int n = 10;
        System.out.println("the " + n + ":th triangular number is " + triangularNumber(n));
        n = 0;
        System.out.println("the " + n + ":th triangular number is " + triangularNumber(n));
    }
}
