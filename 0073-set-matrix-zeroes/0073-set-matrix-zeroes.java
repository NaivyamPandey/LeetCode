class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> set_row = new HashSet<>();
        Set<Integer> set_col = new HashSet<>();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    set_row.add(i);
                    set_col.add(j);
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(set_row.contains(i) || set_col.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}