package algorithm_1_SumOfTwoNumbers;

public class Main {
    public static void main(String[] args) {
//        System.out.println("\n");
        int[] num1 = {2, 7, 11, 15};
        int tar1 = 9;
        int[] twoSum1 = SumOfTwoNumbers.twoSum2(num1, tar1); // should be [0, 1]
        System.out.println(twoSum1[0] + ", " + twoSum1[1]);

//        System.out.println("\n");
        int[] num2 = {3, 2, 4};
        int tar2 = 6;
        int[] twoSum2 = SumOfTwoNumbers.twoSum2(num2, tar2); // should be [1, 2]
        System.out.println(twoSum2[0] + ", " + twoSum2[1]);

//        System.out.println("\n");
        int[] num3 = {3, 3};
        int tar3 = 6;
        int[] twoSum3 = SumOfTwoNumbers.twoSum2(num3, tar3); // should be [0, 1]
        System.out.println(twoSum3[0] + ", " + twoSum3[1]);

//        System.out.println("\n");
        int[] num4 = {2, 5, 5, 15};
        int tar4 = 10;
        int[] twoSum4 = SumOfTwoNumbers.twoSum2(num4, tar4); // should be [1, 2]
        System.out.println(twoSum4[0] + ", " + twoSum4[1]);

//        System.out.println("\n");
        int[] twoSum5 = SumOfTwoNumbers.twoSum3(num1, tar1); // should be [0, 1]
        System.out.println(twoSum5[0] + ", " + twoSum5[1]);

//        System.out.println("\n");
        int[] twoSum6 = SumOfTwoNumbers.twoSum3(num2, tar2); // should be [1, 2]
        System.out.println(twoSum6[0] + ", " + twoSum6[1]);

//        System.out.println("\n");
        int[] twoSum7 = SumOfTwoNumbers.twoSum3(num3, tar3); // should be [0, 1]
        System.out.println(twoSum3[0] + ", " + twoSum3[1]);

//        System.out.println("\n");
        int[] twoSum8 = SumOfTwoNumbers.twoSum3(num4, tar4); // should be [1, 2]
        System.out.println(twoSum4[0] + ", " + twoSum4[1]);
    }
}
