class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count_target = 0;
        int less = -1;
        int s = nums.length;
        List<Integer> ans = new ArrayList<>();

        if(s == 0) return ans;

        for(int i = 0; i < s; i++){
            if(nums[i] < target) less++;
            if(nums[i] == target) count_target++;
        }

        for(int i = 1; i <= count_target; i++){
            ans.add(++less);
        }
        return ans;
    }
}