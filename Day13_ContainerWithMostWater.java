public class Day13_ContainerWithMostWater {
    public static int mostWater(int arr[]) {
        int maxWater = 0;
        int lf = 0;
        int rt = arr.length - 1;
        while (lf < rt) {
            int ht = Math.min(arr[lf], arr[rt]);
            int wt = rt - lf;
            maxWater = Math.max(maxWater, ht * wt);
            if (arr[lf] < arr[rt]) {
                lf++;
            } else {
                rt--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7} ;
        System.out.println(mostWater(height));
    }
}