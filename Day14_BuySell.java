public class Day14_BuySell {
    public static int maxProfit(int arr[]) {
        int n = arr.length;
        int maxProfit = 0;
        int buy = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (buy < arr[i]) {
                int profit = arr[i] - buy;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buy = arr[i];
            }
        } 
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
