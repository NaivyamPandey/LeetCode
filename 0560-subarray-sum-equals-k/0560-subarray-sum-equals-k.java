class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int cnt = 0, preSum = 0;
        for(int i = 0; i < nums.length; i++){
            preSum += nums[i];
            int discard = preSum - k;
            cnt += map.getOrDefault(discard, 0);
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }
}