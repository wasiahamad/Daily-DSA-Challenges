public class Day32_Pow {
    // method definition goes here
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return myPow(1 / x, -n);
        }
        if (n % 2 == 0) {
            return myPow(x * x, n / 2);
        } else {
            return x * myPow(x, n - 1);
        }
    }
    public static void main(String[] args) {
        // Your code here
        double x = 2.0;
        int n = -10;
        System.out.println(myPow(x, n));
    }
}
