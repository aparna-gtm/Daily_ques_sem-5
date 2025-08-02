// Last updated: 8/2/2025, 3:25:05 PM
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            HashMap<Character,Integer> map=new HashMap<>();
            for(int j=0;j<board.length;j++){
                if(board[i][j]!='.'){
                    if(map.containsKey(board[i][j])){
                        return false;
                    }
                    else{
                        map.put(board[i][j],1);
                    }
                }
            }
        }
        for(int i = 0; i < 9; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j = 0; j < 9; j++) {
                if(board[j][i] != '.') {
                    if(map.containsKey(board[j][i])) return false;
                    map.put(board[j][i], 1);
                }
            }
        }

        for(int k = 0; k < 9; k++) {
            HashSet<Character> set = new HashSet<>();
            int startRow = 3 * (k / 3);
            int startCol = 3 * (k % 3);
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    char ch = board[startRow + i][startCol + j];
                    if(ch != '.') {
                        if(set.contains(ch)) return false;
                            set.add(ch);
                    }
                }
            }
        }


        return true;
    }
}