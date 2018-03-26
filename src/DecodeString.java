/**
 * 394. Decode String
 * Given an encoded string, return it's decoded string.
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
 * You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.
 * Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].
 * Examples:
 * s = "3[a]2[bc]", return "aaabcbc".
 * s = "3[a2[c]]", return "accaccacc".
 * s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
 */

public class DecodeString {
    public String decodeString(String s) {
        int[] i = new int[1];
        i[0] = 0;
        StringBuilder str = new StringBuilder(s);
        return decodeString(str, i);
    }

    private String decodeString(StringBuilder s, int[] i) {
        int n = 0;
        StringBuilder result = new StringBuilder();

        while (i[0] < s.length()) {
            if (Character.isDigit(s.charAt(i[0]))) {
                while (Character.isDigit(s.charAt(i[0]))) {
                    n = n * 10 + s.charAt(i[0]) - '0';
                    i[0]++;
                }
                i[0]++; // '['
                String nested = decodeString(s, i);

                while (n > 0) {
                    result.append(nested);
                    n--;
                }
            } else if (Character.isLetter(s.charAt(i[0]))) {
                result.append(s.charAt(i[0]++));
            } else if (s.charAt(i[0]) == ']') {
                i[0]++;
                return result.toString();
            }
        }

        return result.toString();
    }
}
