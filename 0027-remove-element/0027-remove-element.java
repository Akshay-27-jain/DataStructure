class Solution {
    public int removeElement(int[] nums, int val) {
        int result=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
             nums[result]=nums[i];
             result++;
            }
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna