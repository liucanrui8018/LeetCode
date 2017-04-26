import java.util.ArrayList;
import java.util.List;

/**
 * Created by 刘灿锐 on 2017/4/24 0024.
 * 131. Palindrome Partitioning
 * Given a string s, partition s such that every substring of the partition is a palindrome.
 * <p>
 * Return all possible palindrome partitioning of s.
 * <p>
 * For example, given s = "aab",
 * Return
 * <p>
 * [
 * ["aa","b"],
 * ["a","a","b"]
 * ]
 */
public class PartitionString {
    private List<List<String>> resultLst;
    private ArrayList<String> currLst;

    public List<List<String>> partition(String s) {
        resultLst = new ArrayList<>();
        currLst = new ArrayList<>();
        backTrack(s, 0);
        return resultLst;
    }

    private void backTrack(String s, int l) {
        if (currLst.size() > 0 //the initial str could be palindrome
                && l >= s.length()) {
            List<String> r = (ArrayList<String>) currLst.clone();
            resultLst.add(r);
        }
        for (int i = l; i < s.length(); i++) {
            if (isPalindrome(s, l, i)) {
                if (l == i)
                    currLst.add(Character.toString(s.charAt(i)));
                else
                    currLst.add(s.substring(l, i + 1));
                backTrack(s, i + 1);
                currLst.remove(currLst.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String str, int l, int r) {
        if (l == r) return true;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
