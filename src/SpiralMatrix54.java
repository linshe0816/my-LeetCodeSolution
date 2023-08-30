class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        int m = matrix.length;
        if (m == 0) {
            return res;
        }
        int n = matrix[0].length;
        int rowStart = 0, rowEnd = m - 1;
        int colStart = 0, colEnd = n - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            //right
            for(int i=colStart;i<=colEnd;i++){
                res.add(matrix[rowStart][i]);
            }
            rowStart++;
            //down
            for(int i=rowStart;i<=rowEnd;i++){
                res.add(matrix[i][colEnd]);
            }
            colEnd--;
            //left
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    res.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }
            //up
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    res.add(matrix[i][colStart]);
                }
                colStart++;
            }
        }
        return res;
    }
}