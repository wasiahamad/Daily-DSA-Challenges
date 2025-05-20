public class Day80_SingleElementInSorted {

    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int st = 0;
        int end = n - 1;

        if (n == 1) {
            return nums[0];
        }

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (mid == 0 && nums[0] != nums[1]) {
                return nums[0];
            }

            if ((mid == n - 1 && nums[n - 1] != nums[n - 2])) {
                return nums[mid];
            }

            // mid is answer
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            // mid is even
            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid - 1]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else {
                // mid is odd
                if (nums[mid] == nums[mid - 1]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 3, 7, 7, 10, 11, 11 };
        System.out.println(singleNonDuplicate(nums));
    }
}
