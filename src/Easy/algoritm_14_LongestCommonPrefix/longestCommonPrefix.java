package algoritm_14_LongestCommonPrefix;

public class longestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return null;
        StringBuilder result = new StringBuilder();

        // find the length of the String array

        int stringLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            stringLength = (strs[i].length() < stringLength) ? strs[i].length() : stringLength;
        }

        // compare if the characters in every String is the same

        for (int i = 0; i < stringLength; i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) != strs[j + 1].charAt(i)) return result.toString();
            }
            result.append(strs[0].charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }
}
