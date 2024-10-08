/**
 * Day12_Search In sorted rotated Array
 */
public class Day12_SearchInArray {

    public static int search(int arr[], int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int  mid = low + (high - low) / 2;

            // mid is target
            if (arr[mid] == target) {
                return mid;
            }

            // left sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                // right sorted
                if (arr[high] >= target && target > arr[mid]) {
                    low = mid + 1; 
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int result = search(arr, target);
        System.out.println("Element is present at index " + result);
    }
}