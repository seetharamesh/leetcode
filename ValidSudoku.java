package leetpractice;
import java.util.*;
public class ValidSudoku {
public boolean isValidSudoku(char[][] board) {
	HashSet<String> hs = new HashSet<>();
    for(int i = 0; i < 9; i++){
        for(int j = 0; j < 9 ; j++){
            char c = board[i][j];
            if(c != '.'){
                if(!hs.add(c + "row" + i) || !hs.add(c + "col" + j) || !hs.add(c + "rowcube" +i/3 + "colcube"+ j/3))
                    return false;
            }
        }
    }
    return true;
}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][]board = {{'5','3','6','.','7','.','.','.','.'}
				,{'6','.','.','1','9','5','.','.','.'}
				,{'.','9','8','.','.','.','.','6','.'}
				,{'8','.','.','.','6','.','.','.','3'}
				,{'4','.','.','8','.','3','.','.','1'}
				,{'7','.','.','.','2','.','.','.','6'}
				,{'.','6','.','.','.','.','2','8','.'}
				,{'.','.','.','4','1','9','.','.','5'}
				,{'.','.','.','.','8','.','.','7','9'}};
		
		
		ValidSudoku vs = new ValidSudoku();
		System.out.println(vs.isValidSudoku(board));
	}

}
