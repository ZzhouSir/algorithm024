/**
 * 题目：买卖股票的最佳时机 II
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        // 解法1：
        int result = 0;
        if(null != prices && prices.length > 1){
            for(int i = 1; i< prices.length;i++){
                result += prices[i] > prices[i - 1] ? prices[i] - prices[i - 1] : 0;
            }
        }
        return result;
    }
}