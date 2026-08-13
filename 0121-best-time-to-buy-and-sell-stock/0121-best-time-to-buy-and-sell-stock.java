class Solution {
    public int maxProfit(int[] prices) {
        
        int minprofit=prices[0];
        int maxprofit= 0;
  
        for(int i=1;i<prices.length;i++)
        {
            minprofit=Math.min(minprofit,prices[i]);

            int profit= prices[i]-minprofit;

            maxprofit= Math.max(maxprofit,profit);
        }

        return maxprofit;
       
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna