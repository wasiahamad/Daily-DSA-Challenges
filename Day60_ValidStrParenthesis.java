public class Day60_ValidStrParenthesis {
    public static boolean checkValidString(String s) {
        int low = 0; // Minimum possible open parentheses
        int high = 0; // Maximum possible open parentheses

        for (char c : s.toCharArray()) {
            if (c == '(') {
                low++;
                high++;
            } else if (c == ')') {
                low = Math.max(low - 1, 0);
                high--;
            } else if (c == '*') {
                low = Math.max(low - 1, 0); // '*' as ')' or empty
                high++; // '*' as '('
            }
            // If high < 0, it means we have too many ')'
            if (high < 0) {
                return false;
            }
        }

        // After processing all characters, low must be 0 for a valid string
        return low == 0;
    }

}