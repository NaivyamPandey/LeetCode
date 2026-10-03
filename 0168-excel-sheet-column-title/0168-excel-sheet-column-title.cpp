class Solution {
public:
    string convertToTitle(int cn) {
        string ans = "";
        while(cn != 0){
            int temp = cn % 26;
            char ch;
            if(temp == 0){
                ch = (char)(64+26);
                ans.push_back(ch);
                cn /= 26;
                cn -= 1;
            }
            else{
                ch = (char)(64+temp);
                ans.push_back(ch);
                cn /= 26;
            }
        }
        reverse(ans.begin(), ans.end());
        return ans;
    }
};