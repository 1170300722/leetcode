package _1738;

import java.util.Arrays;

class Solution {
    public int kthLargestValue(int[][] matrix, int k) {
    	int m=matrix.length;
    	int n=matrix[0].length;
    	int result[]=new int[m*n];
    	for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i==0&&j==0){
	                result[0]=matrix[0][0];
	            }else if (i==0) {
					result[i*n+j]=result[i*n+j-1]^matrix[i][j];
				}else if (j==0) {
					result[i*n+j]=result[i*n+j-n]^matrix[i][j];
				}else {
					result[i*n+j]=result[i*n+j-n]^result[i*n+j-1]^result[i*n+j-1-n]^matrix[i][j];
				}
			}
		}
    	Arrays.sort(result);
    	return result[m*n-k];
    }
}