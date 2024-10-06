/**
 * Day9_twoSum
 */
import java.util.*;
public class Day9_twoSum {

    public static int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> map = new HashMap<>();
       for (int  i = 0; i < nums.length; i++) {
            int findMe = target - nums[i];
            if(map.containsKey(findMe) ){
                return new int[]{i, map.get(findMe)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}