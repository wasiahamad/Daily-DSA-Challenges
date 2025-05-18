public class Day78_RemoveOccurrences {

    public static String removeOccurrence(String s, String part) {
        StringBuilder sb = new StringBuilder();

        int n = s.length();
        int m = part.length();

        for (int i = 0; i < n; i++) {
            sb.append(s.charAt(i));

            if (sb.length() >= m && sb.substring(sb.length() - m).equals(part)) {
                sb.delete(sb.length() - m, sb.length());
            }

        }

        return sb.toString();
    } //String 


    public static void main(String[] args) {
        // Your code here
        String s = "daabcbaabcbc";
        String part = "abc";
        System.out.println(removeOccurrence(s, part));
    }
}