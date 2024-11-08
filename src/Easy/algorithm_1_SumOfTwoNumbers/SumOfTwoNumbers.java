package algorithm_1_SumOfTwoNumbers;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwoNumbers {

    // method 1
    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] index = {i, j};
                    return index;
                }
            }
        }

        return null;
    }

    // method 2
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[]{i, numToIndex.get(target - nums[i])};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    // method 2 wrong version
    public static int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> numAndIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numAndIndex.put(nums[i], i);
            if (numAndIndex.containsKey(target - nums[i])) {
                return new int[]{i, numAndIndex.get(target - nums[i])};
            }
        }
        return new int[]{-1, -1};
    }
}
