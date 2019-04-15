package leetcode.characterchallenge;

import java.util.Stack;

public class ReserveWords {

    public static void main(String[] args) {
        System.out.println(reverseWords("    GuMinglong is a gay boy!"));
    }

    public static String reverseWords(String s) {
        String[] arr = s.split(" ");
        Stack<String> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("")) {
                stack.push(arr[i]);
            }
        }
        int stackLength = stack.size();
        for (int i = 0; i < stackLength; i++) {
            if (i > 0) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }
}
