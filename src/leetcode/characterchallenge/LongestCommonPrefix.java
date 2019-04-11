package leetcode.characterchallenge;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] samples = {"aa", "a"};
        System.out.println(longestCommonPrefix(samples));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

}
