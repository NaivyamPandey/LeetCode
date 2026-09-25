class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<vector<int>> ans;

        ans.push_back({1});

        if(rowIndex == 0) return ans[0];

        int i = 1;
        int j = 0;
        
        while(i <= rowIndex){
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
        return ans[rowIndex];
    }
};