package easy.twoSum;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i + j == target) {
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }
        }
        return index;
    }

    public void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] index = twoSum(nums, target);
        System.out.println(index);
    }
}
