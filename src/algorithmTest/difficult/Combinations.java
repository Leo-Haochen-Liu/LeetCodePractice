package comp1110.lab3;

public class Combinations {
    // (n choose k) = n!/(k! (n-k)!),
    static long factorial(int n){
        if(n == 0)
            return 1;
        long total = n * factorial(n - 1);
        return total;
    }
    static long choose1(int n, int k){
        long total = factorial(n) / (factorial(k) * factorial(n - k));
        return total;
    }

    static int choose(int n, int k){
        if(k == 0 || k == n)
            return 1;
        else {
            int total = choose(n - 1, k) + choose(n - 1, k - 1);
            return total;
        }
    }

    public static void main(String[] args) {
        System.out.println(choose(5, 1));
        System.out.println(choose(15, 7));
        System.out.println(choose1(5, 1));
        System.out.println(choose1(15, 7));
    }
}
