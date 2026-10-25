class Solution {
    public int longestPalindrome(String s) {
        int ans = 0;
        boolean flag = false;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            int val = entry.getValue();
            if(val % 2 == 0){
                ans += val;
            }
            else{
                flag = true;
                ans += val - 1;
            }
        }
        if(flag)ans++;
        return ans;
    }
}