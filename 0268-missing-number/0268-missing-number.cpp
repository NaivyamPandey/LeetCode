class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int sum = 0;
        int maxi = INT_MIN;
        bool flag = false;
        for(int i = 0; i < nums.size(); i++){
            if(nums[i] == 0) flag = true;
            sum += nums[i];
            maxi = max(maxi,nums[i]);
        }
        int ans = ((maxi * (maxi + 1))/2) - sum;
        if(flag == false) return 0;
        if(ans == 0) return maxi+1;
        return ans;
    }
};