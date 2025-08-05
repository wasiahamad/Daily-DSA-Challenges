public class Day88_findMissingAndRepeatedValues {
    // Function to find missing and repeated values
    public static int[] findMissingAndRepeated(int[][] grid) {
        int n = grid.length;
        int sq = n * n;
        int currSum = 0;
        int ans[] = new int[2];
        int counter[] = new int[sq + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (counter[grid[i][j]] != 0) {
                    ans[0] = grid[i][j];
                } else {
                    counter[grid[i][j]] = 1;
                    currSum += grid[i][j];
                }
            }
        }
        int totalSum = sq * (sq + 1) / 2;
        ans[1] = totalSum - currSum;
        return ans;
    }

    public static void main(String[] args) {
        // Function call
        int grid[][] = { { 9, 1, 7 }, { 8, 9, 2 }, { 3, 4, 6 } };
        int ans[] = findMissingAndRepeated(grid);
        System.out.println(ans[0] + " " + ans[1]);
    }
}