package no88.merge_sorted_array;

public class Solution {

    static void merge(int[] nums1 , int m , int[] nums2 , int n) {
        int i = m - 1 , j = n - 1 , idx = m + n - 1;
        while(i >= 0 && j >= 0) {
            if(nums1[i] >= nums2[j]) {
                nums1[idx] = nums1[i];
                i--;
            } else {
                nums1[idx] = nums2[j];
                j--;
            }
            idx--;
        }

        while(i >= 0)
            nums1[idx--] = nums1[i--];
        while(j >= 0)
            nums1[idx--] = nums2[j--];

        return;
    }

}
