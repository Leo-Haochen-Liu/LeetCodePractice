package algorithm_2974_MinNum;

import java.util.ArrayList;

public class MinNumTry1 {
    public static int[] numberGame(int[] nums) {

        // nums.length is even number

        int[] arr = new int[nums.length];
        ArrayList<Integer> numList = new ArrayList<Integer>();
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        // convert nums into numList
        for (int i = 0; i < nums.length; i++) {
            numList.add(i, nums[i]);
        }

        // Alice and Bob remove the smallest number from nums
        // and add them in arr (Alice remove first and Bob add first)
        for (int i = 0; numList.size() != 0; i += 2) {
            int minArrAlice = numList.get(0);
            minArrAlice = removeMinAndRestore(numList, minArrAlice);

            int minArrBob = numList.get(0);
            minArrBob = removeMinAndRestore(numList, minArrBob);

            arrList.add(i, minArrBob);
            arrList.add(i + 1, minArrAlice);
        }

        // convert arrList into arr
        for (int i = 0; i < arrList.size(); i++) {
            arr[i] = arrList.get(i);
        }

        return arr;
    }

    // remove the min from numberList and restore min in MIN_ARR
    public static int removeMinAndRestore(ArrayList<Integer> numberList, int MIN_ARR) {
        int index = 0;
        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i) < MIN_ARR) {
                MIN_ARR = numberList.get(i);
                index = i;
            }
        }
        numberList.remove(index);
        return MIN_ARR;
    }
}
