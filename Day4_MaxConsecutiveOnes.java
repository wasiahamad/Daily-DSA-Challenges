/**
 * Day4-MaxConsecutiveOnes
 */
public class Day4_MaxConsecutiveOnes {

    public static int maxConsecutiveOnes (int arr[]) {
        int max = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return max = Math.max(max, count);
    }
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(maxConsecutiveOnes(nums));
    }
}