package leetcode.characterchallenge;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcd"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), asn = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            asn = Math.max(asn, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return asn;
    }
}
