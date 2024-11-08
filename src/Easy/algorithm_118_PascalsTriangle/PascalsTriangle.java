package Easy.algorithm_118_PascalsTriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    // 杨辉三角 力扣版本的解法：用 List<List<Integer>> 来解
    public static List<List<Integer>> generate(int numRows) {

        if (numRows == 0) return null;

        List<List<Integer>> result = new ArrayList<>();

        result.add(0, new ArrayList<>(Arrays.asList(1)));

        if (numRows == 1) return result;

        result.add(1, new ArrayList<>(Arrays.asList(1, 1)));

        if (numRows == 2) return result;

        for (int i = 2; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int j = 1; j < i; j++) {
                list.add(result.get(i - 1).get(j) + result.get(i - 1).get(j - 1));
            }
            list.add(1);
            result.add(i, list);
        }
        return result;
    }

    // 简单的二维数组解法：
    public static int[][] YangHuiTriangle(int rounds) {
        if (rounds == 0) return null;
        if (rounds == 1) return new int[][]{{1}};
        if (rounds == 2) return new int[][]{{1}, {1, 1}};
        int[][] arr = new int[rounds][rounds];
        arr[0][0] = 1;
        arr[1][0] = 1;
        arr[1][1] = 1;
        for (int i = 2; i < rounds; i++) {
            arr[i][0] = 1;
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
            arr[i][i] = 1;
        }
        return arr;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = PascalsTriangle.generate(10);
        for (List<Integer> row : result) {
            for (Integer num : row) {
                System.out.print(num + " ");
            }
            System.out.println();  // 打印完一行换行
        }

        int[][] YangHui = YangHuiTriangle(10);
        for (int[] row : YangHui) {
            for (int element : row) {
                if (element != 0) System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
