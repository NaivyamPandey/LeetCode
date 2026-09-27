class Solution {
public:
    vector<int> findMissingElements(vector<int>& nums) {
        unordered_map<int, bool> mp;
        vector<int> ans;
        int maxi = INT_MIN;
        int mini = INT_MAX;

        for(int i = 0; i < nums.size(); i++){
            mini = min(mini, nums[i]);
            maxi = max(maxi, nums[i]);
            mp[nums[i]] = true;
        }

        for(int i = mini+1; i < maxi; i++){
            if(mp.find(i) == mp.end()){
                ans.push_back(i);
            }
        }
        return ans;
    }
};