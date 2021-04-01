import java.util.Stack;

public class IsValid {
    public static void main(String[] args) {
        String s1="()";
        System.out.println(isValid(s1));
        String s2 = "()[]{}";
        System.out.println(isValid(s2));
        String s3 = "([)]";
        System.out.println(isValid(s3));
        String s4 = "{[]}";
        System.out.println(isValid(s4));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();//转成char类型的数组 方便遍历
        for (char c : chars) {
            if (c == '(' || c == '[' || c == '{') {//是左括号 即入栈
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char left = stack.pop();//栈顶元素 匹配 即出栈
                if (left == '(' && c == ')') {
                } else if (left == '[' && c == ']') {
                } else if (left == '{' && c == '}') {
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();//出栈完 栈内空 说明均匹配 返回true
    }
}
