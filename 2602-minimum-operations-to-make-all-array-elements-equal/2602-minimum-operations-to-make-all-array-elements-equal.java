class Solution {
    public List<Long> minOperations(int[] nums, int[] queries) {

        List<Long> ans = new ArrayList<>();
        int s = nums.length;
        long preSum[] = new long[s];

        Arrays.sort(nums);
        preSum[0] = nums[0];
        for (int i = 1; i < s; i++) {
            preSum[i] = preSum[i - 1] + nums[i];
        }

        for (int i = 0; i < queries.length; i++) {
            int l = 0, r = s;
            while (l < r) {
                int mid = l + (r - l)/2;
                if (nums[mid] <= queries[i])
                    l = mid + 1;
                else
                    r = mid;
            }

            long leftSum = (l == 0) ? 0 : preSum[l - 1];
            long rightSum = preSum[s - 1] - leftSum;

            long leftOps = (long) l * queries[i] - leftSum;

            long rightOps = rightSum - (long) (s - l) * queries[i];

            ans.add(leftOps + rightOps);
        }
        return ans;
    }
}