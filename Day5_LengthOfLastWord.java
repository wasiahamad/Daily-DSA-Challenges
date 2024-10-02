public class Day5_LengthOfLastWord {
    public static int lengthOfLastWord (String s) {
        int length = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }
    public static void main(String[] args) {
        String s = "Hello World";
        // String s = "   fly me   to   the moon  ";
        // String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }
}
