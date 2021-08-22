package _1646;

class Solution {
	public static int getMaximumGenerated(int n) {
		int[] nums = new int[n + 1];
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (n >= 2) {
			int max = 0;
			nums[0] = 0;
			nums[1] = 1;
			for (int i = 0; i < nums.length; i++) {
				if (2 * i >= 2 && 2 * i <= n) {
					nums[2 * i] = nums[i];
					if (nums[2 * i] > max) {
						max = nums[2 * i];
					}
				}
				if ((2 <= (2 * i + 1)) && ((2 * i + 1) <= n)) {
					nums[2 * i + 1] = nums[i] + nums[i + 1];
					if (nums[2 * i + 1] > max) {
						max = nums[2 * i + 1];
					}
				}
			}
			return max;
		}
		return 0;
	}

	public static void main(String[] args) {
		getMaximumGenerated(7);
	}
}