import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//		String data = scanner.next();
//		int result = 0;
//		int len = data.length();
//		for (int i = 0; i < len; i++) {
//			char temp = data.charAt(i);
//			if (temp == 'A')
//				result += 10 * Math.pow(16, len-i-1);
//			if (temp == 'B')
//				result += 11 * Math.pow(16, len-i-1);
//			if (temp == 'C')
//				result += 12 * Math.pow(16, len-i-1);
//			if (temp == 'D')
//				result += 13 * Math.pow(16, len-i-1);
//			if (temp == 'E')
//				result += 14 * Math.pow(16, len-i-1);
//			if (temp == 'F')
//				result += 15 * Math.pow(16, len-i-1);
//			if (temp >= '0' && temp <= '9')
//				result += (temp - '0') * Math.pow(16, len-i-1);
//		}
		System.out.println(minDistance("abc","def"));
	}

	private static int minDistance(String word1, String word2) {
		int m = word1.length();
		int n = word2.length();

		int[][] cost = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++)
			cost[i][0] = i;
		for (int i = 1; i <= n; i++)
			cost[0][i] = i;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (word1.charAt(i) == word2.charAt(j))
					cost[i + 1][j + 1] = cost[i][j];
				else {
					int a = cost[i][j];
					int b = cost[i][j + 1];
					int c = cost[i + 1][j];
					cost[i + 1][j + 1] = a < b ? (a < c ? a : c) : (b < c ? b : c);
					cost[i + 1][j + 1]++;
				}
			}
		}
		return cost[m][n];
	}
}
