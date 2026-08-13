class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> freq = new HashMap<>();

        for (char ch : s.toCharArray()) 
         {
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        for (int i=0; i<s.length();i++) 
        {

          char ch =  s.charAt(i);

          if(freq.get(ch)==1)
          {
            return i;
          }
        }
        
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna