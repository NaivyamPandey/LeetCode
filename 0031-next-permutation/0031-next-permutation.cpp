class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        if(nums.size() == 1) return;
        int brkpt = -1;
        for(int i = nums.size() - 1; i >= 1; i--){
            if(nums[i] > nums[i-1]){
                brkpt = i - 1;
                break;
            }
        }
        if(brkpt != -1){
            for(int i = nums.size() - 1; i > brkpt; i--){
                if(nums[i] > nums[brkpt]){
                    swap(nums[brkpt], nums[i]);
                    break;
                }
            }
            brkpt = brkpt + 1;
        }
        else{
            brkpt = 0;
        }
        reverse(nums.begin() + brkpt, nums.end());
    }
};