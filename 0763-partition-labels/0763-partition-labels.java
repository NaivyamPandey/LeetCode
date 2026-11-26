class Solution {
    public List<Integer> partitionLabels(String s) {

        List<Integer> ans = new ArrayList<>();
        int[ ] last = new int[26];
        int prev_idx = -1;
        int max_idx = 0;

        for(int i = 0; i < s.length(); i++){
            last[s.charAt(i) - 'a'] = i;
        }

        for(int i = 0; i < s.length(); i++){
            max_idx = Integer.max(max_idx, last[s.charAt(i) - 'a']);

            if(max_idx == i){
                ans.add(max_idx - prev_idx);
                prev_idx = max_idx;
            }
        }
        
        return ans;
    }
}