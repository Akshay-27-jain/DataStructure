class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Store all valid triplets
        List<List<Integer>> result = new ArrayList<>();

        // Sort the array
        // Example: [-1, 0, 1, 2, -1, -4]
        // becomes: [-4, -1, -1, 0, 1, 2]
        Arrays.sort(nums);

        // Fix one element at a time
        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first elements
            // Example: if nums[i] == nums[i - 1], skip it
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Two pointers
            int left = i + 1;
            int right = nums.length - 1;

            // Continue until the pointers meet
            while (left < right) {

                // Calculate the sum of three numbers
                int sum = nums[i] + nums[left] + nums[right];

                // If sum is 0, we found a valid triplet
                if (sum == 0) {

                    result.add(Arrays.asList(
                        nums[i],
                        nums[left],
                        nums[right]
                    ));

                    // Move both pointers
                    left++;
                    right--;

                    // Skip duplicate left values
                    while (left < right &&
                           nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right &&
                           nums[right] == nums[right + 1]) {
                        right--;
                    }
                }

                // Sum is too small
                // We need a bigger number
                else if (sum < 0) {
                    left++;
                }

                // Sum is too large
                // We need a smaller number
                else {
                    right--;
                }
            }
        }

        // Return all unique triplets
        return result;
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna