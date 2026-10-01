class Solution {
public:
    string largestGoodInteger(string num) {
        int l = 0, r = 0;
        int ans_ele = -1;
        string ans = "";
        int element = -1;
        while(r < num.length()){
            int temp = num[r] - '0';
            if(element == temp){
                if(r-l+1 == 3){
                    ans_ele = max(ans_ele, element);
                    l = r;
                }
            }
            else{
                element = temp;
                l = r;
            }
            r++;
        }
        if(ans_ele == -1) return "";
        ans.push_back(ans_ele + '0');
        ans.push_back(ans_ele + '0');
        ans.push_back(ans_ele + '0');
        return ans;
    }
};