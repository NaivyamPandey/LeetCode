class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) return 1;

        int i = 0;
        int j = 1;

        while(j < nums.length){
            if(nums[i] != nums[j]){
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = nums[i];
            }
            j++;
        }
        return i+1;
    }
}