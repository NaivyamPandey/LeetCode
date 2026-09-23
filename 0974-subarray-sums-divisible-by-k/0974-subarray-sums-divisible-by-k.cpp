class Solution {
public:
    int subarraysDivByK(vector<int>& nums, int k) {
        int res = 0;
        int preSum = 0;
        unordered_map<int, int> mp;
        mp[0]++;
        for(int i = 0; i < nums.size(); i++){

            preSum += nums[i];
            int mod = (preSum % k + k) % k;
            if(mp.find(mod) != mp.end()){
                res = res + mp[mod];
            }
            mp[mod]++;

        }
        return res;
    }
};