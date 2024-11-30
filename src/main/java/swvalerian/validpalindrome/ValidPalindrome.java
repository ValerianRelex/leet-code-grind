package swvalerian.validpalindrome;


/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 *
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * Example 3:
 *
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 2 * 105
 * s consists only of printable ASCII characters.
 */

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Zа-яА-Я0-9]", "").toLowerCase();

        char[] charsSeq1 = s.substring(0, s.length() / 2).toCharArray();
        char[] charsSeq2 = s.substring(s.length() / 2).toCharArray();

        for (int i = 0; i < s.length() / 2; i++) {
            if (charsSeq1[i] != charsSeq2[charsSeq2.length -i -1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome_ver2(String s) {
        s = s.replaceAll("[^a-zA-Zа-яА-Я0-9]", "").toLowerCase(); // это долго, поэтому по времени разницы не видно между ver1 и ver2

        char[] charsSeq = s.toCharArray();

        for (int i = 0; i < charsSeq.length / 2; i++) {
            if (charsSeq[i] != charsSeq[charsSeq.length -i -1]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome_ver3(String s) {
        // Реализовать более быструю проверку, основанную на двух индексах!
        // А еще можно организовать проверку с помощью StringBuilder!
        return true;
    }
}
