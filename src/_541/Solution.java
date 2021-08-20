package _541;

import java.util.Stack;

class Solution {
	public static String reverseStr(String s, int k) {
		char[] ch = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < ch.length; i++) {
			if (i % (2 * k) == k) {
				for (int j = i - k; j < i; j++) {
					ch[j] = stack.pop();
				}
				continue;
			} else if (i % (2 * k) > k) {
				continue;
			} else {

				stack.push(ch[i]);

			}
		}
		int i = ch.length - stack.size();

		while (!stack.empty()) {

			ch[i] = stack.pop();
			i++;
		}
		return String.valueOf(ch);
	}

	public static void main(String[] args) {
		String s = "abcd";
		int k = 2;
		System.out.println(reverseStr(s, k));

	}
}