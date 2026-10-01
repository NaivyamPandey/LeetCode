class Solution {
public:
    string largestOddNumber(string num) {
        for(int idx = num.length() - 1; idx >= 0; idx--){
            if((num[idx] - '0')%2 != 0) return num.substr(0, idx+1);
        }
        return "";
    }
};