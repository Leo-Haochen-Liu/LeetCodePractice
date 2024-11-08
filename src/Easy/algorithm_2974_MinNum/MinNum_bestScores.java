package algorithm_2974_MinNum;

import java.util.Arrays;

public class MinNum_bestScores {

    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i += 2) {
            int t = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = t;
        }
        return nums;
    }
}
