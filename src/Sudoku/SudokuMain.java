package Sudoku;

import java.util.Scanner;

public class SudokuMain {

	public static void main(String args[]) {

		int arr[][] = new int[9][9];

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		SudokuImpl s = new SudokuImpl();

		int value = 0;
		int row;
		int column;
		int count = 0;

		// loop run till all value not put
		while (count < 81) {

			System.out.println("Enter Row: ");
			row = sc.nextInt();
			System.out.println("Enter Column: ");
			column = sc.nextInt();
			System.out.println("Enter Digit: ");
			value = sc.nextInt();
			
			Boolean ans = Boolean.FALSE;
			
			// validating digit
			if (row > 9 || column > 9 || value > 9 || row < 0 || column < 0 || value < 0)
				System.out.println("Please enter valid data");
			else 
			// call method and get response true or falue
			ans = s.checkValidity(arr, row, column, value);

			//if count++ when value inserted and also print message
			if (Boolean.TRUE.equals(ans)) {
				System.out.println("Value successfully inserted :" + ans);
				
				// loop for print matrix
				for (int i = 0; i < 9; i++) {

					System.out.print("\n | ");

					for (int j = 0; j < 9; j++) {
						System.out.print(arr[i][j] + " | ");
					}
					
					if(i == 2 || i == 5 || i == 8) {
						System.out.print("\n ------------------------------------- \n");
					}

				}
				count++;
			} else {
				System.out.println("Value are not inserted :" + ans);
			}

			
			

		}

	}

}