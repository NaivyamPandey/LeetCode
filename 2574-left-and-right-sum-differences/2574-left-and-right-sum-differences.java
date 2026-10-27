class Solution {
    public int[] leftRightDifference(int[] nums) {
        int s = nums.length, tSum = 0;
        int[] ans = new int[s];
        for(int i = 0; i < s; i++){
            tSum += nums[i];
        }
        int leftSum = 0;
        for(int i = 0; i < s; i++){
            int rightSum = tSum - leftSum - nums[i];
            ans[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }
        return ans;
    }
}

// 10, 14, 22, 25