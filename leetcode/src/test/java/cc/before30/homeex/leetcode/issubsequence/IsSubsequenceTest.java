package cc.before30.homeex.leetcode.issubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * IsSubsequenceTest
 *
 * @author before30
 * @since 2020/02/17
 */
class IsSubsequenceTest {

    @Test
    void isSubsequence() {
        IsSubsequence isSubsequence = new IsSubsequence();

        String s = "abc";
        String t = "ahbgdc";

        assertEquals(true, isSubsequence.isSubsequence(s, t));

        s = "axc";
        t = "ahbgdc";
        assertEquals(false, isSubsequence.isSubsequence(s, t));

    }
}