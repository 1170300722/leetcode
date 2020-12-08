package _3;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
		int num = 1;
		if (s == null || s.equals("")) {
			return 0;
		}
		if (s.length() == 1) {
			return 1;
		}
		for (num = 2; num <= s.length(); num++) {
			boolean doExist = false;
			for (int i = 0; i < s.length() - num + 1; i++) {
				String tempString = s.substring(i, i + num);
				if (checkDuplicate(tempString)) {
					continue;
				} else {
					doExist = true;
					break;
				}
			}
			if (doExist) {
				continue;
			} else {
				num--;
				break;
			}
		}
		if (num > s.length()) {
			num--;
		}
		return num;

	}

	public static boolean checkDuplicate(String tempString) {
		char[] temp = tempString.toCharArray();
		for (int i = 0; i < temp.length; i++) {
			for (int j = i + 1; j < temp.length; j++) {
				if (temp[i] == temp[j]) {
					return true;
				}
			}
		}
		return false;

	}
}