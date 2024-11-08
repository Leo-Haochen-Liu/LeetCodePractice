package Easy.algorithm_191_Bits1OfBinary;

public class Bits1OfBinary {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1; // 检查当前位是否为 1
            n >>>= 1;       // 无符号右移，处理高位的设置位
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
        System.out.println(hammingWeight(128));
        System.out.println(hammingWeight(2147483645));
        int a = 7; // 111
        int b = 5; // 101
        int result = a & b; // 101
        System.out.println(result);
        a = 5; // 101
        b = 3; // 011
        result = a & b; // 1
        System.out.println(result);
        int n = 6;  // 110
        n >>>= 1;   // 11
        System.out.println(n);  // 11
    }
}
