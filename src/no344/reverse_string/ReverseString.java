package no344.reverse_string;

import java.util.Arrays;

public class ReverseString {

    public static void reverseString(char[] s) {
        char tmp;
        for (int i = 0; i < s.length/2; i++) {
            tmp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = tmp;
        }
    }

    public static void main(String[] args) {
        String s = "BASHAR";
        char[] chars = s.toCharArray();

        reverseString(chars);
        System.out.println(Arrays.toString(chars).replaceAll(", ", ""));
    }
}
