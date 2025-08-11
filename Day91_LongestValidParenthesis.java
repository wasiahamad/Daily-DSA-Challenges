import java.util.Stack;

public class Day91_LongestValidParenthesis {

    // 
    public static int longestValidParenthesis (String s) {
        int max = 0;
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                } 
                if (!stack.isEmpty()) {
                    max = Math.max(max, i - stack.peek());
                }
                else {
                    stack.push(i);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        // usecase example 
        String str = ")()())";
        System.out.println(longestValidParenthesis(str));

    }
}
