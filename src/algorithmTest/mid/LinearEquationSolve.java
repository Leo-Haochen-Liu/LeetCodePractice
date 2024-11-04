package comp1110.lab2;

public class LinearEquationSolve {
    static double solve1(double a, double b){
        return b / a;
    }
    static void solve2(double a1, double b1, double c1, double a2, double b2, double c2){
        double x = (b2 * c1 - b1 * c2) / (a1 * b2 - a2 * b1);
        double y = (a2 * c1 - a1 * c2) / (a2 * b1 - a1 * b2);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void main(String[] args) {
        double a = 1, b = 2, c = solve1(a, b); // a != 0 !!!
        System.out.println(c);
        double a1 = 1, b1 = 2, c1 = 3, a2 = 3, b2 = 1, c2 = 4; // (a2 * b1 - a1 * b2) != 0 !!!
        solve2(a1, b1, c1, a2, b2, c2);
    }
}
