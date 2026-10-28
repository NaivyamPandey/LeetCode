class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, j = matrix.length - 1;
        while(i < j){
            int mid = i + ((j - i) / 2);
            if(target == matrix[mid][0]){
                return true;
            }
            else if(target < matrix[mid][0]){
                j = mid-1;
            }
            else{
                int last = matrix[mid].length - 1;
                if(target == matrix[mid][last]){
                    return true;
                }
                else if(target < matrix[mid][last]){
                    i = mid;
                    break;
                }
                else{
                    i = mid+1;
                }
            }
        }

        int leftcol = 0, rightcol = matrix[i].length - 1;
        while(leftcol <= rightcol){
            int mid = leftcol + ((rightcol - leftcol) / 2);
            if(matrix[i][mid] == target){
                return true;
            }
            else if(target < matrix[i][mid]){
                rightcol = mid-1;
            }
            else{
                leftcol = mid+1;
            }
        }
        return false;
    }
}