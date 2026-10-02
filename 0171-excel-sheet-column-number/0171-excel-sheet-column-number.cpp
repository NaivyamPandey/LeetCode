class Solution {
public:
    int titleToNumber(string columnTitle) {
        int ans = 0;
        for(int i = columnTitle.length() - 1; i >= 0; i--){
            ans += pow(26, i) * ((int)columnTitle[columnTitle.length()-i-1] - 64);
        }
        return ans;
    }
};