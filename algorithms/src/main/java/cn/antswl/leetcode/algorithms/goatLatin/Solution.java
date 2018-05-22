package cn.antswl.leetcode.algorithms.goatLatin;

import java.util.ArrayList;
import java.util.List;

/**
 * Goat Latin
 *
 * problem source: https://leetcode.com/problems/goat-latin/description/
 *
 * @author david-liu
 * @date May 22, 2018
 */
public class Solution {

    public String toGoatLatin(String S) {
        String[] words = S.split(" ");
        List<Character> vowels = new ArrayList<>();
        for (char vowel : new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}) {
            vowels.add(vowel);
        }
        int n = 1;
        String ma = "ma";
        char a = 'a';
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            char firstLetter = word.charAt(0);
            if (vowels.contains(firstLetter)) {
                sb.append(word).append(ma);
            } else {
                sb.append(word.substring(1)).append(word.charAt(0)).append(ma);
            }
            for (int i = 0; i < n; i++) {
                sb.append(a);
            }
            sb.append(" ");
            n++;
        }
        return sb.toString().trim();
    }
}
