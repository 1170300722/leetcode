package _1497;

public class Solution {
	public static boolean canArrange(int[] arr, int k) {
		int[] mod = new int[k];
		for (int i = 0; i < mod.length; i++) {
			mod[i] = 0;
		}
		for (int i = 0; i < arr.length; i++) {
			mod[(arr[i] % k + k) % k]++;
		}
		if (mod[0] % 2 == 1) {
			return false;
		}
		for (int i = 1; i < mod.length; i++) {
			if (mod[i] == mod[k - i]) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}
}
