package Easy.algorithm_69_sqrt;

public class sqrt {
    public int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }

    public static int sqrt2(int x) {
        if (x < 2) {
            return x; // 0和1的平方根直接返回x
        }

        int left = 1, right = x / 2;
        int result = 0;

        // 二分查找范围在[1, x / 2]内
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // 使用long避免乘法溢出
            long square = (long) mid * mid;

            if (square == x) {
                return mid; // 找到准确的平方根
            } else if (square < x) {
                left = mid + 1; // 搜索右半部分
                result = mid; // 记录可能的结果
            } else {
                right = mid - 1; // 搜索左半部分
            }
        }

        return result; // 返回向下取整的结果
    }

    public static void main(String[] args) {
        System.out.println("official sqrt = " + Math.sqrt(2) + "\nint sqrt = " + sqrt2(2));
        System.out.println("official sqrt = " + Math.sqrt(5) + "\nint sqrt = " + sqrt2(5));
        System.out.println("official sqrt = " + Math.sqrt(36) + "\nint sqrt = " + sqrt2(36));
    }
}
