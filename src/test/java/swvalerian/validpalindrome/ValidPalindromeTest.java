package swvalerian.validpalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void isPalindrome_case1() {
        String s = "A man, a plan, a canal: Panama";
        boolean expected = true;

        boolean result = ValidPalindrome.isPalindrome(s);

        assertEquals(expected, result);
    }

    @Test
    void isPalindrome_case2() {
        String s = " ";
        boolean expected = true;

        boolean result = ValidPalindrome.isPalindrome(s);

        assertEquals(expected, result);
    }

    @Test
    void isPalindrome_case3() {
        String s = "race a car";
        boolean expected = false;

        boolean result = ValidPalindrome.isPalindrome(s);

        assertEquals(expected, result);
    }

    @Test
    void isPalindrome_case4() {
        String s = "Ma M aM";
        boolean expected = true;

        boolean result = ValidPalindrome.isPalindrome(s);

        assertEquals(expected, result);
    }

    // for ver_2
    @Test
    void isPalindrome_ver2_case1() {
        String s = "A man, a plan, a canal: Panama";
        boolean expected = true;

        boolean result = ValidPalindrome.isPalindrome_ver2(s);

        assertEquals(expected, result);
    }

    @Test
    void isPalindrome_ver2_case2() {
        String s = " ";
        boolean expected = true;

        boolean result = ValidPalindrome.isPalindrome_ver2(s);

        assertEquals(expected, result);
    }

    @Test
    void isPalindrome_ver2_case3() {
        String s = "race a car";
        boolean expected = false;

        boolean result = ValidPalindrome.isPalindrome_ver2(s);

        assertEquals(expected, result);
    }

    @Test
    void isPalindrome_ver2_case4() {
        String s = "Ma M aM";
        boolean expected = true;

        boolean result = ValidPalindrome.isPalindrome_ver2(s);

        assertEquals(expected, result);
    }
}