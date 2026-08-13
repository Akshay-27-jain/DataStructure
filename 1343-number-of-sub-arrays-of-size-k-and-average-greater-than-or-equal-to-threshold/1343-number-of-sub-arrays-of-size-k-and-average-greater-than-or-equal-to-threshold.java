class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum= 0;
        int count =0;

         for(int i=0; i<k;i++)
         {
           sum += arr[i];
          
         }

          if (sum>=k*threshold)
          {
            count++;
          }

         for(int i=k; i<arr.length;i++)
        {
            sum =sum-arr[i-k]+arr[i];
            if( sum >= k*threshold)
            {
                count++;
            }

        }

        return count;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna