class Solution {
    public double findMaxAverage(int[] nums, int k) {
     int sum=0;
     
     for ( int i =0 ; i<k; i++){
        sum += nums[i];
     }   

     int maxsum = sum;

     for(int i=k; i<nums.length;i++)
     {
        sum = sum-nums[i-k]+nums[i];
        maxsum=Math.max(maxsum,sum);
     }

     return(double) maxsum/k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna