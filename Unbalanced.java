import java.util.Stack;

class Scratch {
    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '{':
                case '(':
                case '[':
                    stack.push(c); break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '[')
                        return "false"; break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(')
                        return "false"; break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{')
                        return "false"; break;

            }
        }
        if (stack.isEmpty()) {
            return "true";
        } else {
            return "false";
        }
    }
    public static void main(String[] args) {
        System.out.println(isBalanced("}{"));
        System.out.println(isBalanced("{}()"));

    }
}