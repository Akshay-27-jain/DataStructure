class Solution {
    public int largestInteger(int[] nums, int k) {

        int n = nums.length;

        // Case 1: Only one window
        if (k == n) {
            int max = nums[0];
            for (int num : nums) {
                max = Math.max(max, num);
            }
            return max;
        }

        // Frequency array (0 <= nums[i] <= 50)
        int[] count = new int[51];
        for (int num : nums) {
            count[num]++;
        }

        // Case 2: Every element is its own window
        if (k == 1) {
            int ans = -1;
            for (int num : nums) {
                if (count[num] == 1) {
                    ans = Math.max(ans, num);
                }
            }
            return ans;
        }

        // Case 3: Only first and last can qualify
        int first = (count[nums[0]] == 1) ? nums[0] : -1;
        int last = (count[nums[n - 1]] == 1) ? nums[n - 1] : -1;

        return Math.max(first, last);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna