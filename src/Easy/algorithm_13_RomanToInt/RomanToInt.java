package algorithm_13_RomanToInt;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    // method 1: using HashMap

    public static int romanToInt1(String s) {
        Map<Character, Integer> toIntMap = new HashMap<>(Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000));

        int[] arr = new int[s.length()];
        arr[0] = toIntMap.get(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            arr[i] = toIntMap.get(s.charAt(i));
            if (arr[i - 1] < arr[i]) {
                arr[i] -= arr[i - 1];
                arr[i - 1] = 0;
            }
        }

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }

    // method 2: using switch-case
    // Best Score !!!

    public static int romanToInt(String s) {

        int[] arr = new int[s.length()];
        switch (s.charAt(0)) {
            case 'I':
                arr[0] = 1;
                break;
            case 'V':
                arr[0] = 5;
                break;
            case 'X':
                arr[0] = 10;
                break;
            case 'L':
                arr[0] = 50;
                break;
            case 'C':
                arr[0] = 100;
                break;
            case 'D':
                arr[0] = 500;
                break;
            case 'M':
                arr[0] = 1000;
                break;
        }

        if (s.length() == 1) return arr[0];

        for (int i = 1; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    arr[i] = 1;
                    break;
                case 'V':
                    arr[i] = 5;
                    break;
                case 'X':
                    arr[i] = 10;
                    break;
                case 'L':
                    arr[i] = 50;
                    break;
                case 'C':
                    arr[i] = 100;
                    break;
                case 'D':
                    arr[i] = 500;
                    break;
                case 'M':
                    arr[i] = 1000;
                    break;
            }
            if (arr[i - 1] < arr[i]) {
                arr[i] -= arr[i - 1];
                arr[i - 1] = 0;
            }
        }

        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
