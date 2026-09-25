class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> ans;

        ans.push_back({1});

        if(numRows == 1) return ans;

        int i = 1;
        int j = 0;
        
        while(i < numRows){
            vector<int> temp;
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    temp.push_back(1);
                }
                else{
                    int res = ans[i-1][j-1] + ans[i-1][j];
                    temp.push_back(res);
                }
            }
            ans.push_back(temp);
            i++;
        }
        return ans;
    }
};