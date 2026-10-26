class Solution {
    public int dominantIndex(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int idx = -1;
        for(int i = 0; i < nums.length; i++){
            if(maxi < nums[i]){
                maxi = nums[i];
                idx = i;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != maxi && nums[i]*2 > maxi) return -1;
        }
        return idx;
    }
}