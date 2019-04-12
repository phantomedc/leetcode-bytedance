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
 * leetcode-bytedance: SimplifyPath
 *
 * @author 何硕 (Employee ID: 18032496)
 * @version 1.0.0, 2019-04-12 11:40
 * @since 1.0.0, 2019-04-12 11:40
 */
public class SimplifyPath {

    public static final String GO_UP = "..";

    public static final String SEP = "/";

    public static final String CURRENT = ".";

    public static void main(String[] args) {
        System.out.println(simplifyPath("/a/./b/../../c/"));
    }

    public static String simplifyPath(String path) {
        String[] spliteArr = path.split(SEP);
        Stack<String> pathStack = new Stack<>();
        for (int i = 0; i < spliteArr.length; i++) {
            switch (spliteArr[i]) {
                case GO_UP: {
                    if (!pathStack.isEmpty()) {
                        pathStack.pop();
                    }
                    break;
                }
                case "":
                case CURRENT:
                    break;
                default:
                    pathStack.push(spliteArr[i]);
                    break;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (pathStack.isEmpty()) {
            return stringBuilder.append("/").toString();
        }
        int stackLength = pathStack.size();
        for (int i = 0; i < stackLength; i++) {
            stringBuilder.append("/").append(pathStack.get(i));
        }
        return stringBuilder.toString();
    }
}
vi .gitignore