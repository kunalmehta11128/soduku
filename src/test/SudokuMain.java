package test;

import java.util.Scanner;

public class SudokuMain {

	public static void main(String args[]) {

		int arr[][] = { { 1, 3, 0, 0, 7, 0, 0, 0, 0 }, { 6, 0, 0, 1, 9, 5, 0, 0, 0 }, { 0, 9, 8, 0, 0, 0, 0, 6, 0 },

				{ 8, 0, 0, 0, 6, 0, 0, 0, 3 }, { 4, 0, 0, 8, 0, 3, 0, 0, 1 }, { 7, 0, 0, 0, 2, 0, 0, 0, 6 },

				{ 0, 6, 0, 0, 0, 0, 2, 8, 0 }, { 0, 0, 0, 4, 1, 9, 0, 0, 5 }, { 0, 0, 0, 0, 8, 0, 0, 7, 9 } };

		Scanner sc = new Scanner(System.in);
		SudokuImpl s = new SudokuImpl();

		int value = 0;
		int row;
		int column;

		//loop run till value not getting 2 digit value
		while (value < 10) {

			System.out.println("press 10 to exit");
			System.out.println("please enter value : row, column, digit to enter");

			row = sc.nextInt();
			column = sc.nextInt();
			value = sc.nextInt();

			//condition to break the loop 
			if (row > 9 || column > 9 || value > 9) {
				break;
			}
			
			//call method and get response true or falue
			System.out.println(s.checkValidity(arr, row, column, value));

			//loop for print matrix
			for (int i = 0; i < 9; i++) {

				System.out.println();

				for (int j = 0; j < 9; j++) {
					System.out.print(arr[i][j] + "|");
				}

			}

		}

	}

}