package Easy.algorithm_126_Fibonacci;

public class Fibonacci {

    // 递归都可以被写成for循环吗？
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0;
        int b = 1;
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = (a + b) % 1000000007;
            a = b;
            b = result;
        }

        return result;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("n = " + i + ", output: " + fib(i));
        }
    }
}
