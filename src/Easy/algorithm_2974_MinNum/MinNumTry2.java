package algorithm_2974_MinNum;

public class MinNumTry2 {

    public static int[] numberGame(int[] nums) {
        int minNum = 0;
        int[] arr = new int[nums.length];

        for (int i = nums.length; i != 0; i -= 2) {
            arr[nums.length - i + 1] = nums[numMinIndex(nums)];
            nums[numMinIndex(nums)] = 2147483647;
            arr[nums.length - i] = nums[numMinIndex(nums)];
            nums[numMinIndex(nums)] = 2147483647;
        }

        return arr;
    }

    public static int numMinIndex(int[] num) {
        int MIN_ARR = num[0];
        int index = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] < MIN_ARR) {
                MIN_ARR = num[i];
                index = i;
            }
        }

        return index;
    }
}
