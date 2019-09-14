import java.util.Scanner;

public class Connect4 {

	private int h = 6;
	private int w = 7;
	private int[][] board = new int[h][w];

	public void draw() {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				System.out.print(" ");
				if (board[row][col] == 0) {
					System.out.print("#");
				} else if (board[row][col] == 1) {
					System.out.print("X");
				} else if (board[row][col] == -1) {
					System.out.print("O");
				}
			}
			// END OF ROW
			System.out.println();
		}
	}

	public void drop(int player, int column) {
		for (int k = 5; k >= 0; k--) {
			if (board[k][column - 1] == 0) {
				board[k][column - 1] = player == 1 ? -1 : 1;
				return;
			}
		}
	}

	private int at(int row, int col) {
		if (row >= 0 && row < h && col >= 0 && col < w) {
			return board[row][col];
		}
		return 0;
	}

	public int winner() {
		// Starting point sweep
		for (int row = 0; row < h; row++) {
			for (int col = 0; col < w; col++) {
				// Check for four in every direction
				int win1 = 0;
				int win2 = 0;
				int win3 = 0;
				int win4 = 0;
				for (int i = 0; i < 4; i++) {
					win1 += at(row - i, col + i);
					win2 += at(row, col + i);
					win3 += at(row + i, col + i);
					win4 += at(row + i, col);
				}
				if (win1 == -4 || win2 == -4 || win3 == -4 || win4 == -4)
					return 1;
				if (win1 == 4 || win2 == 4 || win3 == 4 || win4 == 4)
					return 2;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Connect4 game = new Connect4();

		int winner = 0;
		int player = 1;
		while (true) {
			game.draw();
			System.out.println("Enter a column, Player " + player);
			int colChoice = input.nextInt();
			game.drop(player, colChoice);

			if (player == 1) {
				player = 2;
			} else {
				player = 1;
			}
			winner = game.winner();
			if (winner != 0) {
				game.draw();
				System.out.println("Player " + winner + " won!!");
				break;
			}
		}
	}

}
