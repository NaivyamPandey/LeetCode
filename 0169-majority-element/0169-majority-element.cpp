class Solution {
public:
    int majorityElement(vector<int>& nums) {
        
        unordered_map<int, int> mp;

        int temp;
        for(int i = 0; i < nums.size(); i++){
            temp = ++mp[nums[i]];
            
            if(nums.size() % 2 == 0 && temp >= nums.size()/2) return nums[i];

            if(nums.size() % 2 == 1 && temp >= nums.size()/2 + 1) return nums[i];
        }
        return -1;
    }
};