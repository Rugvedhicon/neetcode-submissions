class Solution {
    public int maxProfit(int[] prices) {
        int max=Integer.MIN_VALUE;
        int sell=prices[0];
        for(int i=0;i<prices.length;i++){
            max=Math.max(prices[i]-sell,max);
            sell=Math.min(sell,prices[i]);
        }
        return max;
    }
}
