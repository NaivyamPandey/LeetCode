class Solution {
    public int convert(int num){
        int ans = 0;
        while(num != 0){
            int mod = num%10;
            num /= 10;
            ans += mod;
        }
        return ans;
    }
    public int minElement(int[] nums) {
        int mini = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            int num = convert(nums[i]);
            mini = mini <= num ? mini : num;
        }
        return mini;
    }
}