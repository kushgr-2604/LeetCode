class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean[] setZeroRow= new boolean[row];
        boolean[] setZeroCol= new boolean[col];
        
        for(int i = 0; i<row;i++){
            for(int j =0;j<col; j++){
               if(matrix[i][j]==0){
                    setZeroRow[i]=true;
                    setZeroCol[j]= true;
               }
             }
        }
        for(int i =0; i<row; i++){
            for(int j =0; j<col; j++){
                if(setZeroRow[i] || setZeroCol[j]){
                    matrix[i][j]=0;
                }
            }
        }

    }
}