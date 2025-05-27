public class Day85_differenceOfSums {
    public int differenceOfSums(int n, int m) {
        int sumDivisible = 0;
        int sumNotDivisible = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sumDivisible += i;
            } else {
                sumNotDivisible += i;
            }
        }

        return sumNotDivisible - sumDivisible;
    }

    public static void main(String[] args) {
        Day85_differenceOfSums solution = new Day85_differenceOfSums();
        System.out.println(solution.differenceOfSums(10, 3)); // Example usage
    }
}
