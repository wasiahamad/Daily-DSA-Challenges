public class Day8_PalindromicNumber {
    public static boolean palindromicNumber(int n) {
        // int original = n;  // 1st Approach tc- o(n);
        // int reversed = 0;
        // while (0 < n) {
        //     int lastDigit = n % 10;
        //     reversed = (reversed * 10 )+ lastDigit;
        //     n = n / 10;
        // }
        // return original == reversed;

        // 2nd Approach

        if (n < 0 || (n % 10 == 0 && n != 0)) {
            return false;
        }

        int halfreversed = 0;
        while (halfreversed < n) {
            int lastDigit = n % 10;
            halfreversed = (halfreversed * 10) + lastDigit;
            n = n / 10;
        }
        return halfreversed == n || n == halfreversed / 10;
    }
    public static void main(String[] args) {
        int n = 12321;
        System.out.println(palindromicNumber(n));
    }
}
