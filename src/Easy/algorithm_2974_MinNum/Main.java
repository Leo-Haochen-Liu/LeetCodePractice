package algorithm_2974_MinNum;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {5, 4, 2, 3};
        int[] nums2 = {2, 5};

        int[] arr1 = MinNumTry1.numberGame(nums1);
        int[] arr2 = MinNumTry1.numberGame(nums2);
        int[] arr3 = MinNumTry2.numberGame(nums1);
        int[] arr4 = MinNumTry2.numberGame(nums2);

        System.out.println("\n");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("\n");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        System.out.println("\n");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        System.out.println("\n");
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }
    }
}
