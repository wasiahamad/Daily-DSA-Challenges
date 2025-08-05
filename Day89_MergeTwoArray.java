public class Day89_MergeTwoArray {
    // merge two sorted arrays into a single sorted array
    public static void mergeArrays(int[] arr1, int[] arr2, int m, int n) {
        int i = m - 1;
        int j = n - 1;
        int x = arr1.length - 1;

        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[x] = arr1[i];
                i--;
            } else {
                arr1[x] = arr2[j];
                j--;
            }
            x--;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 0, 0, 0 };
        int[] arr2 = { 2, 4, 6 };
        int m = 3;
        int n = 3;
        mergeArrays(arr1, arr2, m, n);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}