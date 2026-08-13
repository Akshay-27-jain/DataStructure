class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();

        for(int x : nums)
        {
            freq.put(x,freq.getOrDefault(x,0)+1);
        }
        
        System.out.println(freq);
        
        int maxfreq=0;

        for(int count: freq.values())
        {
            if(count > maxfreq)
            {
                maxfreq=count;
            }
        }

        int answer=0;
        for(int count : freq.values())
        {
            if (count==maxfreq)
            {
                answer += count;
            }
        }

        return answer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna