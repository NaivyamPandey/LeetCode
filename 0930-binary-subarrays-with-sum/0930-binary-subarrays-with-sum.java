class Solution {

    public int countSubarray(int[] nums, int goal){
        if(goal < 0) return 0;

        int l = 0, r = 0, sum = 0, cnt = 0;

        while(r < nums.length){
            sum += nums[r];
            while(sum > goal){
                sum -= nums[l];
                l++;
            }
            cnt += r - l + 1;
            r++;
        }
        return cnt;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return countSubarray(nums, goal) - countSubarray(nums, goal - 1);
    }
}