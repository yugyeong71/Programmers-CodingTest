package org.example.Lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Lv2. 줄 서는 방법
 */
public class WaysToLineUp {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		long k = Long.parseLong(br.readLine());

		System.out.println(Arrays.toString(solution(n, k)));
	}

	public static int[] solution(int n, long k) {
		List<Integer> numberList = new ArrayList<>();
		int[] answer = new int[n];

		for (int i = 1; i <= n; i++) {
			numberList.add(i);
		}

		long factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}

		k--;

		for (int i = 0; i < n; i++) {
			factorial /= (n - i);
			int index = (int) (k / factorial);
			answer[i] = numberList.get(index);
			numberList.remove(index);
			k %= factorial;
		}

		return answer;
	}
}
