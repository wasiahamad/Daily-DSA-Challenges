
public class Day1_ThirdMax {
    public static int thirdMax(int arr[]) {
        int max1 = Integer.MIN_VALUE,
        max2 = Integer.MIN_VALUE, 
        max3 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && max2 != max1) {
                max3 = max2;
                max2 = arr[i];
            } else if (arr[i] > max3 && max2 != max3 && max3 != max1) {
                max3 = arr[i];
            }
        }
        if (max3 == Integer.MIN_VALUE) {
            return max1;
        }
        return max3;

    }
    public static void main(String[] args) {
        int[] nums = {2,2,3,1};
    }
}
