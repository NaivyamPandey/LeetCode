class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0, maxLen = 0, len = 0;
        while(j < s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                if(map.get(ch) < i){
                    // map.put(ch, i);
                    maxLen = Integer.max(maxLen, (j - i + 1));
                }
                else{
                    i = map.get(ch) + 1;
                }
            }
            else{
                // map.put(ch, i);
                maxLen = Integer.max(maxLen, (j - i + 1));
            }
            map.put(ch, j);
            j++;
        }
        return maxLen;
    }
}