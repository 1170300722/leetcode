package _1;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i == j) {
					j++;
				}
				if (nums[i] + nums[j] == target) {
					int[] result = { i, j };
					return result;
				}
			}
		}
		int[] result = null;
		return result;
	}
}
