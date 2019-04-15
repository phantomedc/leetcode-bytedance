package leetcode.characterchallenge;

public class CheckInclusion {

    public static void main(String[] args) {
        System.out.println(checkInclusion("hello", "ooolleoooleh"));
    }

    public static Boolean checkInclusion(String s1, String s2) {
        int[] map = new int[26];
        for (char ch : s1.toCharArray()) {
            map[ch - 'a']++;
        }
        boolean result = false;
        int left = 0, right;
        int len = s1.length();
        int counter = len;
        char[] ss = s2.toCharArray();
        for (right = 0; right < ss.length; ++right) {
            if (--map[ss[right] - 'a'] >= 0) {
                counter--;
            }
            if (counter == 0) {
                result = true;
                break;
            }
            if (right - left + 1 == len) {
                if (++map[ss[left] - 'a'] > 0) {
                    counter++;
                }
                left++;
            }
        }
        return result;
    }
}
