package _714;

public class Solution {
	public int maxProfit(int[] prices, int fee) {
		int len = prices.length;
		if (len < 2) {
			return 0;
		}
		int[] profit1 = new int[len];// ��i���й�Ʊʱ���������
		int[] profit2 = new int[len];// ��i�첻�ֹ�ʱ���������
		for (int i = 0; i < profit1.length; i++) {
			profit1[i] = 0;
			profit2[i] = 0;
		}
		profit1[0] = -prices[0];
		for (int i = 1; i < profit1.length; i++) {
			profit1[i] = Math.max(profit1[i - 1], profit2[i - 1] - prices[i]);
			profit2[i] = Math.max(profit2[i - 1], profit1[i - 1] + prices[i] - fee);
		}
		return profit2[len - 1];

	}
}
