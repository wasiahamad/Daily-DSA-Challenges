public class Day16_findMinimum {
    public static int findMinimum(int arr[]) {
        int lf = 0; 
        int rt = arr.length - 1;
        while(lf < rt) {
            int mid = lf + (rt - lf) / 2;
            if (arr[mid] > arr[rt]) {
                lf = mid + 1;
            } else {
                rt = mid;
            }
        }
        return arr[lf];
    }

    public static void main(String[] args) {
        int height[] = {3,4,5,1,2};
        System.out.println("Minimum height is " + findMinimum(height));
        // System.out.println("Minimum height is " + findMinimum(height));
    }
}