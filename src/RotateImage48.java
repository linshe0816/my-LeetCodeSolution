class Solution {
    public void rotate(int[][] matrix) {
        //對角線互換
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //左右對折
        int left=0,right=matrix.length-1;
        while(left<right){
            for(int i=0;i<matrix[0].length;i++){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
            }
            left++;
            right--;
        }
        
    }
}