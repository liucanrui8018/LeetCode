import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String data = scanner.next();
		int result = 0;
		int len = data.length();
		for (int i = 0; i < len; i++) {
			char temp = data.charAt(i);
			if (temp == 'A')
				result += 10 * Math.pow(16, len-i-1);
			if (temp == 'B')
				result += 11 * Math.pow(16, len-i-1);
			if (temp == 'C')
				result += 12 * Math.pow(16, len-i-1);
			if (temp == 'D')
				result += 13 * Math.pow(16, len-i-1);
			if (temp == 'E')
				result += 14 * Math.pow(16, len-i-1);
			if (temp == 'F')
				result += 15 * Math.pow(16, len-i-1);
			if (temp >= '0' && temp <= '9')
				result += (temp - '0') * Math.pow(16, len-i-1);
		}
		System.out.println(result);
	}
}
