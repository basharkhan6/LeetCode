package no88.merge_sorted_array;


public class MySolution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        while (j < nums2.length) {
            if (nums2[j] > nums1[i])
                if (i-j >= m)
                    insert(nums1, i, nums2[j++]);
                else
                    i++;
            else
                insert(nums1, i, nums2[j++]);
        }
    }


    public static void insert(int[] arr, int pos, int val) {
        for (int i = arr.length-1; i > pos; i--) {
            arr[i] = arr[i-1];
        }
        arr[pos] = val;
    }

}
