public class Day79_peakIndexInMountainArray {

    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int st = 0, end = n - 1;
        while (st < end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid-1]) {
                return mid;
            } else if (arr[mid] > arr[mid - 1]) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return st;
    }
    public static void main(String[] args) {
        // Your code here
        int arr[] = {0,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
}