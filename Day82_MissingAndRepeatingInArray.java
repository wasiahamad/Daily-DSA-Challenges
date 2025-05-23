public class Day82_MissingAndRepeatingInArray {

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int sq = n*n;
        int currSum = 0;
        int ans[] = new int[2];
        int set[] = new int[sq+1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (set[grid[i][j]] != 0) {
                    ans[0] = grid[i][j];
                } else {
                    set[grid[i][j]] = 1;
                    currSum += grid[i][j];
                }
            }
        }

        ans[1] = sq*(sq+1)/2 - currSum;
        return ans;
    }
    public static void main(String[] args) {
        // function call
        int grid[][] = { {9,1,7 }, { 8,9,2 }, { 3, 4, 6} };
        Day82_MissingAndRepeatingInArray obj = new Day82_MissingAndRepeatingInArray();
        int ans[] = obj.findMissingAndRepeatedValues(grid);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
