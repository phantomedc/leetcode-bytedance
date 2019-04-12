/*
 * Copyright © 2013-2019 Suning.com Co., Ltd.
 *
 * This file is part of leetcode-bytedance project.
 * You can not be copied and/or distributed without the express
 * permission of cloudytrace group.
 */
package leetcode.characterchallenge;

import java.util.Stack;

/**
 * leetcode-bytedance: ReserveWords
 *
 * @author 何硕 (Employee ID: 18032496)
 * @version 1.0.0, 2019-04-12 11:10
 * @since 1.0.0, 2019-04-12 11:10
 */
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
