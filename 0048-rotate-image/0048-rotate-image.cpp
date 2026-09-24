class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        vector<vector<int>> ans;

        for(int col = 0; col < matrix.size(); col++){
            vector<int> temp;
            for(int row = matrix[col].size() - 1; row >= 0; row--){
                temp.push_back(matrix[row][col]);
            }
            ans.push_back(temp);
        }

        matrix = ans;
    }
};