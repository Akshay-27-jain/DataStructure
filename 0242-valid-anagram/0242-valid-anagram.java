class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
        {
            return false;
        }
        
        Map<Character,Integer> set = new HashMap<>();

       for (char ch:s.toCharArray())
       {
        set.put(ch, set.getOrDefault(ch,0)+1);
       }

       for(char ch:t.toCharArray())
       {
        set.put(ch,set.getOrDefault(ch,0)-1);
       }

       for(int count:set.values())
       {
       if(count!=0) {
        return false;
       }
       }

       return true;
    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna