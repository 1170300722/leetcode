package _714;

public class Solution {
	public int maxProfit(int[] prices, int fee) {
		int len = prices.length;
		if (len < 2) {
			return 0;
		}
		int[] profit1 = new int[len];// 第i天有股票时的最大利润
		int[] profit2 = new int[len];// 第i天不持股时的最大利润
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
