class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {

        int[] ans = new int[queries.length];

        Arrays.sort(nums);

        for(int i = 0; i < queries.length; i++){
            int j = -1, sum = 0, maxLen = 0;
            for(j = 0; j < nums.length; j++){
                sum += nums[j];
                if(sum > queries[i]) break;
            }
            if(j != -1) ans[i] = j;
        }

        return ans;
    }
}