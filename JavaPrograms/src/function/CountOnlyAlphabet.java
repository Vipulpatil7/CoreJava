package function;

import java.util.Scanner;

public class CountOnlyAlphabet {

	public int countAm(String s) {
		String str = s.toLowerCase();
		int cnt = 0;

		String a[] = str.split(" ");
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals("am")) {
				cnt++;
			}
		}

		return cnt;
	}

	public static void main(String[] args) {
		CountOnlyAlphabet countOnlyAlphabet = new CountOnlyAlphabet();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String input = scanner.nextLine();
		scanner.close();

		int result = countOnlyAlphabet.countAm(input);
		System.out.println("Number of 'am' occurrences: " + result);
	}
}
