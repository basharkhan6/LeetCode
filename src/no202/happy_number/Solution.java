package no202.happy_number;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (!set.contains(n)) {
            set.add(n);

            n = getSumOfSquareOfElement(n);
            if (n == 1)
                return true;
        }
        return false;
    }

    private int getSumOfSquareOfElement(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += square(lastDigit);
            n /= 10;    // remove last digit from n
        }
        return sum;
    }

    private int square(int n) {
        return n * n;
    }
}
