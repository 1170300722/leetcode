package _4;

import java.util.ArrayList;

public class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int len1 = nums1.length;
		int len2 = nums2.length;
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		while (i < len1 && j < len2) {
			if (nums1[i] < nums2[j]) {
				list.add(nums1[i]);
				i++;
			} else {
				list.add(nums2[j]);
				j++;
			}
		}
		if (i >= len1) {
			for (; j < len2; j++) {
				list.add(nums2[j]);
			}
		} else {
			for (; i < len1; i++) {
				list.add(nums1[i]);
			}
		}
		if (list.size() % 2 == 0) {
			return ((double) (list.get(list.size() / 2 - 1) + list.get(list.size() / 2))) / 2;
		} else {
			return list.get((list.size() + 1) / 2 - 1);
		}

	}
}
