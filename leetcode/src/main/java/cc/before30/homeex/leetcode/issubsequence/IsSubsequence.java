package cc.before30.homeex.leetcode.issubsequence;

import java.util.Scanner;

/**
 * IsSubsequence
 *
 * @author before30
 * @since 2020/02/17
 *
 * https://leetcode.com/problems/is-subsequence/
 */
public class IsSubsequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();



    }

    public boolean isSubsequence(String s, String t) {
        String pattern = "[\\w]*";
        for (int i = 0; i < s.length(); i++) {
            pattern = pattern + s.charAt(i) + "[\\w]*";
        }

        return t.matches(pattern);
    }

}
