package swvalerian.validparentheses;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * <p>
 * <p>
 * Example 1:
 * Input: s = "()"
 * Output: true
 * <p>
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 * <p>
 * Example 3:
 * Input: s = "(]"
 * Output: false
 * <p>
 * Example 4:
 * Input: s = "([])"
 * Output: true
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */

public class ValidParentheses {
    public static boolean isValid(String s) {
        char[] charArray = s.toCharArray();

        char roundBracket = '(';
        char squareBracket = '[';
        char curlyBracket = '{';

        Stack<Character> stack = new Stack<>();

        for (char ch : charArray) {
            if (ch == roundBracket) {
                stack.push(')');
            } else if (ch == squareBracket) {
                stack.push(']');
            } else if (ch == curlyBracket) {
                stack.push('}');
            } else if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop(); // удалим элемент
            } else {
                return false;
            }
        }

        if (stack.size() > 0) {
            return false;
        }

        return true;
    }
}
