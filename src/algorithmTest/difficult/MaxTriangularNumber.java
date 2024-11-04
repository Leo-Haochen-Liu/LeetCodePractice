package comp1110.lab3;

public class MaxTriangularNumber {
    static int maxTriangularNumber(int limit){
        int i = 0;
        for(; ((i + 1) * (i + 2) / 2) <= limit; i++){
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(maxTriangularNumber(0));
        System.out.println(maxTriangularNumber(2));
        System.out.println(maxTriangularNumber(3));
    }
}
