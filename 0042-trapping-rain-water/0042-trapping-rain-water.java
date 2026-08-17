class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int  leftmax=0;
        int rightmax=0;
        int water =0;

        while(left < right)
        {
            if(height[left]<=height[right]){
                if(height[left]>=leftmax){
                    leftmax=height[left];
                }else{
                    water += leftmax - height[left];
                }
                left++;
            }
            else{
                if(height[right]>=rightmax){
                    rightmax=height[right];
                }else{
                    water+= rightmax-height[right];
                }
                right--;
            }
        }
        return water;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna