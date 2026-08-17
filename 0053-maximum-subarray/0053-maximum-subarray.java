class Solution {
    public int maxSubArray(int[] nums) {
        int current =nums[0];
        int max=nums[0];
        for(int i=1; i<nums.length;i++)
        {
            current = Math.max(nums[i],current+nums[i]);
            max=Math.max(max,current);
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna