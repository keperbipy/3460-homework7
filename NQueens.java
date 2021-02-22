
	import java.util.Scanner;

	public class NQueens { 
  
		public static int numQueen;  
		public static int numSolution = 0;
		public static int board[][];  
		
  
		public static boolean isValidSpot(int row, int col) {  
			int i;  
			int j;
		
			for (i = 0; i < col; i++) {
				if (board[row][i] == 1) { 
					return false;  
				}
			}
		
			for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
				if (board[i][j] == 1) {
					return false;  
				}
			}
		
			for (i = row, j = col; j >= 0 && i < numQueen; i++, j--) {
				if (board[i][j] == 1) {
					return false;  
				}
			}
		
			return true;  
		}  
  

		public static boolean numQueenRecurr(int col) {  
			if (col == numQueen){  
				numSolution++;				
				return true;  
			}  
  
			boolean ans = false;  
		
			for (int i = 0; i < numQueen; i++)  
			{  
				if ( isValidSpot(i, col) ) {  
					board[i][col] = 1;  
					ans = numQueenRecurr(col+1) || ans;  
					board[i][col] = 0; 
				}  
			}  
  
			return ans;  
		}  
  

		public static void numQueenDriver(int n) {  
			board = new int[n][n];  
			if (!numQueenRecurr(0)) {  
				return;  
			}  
			return;  
		} 

		public static void main(String[] args) { 
	
			Scanner kb = new Scanner(System.in);
			System.out.print("Enter the number of queens: ");
			numQueen = kb.nextInt();
			numQueenDriver(numQueen); 
			System.out.println("The number of valid arrangements is " + numSolution);
		} 
	
	
	} 
