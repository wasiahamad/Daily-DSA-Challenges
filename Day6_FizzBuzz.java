import java.util.*;
public class Day6_FizzBuzz {
    public static ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                result.add("Fizz");
            } else if (i % 3 != 0 && i % 5 == 0) {
                result.add("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 12;
        System.out.println(fizzBuzz(n));
    }
}
