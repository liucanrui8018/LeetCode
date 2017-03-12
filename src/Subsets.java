import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 刘灿锐 on 2017/3/11 0011.
 * Given a set of distinct integers, nums, return all possible subsets.
 *
 * Note: The solution set must not contain duplicate subsets.
 *
 * For example,
 * If nums = [1,2,3], a solution is:
 *
 * [
 * [3],
 * [1],
 * [2],
 * [1,2,3],
 * [1,3],
 * [2,3],
 * [1,2],
 * []
 * ]
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] S) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        Arrays.sort(S);
        for (int i : S) {
            List<List<Integer>> tmp = new ArrayList<>();
            for (List<Integer> sub : res) {
                List<Integer> a = new ArrayList<>(sub);
                a.add(i);
                tmp.add(a);
            }
            res.addAll(tmp);
        }
        return res;
    }
}
