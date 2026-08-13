class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int n=nums.length;
        int [] result=new int [n*2];

        for (int i=0;i<n;i++)
        {
           result[i] = nums[i];
           result[i + n] = nums[i];
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna