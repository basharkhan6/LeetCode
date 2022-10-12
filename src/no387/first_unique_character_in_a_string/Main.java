package no387.first_unique_character_in_a_string;

import java.util.HashMap;

public class Main {
    public static int firstUniqChar(String s) {
        if (s == null || s.length() == 0) return -1;

        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (map.get(c) == 1) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}
