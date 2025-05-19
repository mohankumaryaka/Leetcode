class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        int temp[][] = new int[r][c];
        if(row*col != r*c) return mat;
        int x=0;
        int y=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                    temp[x][y] = mat[i][j];
                    y++;
                    if(y==c){
                        y=0;
                        x++;
                    }
                }
            }
        return temp;
    }
}