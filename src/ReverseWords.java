/**
 * Created by 刘灿锐 on 5/2/2017.
 * 151. Reverse Words in a String
 * Given an input string, reverse the string word by word.
 * <p>
 * For example,
 * Given s = "the sky is blue",
 * return "blue is sky the".
 * <p>
 * Update (2015-02-12):
 * For C programmers: Try to solve it in-place in O(1) space.
 */
public class ReverseWords {
    public String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+");
        StringBuilder out = new StringBuilder();
        for (int i = parts.length - 1; i > 0; i--) {
            out.append(parts[i]).append(" ");
        }
        return out + parts[0];
    }
}
