class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hs=new HashSet<String>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(!hs.add(board[i][j]+"row"+i) || !hs.add(board[i][j]+"col"+j))
                    return false;
                    //3*3 範圍內需要不一樣
                    if(!hs.add(board[i][j]+"range"+i/3+""+j/3))
                    return false;
                }
            }
        }
        return true;
    }
}