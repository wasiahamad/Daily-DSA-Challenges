import java.util.HashMap;

public class Day84_longestPalindrome {
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> freq = new HashMap<>();
        int length = 0;
        boolean hasMiddle = false;

        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        for (String word : freq.keySet()) {
            String rev = new StringBuilder(word).reverse().toString();
            int count = freq.get(word);

            if (!word.equals(rev)) {
                if (freq.containsKey(rev)) {
                    int pairs = Math.min(count, freq.get(rev));
                    length += pairs * 4;
                    // Mark both as used
                    freq.put(word, count - pairs);
                    freq.put(rev, freq.get(rev) - pairs);
                }
            } else {
                // word is a palindrome like "aa"
                int pairs = count / 2;
                length += pairs * 4;
                freq.put(word, count % 2);  // leave 1 if odd
            }
        }

        // Check for a single palindrome word left for center
        for (String word : freq.keySet()) {
            if (word.charAt(0) == word.charAt(1) && freq.get(word) > 0) {
                length += 2;
                break;
            }
        }

        return length;
    }

    public static void main(String[] args) {
        // Your code here
        String[] words = {"lc","cl","gg"};
        Day84_longestPalindrome solution = new Day84_longestPalindrome();
        System.out.println(solution.longestPalindrome(words));
        
    }
}
