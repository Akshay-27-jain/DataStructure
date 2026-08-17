class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String s : strs)
        {
            char [] ch = s.toCharArray();
            Arrays.sort(ch);
            String word = new String (ch);

            if(!map.containsKey(word))
            {
                map.put(word,new ArrayList<>());
            }
            map.get(word).add(s);
        }

        return new ArrayList<>(map.values());

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna