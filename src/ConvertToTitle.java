/**
 * Created by 刘灿锐 on 5/3/2017.
 * 168. Excel Sheet Column Title
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 * <p>
 * For example:
 * <p>
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 */
public class ConvertToTitle {
    public String convertToTitle(int n) {
        return n == 0 ? "" :
                convertToTitle(--n / 26) +
                        (char) ('A' + (n % 26));
    }
}
