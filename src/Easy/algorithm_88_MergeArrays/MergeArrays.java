package Easy.algorithm_88_MergeArrays;

import java.util.Arrays;

public class MergeArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        }
        int x = m - 1;
        int y = n - 1;
        int i = (m + n - 1);
        while (Math.min(x, y) >= 0) {
            if (nums1[x] > nums2[y]) nums1[i--] = nums1[x--];
            else nums1[i--] = nums2[y--];
        }
        while (x >= 0) {
            nums1[i--] = nums1[x--];
        }
        while (y >= 0) {
            nums1[i--] = nums2[y--];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {2, 5, 6};
        merge(arr1, (arr1.length - arr2.length), arr2, arr2.length);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
