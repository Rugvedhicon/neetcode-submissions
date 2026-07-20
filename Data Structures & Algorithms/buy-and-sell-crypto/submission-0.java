class Solution {
    public int maxProfit(int[] prices) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            for(int j=i;j<prices.length;j++){
                max=Math.max(prices[j]-prices[i],max);
            }
        }
        return max;
    }
}
