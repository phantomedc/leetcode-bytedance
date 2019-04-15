package leetcode.characterchallenge;

import java.util.Stack;

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