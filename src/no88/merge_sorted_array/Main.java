package no88.merge_sorted_array;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int m = 20000 , n = 14000;
        int totalLength = m + n;
        int[] a = new int[totalLength];
        int[] aCopy = new int[totalLength];

        int[] randInts = IntStream.range(0, m).map(i -> new Random().nextInt(100)).sorted().toArray();
        int[] b = IntStream.range(0, n).map(i -> new Random().nextInt(100)).sorted().toArray();
        for (int i = 0; i < m; i++)
            a[i] = randInts[i];
        for (int i = 0; i < m; i++)
            aCopy[i] = randInts[i];

        long start1 = System.currentTimeMillis();
        Solution.merge(a, m, b, n);
        long end1 = System.currentTimeMillis();
        compare(aCopy, m, b, n, a);
        System.out.println(end1 - start1);


        randInts = IntStream.range(0, m).map(i -> new Random().nextInt(100)).sorted().toArray();
        b = IntStream.range(0, n).map(i -> new Random().nextInt(100)).sorted().toArray();
        for (int i = 0; i < m; i++)
            a[i] = randInts[i];
        for (int i = 0; i < m; i++)
            aCopy[i] = randInts[i];

        long start2 = System.currentTimeMillis();
        SimpleSolution.merge(a, m, b, n);
        long end2 = System.currentTimeMillis();
        compare(aCopy, m, b, n, a);
        System.out.println(end2 - start2);


        randInts = IntStream.range(0, m).map(i -> new Random().nextInt(100)).sorted().toArray();
        b = IntStream.range(0, n).map(i -> new Random().nextInt(100)).sorted().toArray();
        for (int i = 0; i < m; i++)
            a[i] = randInts[i];
        for (int i = 0; i < m; i++)
            aCopy[i] = randInts[i];

        long start3 = System.currentTimeMillis();
        MySolution.merge(a, m, b, n);
        long end3 = System.currentTimeMillis();
        compare(aCopy, m, b, n, a);
        System.out.println(end3 - start3);

        compare(aCopy, m, b, n, a);
    }

    static void compare(int[] nums1, int m, int[] nums2, int n, int[] resultArr) {
        for(int i = 0 ; i < n ; i++)
            nums1[i + m] = nums2[i];
        Arrays.sort(nums1);

        System.out.println(Arrays.equals(nums1, resultArr));
    }

}
