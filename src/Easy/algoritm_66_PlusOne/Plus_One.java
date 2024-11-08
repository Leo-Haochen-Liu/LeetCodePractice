package Easy.algoritm_66_PlusOne;

public class Plus_One {
    public static int[] plusOne(int[] digits) {
        if (digits[0] == 0) return new int[]{1};

        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1]++;
            return digits;
        } else {
            digits[digits.length - 1] = 0;
            for (int i = digits.length - 2; i >= 0; i--) {
                if (digits[i] != 9) {
                    digits[i]++;
                    return digits;
                } else {
                    digits[i] = 0;
                }
            }
        }
        if (digits[0] == 0) {
            int[] refresh = new int[digits.length + 1];
            refresh[0] = 1;
            return refresh;
        }
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(plusOne(new int[1])[0] + "\n");
        int[] input1 = {9, 9, 9};
        int[] output1 = plusOne(input1);
        for (int i = 0; i < output1.length; i++) {
            System.out.println(output1[i]);
        }
    }
}
