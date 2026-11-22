class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0, s = nums.length;
        for(int k = s - 1; k >= 2; k--){
            int j = k - 1, i = 0;
            while(i < j){
                if((nums[i] + nums[j]) > nums[k]){
                    count += (j - i);
                    j--;
                } 
                else{
                    i++;
                }
            }
        }
        return count;
    }
}