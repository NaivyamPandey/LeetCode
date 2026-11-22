class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0, s = nums.length;
        for (int i = 0; i < s - 2; i++) {
            for (int j = i + 1; j < s - 1; j++) {
                int l = j + 1, r = s - 1;
                int sum = nums[i] + nums[j];
                while (l <= r) {
                    int mid = l + (r - l) / 2;
                    if (nums[mid] >= sum)
                        r = mid - 1;
                    else
                        l = mid + 1;
                }
                count += (l - j - 1);
            }
        }
        return count;
    }
}