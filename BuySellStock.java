package leetpractice;

public class BuySellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,6,4,3,1};
		int profit=0;
		for(int i = 1; i < prices.length; i++) {
			if(prices[i-1] < prices[i]) {
				int diff = prices[i] - prices[i-1];
				profit +=diff;
			}
		}
		System.out.println("profit: " + profit);
	}

}
