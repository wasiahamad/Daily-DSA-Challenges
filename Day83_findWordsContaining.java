import java.util.ArrayList;
import java.util.List;

public class Day83_findWordsContaining {

    public List<Integer> findWordsContaining(String[] words, char x) {
        // Your code here
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                result.add(i);
        }
        }
        return result;

    }
    public static void main(String[] args) {
        // Your code here
        String[] words = {"apple", "banana", "cherry", "date", "elderberry"};
        char x = 'a';
        Day83_findWordsContaining solution = new Day83_findWordsContaining();
        List<Integer> result = solution.findWordsContaining(words, x);
        System.out.println(result);
    }
}
