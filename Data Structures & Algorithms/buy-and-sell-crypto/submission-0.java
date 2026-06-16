class Solution {
    public int maxProfit(int[] prices) {
        int bp=prices[0];
        int pr=0;
        for(int i=0;i<prices.length;i++){
            bp=Math.min(bp,prices[i]);
            pr=Math.max(pr,prices[i]-bp);
        }

    return pr;    
    }
}
