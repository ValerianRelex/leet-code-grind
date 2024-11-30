package swvalerian.validparentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void isValid_testCase1() {
        String input = "()";

        Boolean result = ValidParentheses.isValid(input);

        assertEquals(true, result);
    }

    @Test
    void isValid_testCase2() {
        String input = "()[]{}";

        Boolean result = ValidParentheses.isValid(input);

        assertEquals(true, result);
    }

    @Test
    void isValid_testCase3() {
        String input = "(]";

        Boolean result = ValidParentheses.isValid(input);

        assertEquals(false, result);
    }

    @Test
    void isValid_testCase4() {
        String input = "([])";

        Boolean result = ValidParentheses.isValid(input);

        assertEquals(true, result);
    }

    @Test
    void isValid_testCase5() {
        String input = "(){[]}";

        Boolean result = ValidParentheses.isValid(input);

        assertEquals(true, result);
    }

    @Test
    void isValid_testCase6() {
        String input = "(";

        Boolean result = ValidParentheses.isValid(input);

        assertEquals(false, result);
    }

    @Test
    void isValid_testCase7() {
        String input = "((";

        Boolean result = ValidParentheses.isValid(input);

        assertEquals(false, result);
    }

    @Test
    void isValidWithoutUseStack_testCase1() {
        String input = "((";

        Boolean result = ValidParentheses.isValid(input);

        assertEquals(false, result);
    }
}