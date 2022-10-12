package no169.majority_element;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 3, 5, 3, 2, 2, 3};
        int[] arr2 = {1, 1, 3, 5, 3, 2, 2, 3};
        System.out.println(maxFreq(arr2, arr2.length));
    }

    static int maxFreq(int []arr, int n) {

        // using moore's voting algorithm
        int res = 0;
        int count = 1;
        for(int i = 1; i < n; i++) {
            if(arr[i] == arr[res]) {
                count++;
            } else {
                count--;
            }

            if(count == 0) {
                res = i;
                count = 1;
            }

        }

        return arr[res];
    }
}
