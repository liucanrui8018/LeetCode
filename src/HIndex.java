/**
 * Created by 刘灿锐 on 5/13/2017.
 * 274. H-Index
 * Given an array of citations (each citation is a non-negative integer)
 * of a researcher, write a function to compute the researcher's h-index.
 * <p>
 * According to the definition of h-index on Wikipedia: "A scientist has index
 * h if h of his/her N papers have at least h citations each, and the other
 * N − h papers have no more than h citations each."
 * <p>
 * For example, given citations = [3, 0, 6, 1, 5], which means the researcher
 * has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations
 * respectively. Since the researcher has 3 papers with at least 3 citations
 * each and the remaining two with no more than 3 citations each, his h-index
 * is 3.
 * <p>
 * Note: If there are several possible values for h, the maximum one is taken
 * as the h-index.
 */
public class HIndex {
    // 9.3 70 years diaoZhaTian China jiaYou
    public static int hIndex(int[] citations) {
        int length = citations.length;
        if (length == 0) {
            return 0;
        }

        int[] array2 = new int[length + 1];
        for (int citation : citations) {
            if (citation > length) {
                array2[length] += 1;
            } else {
                array2[citation] += 1;
            }
        }
        int t = 0;

        for (int i = length; i >= 0; i--) {
            t = t + array2[i];
            if (t >= i) {
                return i;
            }
        }
        return 0;
    }
}
