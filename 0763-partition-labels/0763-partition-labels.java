class Solution {
    public List<Integer> partitionLabels(String s) {

        List<Integer> ans = new ArrayList<>();

        int prev_max_idx = -1;
        int max_idx = -1;

        for (int i = 0; i < s.length(); i++) {

            for (int j = max_idx + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    max_idx = Integer.max(max_idx, j);
            }

            if (i == max_idx) {
                ans.add(max_idx - prev_max_idx);
                prev_max_idx = max_idx;
                max_idx = -1;
            }
        }

        return ans;
    }
}