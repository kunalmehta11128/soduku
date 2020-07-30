package test;

public class SudokuImpl implements SudokuIntf{

	@Override
  	public boolean checkValidity(int sudoku[][], int row, int column, int digit) {
    	
    	for(int i = 0; i < 9; i++) {
    		
    		if(sudoku[row][i] == digit) {
    			return false;
    		}
    		if(sudoku[i][column] == digit) {
    			return false;
    		}		
    	}
//    	
//		for (int k = 0; k < 9; k += 3) {
//
//			for (int i = k+0; i < k+3; i++) {
//
//				for (int j = k+0; j < k+3; j++) {
//
//					if (sudoku[i][j] == digit) {
//						return false;
//					}
//
//				}
//			}
//
//		}
    	
    	if(row == 0 || row == 1 || row == 2) {
    		
    		if(column == 0 || column == 1 || column == 2) {
    			
    			for (int i = 0; i < 3; i++) {

					for (int j = 0; j < 3; j++) {

						if (sudoku[i][j] == digit) {
							return false;
						}

					}
				}
    			
    		}
    		
    		if(column == 3 || column == 4 || column == 5) {
    			
    			for (int i = 0; i < 3; i++) {

					for (int j = 3; j < 6; j++) {

						if (sudoku[i][j] == digit) {
							return false;
						}

					}
				}
    			
    		}
    		
    		if(column == 6 || column == 7 || column == 8) {
    			
    			for (int i = 0; i < 3; i++) {

					for (int j = 6; j < 9; j++) {

						if (sudoku[i][j] == digit) {
							return false;
						}

					}
				}
    			
    		}
    	}
    	
    	
    	
		if (row == 3 || row == 4 || row == 5) {

			if (column == 0 || column == 1 || column == 2) {

				for (int i = 3; i < 6; i++) {

					for (int j = 0; j < 3; j++) {

						if (sudoku[i][j] == digit) {
							return false;
						}

					}
				}
					
				
			}

			if (column == 3 || column == 4 || column == 5) {

				
				for (int i = 3; i < 6; i++) {

					for (int j = 3; j < 6; j++) {

						if (sudoku[i][j] == digit) {
							return false;
						}

					}
				}
				
				
			}

			if (column == 6 || column == 7 || column == 8) {

				for (int i = 3; i < 6; i++) {

					for (int j = 6; j < 9; j++) {

						if (sudoku[i][j] == digit) {
							return false;
						}

					}
				}
				
			}
		}

		if (row == 6 || row == 7 || row == 8) {

			if (column == 0 || column == 1 || column == 2) {

				for (int i = 6; i < 9; i++) {

					for (int j = 0; j < 3; j++) {

						if (sudoku[i][j] == digit) {
							return false;
						}

					}
				}
				
			}

			if (column == 3 || column == 4 || column == 5) {

				for (int i = 6; i < 9; i++) {

					for (int j = 3; j < 6; j++) {

						if (sudoku[i][j] == digit) {
							return false;
						}

					}
				}
				
			}

			if (column == 6 || column == 7 || column == 8) {
				
				
				for (int i = 6; i < 9; i++) {

					for (int j = 6; j < 9; j++) {

						if (sudoku[i][j] == digit) {
							return false;
						}

					}
				}

			}
		}
    	
    	
    	
    	sudoku[row][column] = digit;
    	return true;
    	
    	
    }

}