package _861;

class Solution {
	public static int matrixScore(int[][] A) {
		for (int i = 0; i < A.length; i++) {
			if (A[i][0] == 0) {
				for (int j = 0; j < A[i].length; j++) {
					if (A[i][j] == 0) {
						A[i][j] = 1;
					} else {
						A[i][j] = 0;
					}
				}
			}
		}
		for (int j = 1; j < A[0].length; j++) {
			int num = 0;
			for (int i = 0; i < A.length; i++) {

				if (A[i][j] == 1) {
					num++;
				}
			}
			if (num < ((float) A.length) / 2) {
				for (int i = 0; i < A.length; i++) {
					if (A[i][j] == 0) {
						A[i][j] = 1;
					} else {
						A[i][j] = 0;
					}
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < A[i].length; j++) {
				rowSum += A[i][j] << (A[i].length - j - 1);
			}
			sum += rowSum;
		}
		return sum;
	}

}