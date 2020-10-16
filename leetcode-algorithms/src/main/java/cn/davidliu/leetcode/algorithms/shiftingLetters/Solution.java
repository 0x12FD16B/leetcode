package cn.davidliu.leetcode.algorithms.shiftingLetters;

/**
 * https://leetcode-cn.com/problems/shifting-letters/
 *
 * @author David Liu
 */
public class Solution {

    // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
    // a b c d e f g h i j k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z
    // 假定 shifts 的长度为 n, 那么 shifts[i] 表示 S 中的前 i 个字符需要移动多少位
    // S = "abc", shifts = [3, 5, 9]
    // 那么
    // a 一共移动了 3 + 5 + 9 次, a => l
    // b 一共移动了 5 + 9 次
    // c 一共移动了 9 次

    // 解法一: 暴力法
    // 模拟每次 shifts 数组中的移位
    // 时间复杂度: O(N ^ 2), N 为 shifts 数组的长度
    // 空间复杂度: O(M), M 为 S 的长度
    // 提交结果: 超时
    public String shiftingLetters_method1(String S, int[] shifts) {
        if (shifts == null || shifts.length == 0) return S;

        char[] dict = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        char[] chars = new char[S.length()];
        System.arraycopy(S.toCharArray(), 0, chars, 0, shifts.length);

        for (int i = 0; i < shifts.length; i++) {
            int shift = shifts[i];
            for (int j = 0; j <= i; j++) {
                if (shift % 26 != 0) {
                    shift = shift % 26;
                    chars[j] = dict[(chars[j] - 'a' + shift) % 26];
                }
            }
        }

        return new String(chars);
    }

    // 解法二:
    // 1. 一次循环计算第一个字符需要移动的次数
    // 2. 那么 S 中第一个元素的移动次数就是 firstElementShift, 第二个元素的移动次数是 firstElementShift - (shifts[1] % 26)
    // 时间复杂度: O(N)
    // 空间复杂度: O(M)
    // N = shifts.length, M = S.length();
    public String shiftingLetters_method2(String S, int[] shifts) {
        if (shifts == null || shifts.length == 0) return S;
        long elementShift = 0;

        for (int shift : shifts) {
            elementShift += shift;
        }

        char[] chs = S.toCharArray();

        for (int i = 0; i < chs.length; i++) {
            chs[i] = (char) ('a' + ((chs[i] - 'a') + elementShift) % 26);
            elementShift -= shifts[i];
        }

        return new String(chs);
    }

    // 解法三: 解法二的优化, 因为 S 长度和 shifts 长度相等, 从后往前遍历 shifts, 在一次循环里面完成下一个元素需要移动的位置的计算和数组对应位置元素的替换
    // 1. 一次循环计算第一个字符需要移动的次数
    // 2. 那么 S 中第一个元素的移动次数就是 firstElementShift, 第二个元素的移动次数是 firstElementShift - (shifts[1] % 26)
    // 时间复杂度: O(N)
    // 空间复杂度: O(M)
    // N = shifts.length, M = S.length();
    public String shiftingLetters_method3(String S, int[] shifts) {
        if (shifts == null || shifts.length == 0) return S;
        char[] chs = S.toCharArray();

        int shift = 0;

        for (int i = shifts.length - 1; i >= 0; i--) {
            shift = (shift + shifts[i]) % 26;
            chs[i] = (char) ((chs[i] - 'a' + shift) % 26 + 97);
        }

        return new String(chs);
    }

}
