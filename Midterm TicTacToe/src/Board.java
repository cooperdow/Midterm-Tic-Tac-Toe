import java.util.Scanner;
public class Board {
static String board[][]=new String[3][3];
	public static void setUp()
		{
		for(int i=0; i<board.length; i++)
			{
			for(int j=0; j<board[0].length; j++)
				{
				board[i][j]= " ";		
				}
			}
		}
	public static void displayBoard()
	{
	System.out.println("    1   2   3");
	System.out.println("   ------------");
	System.out.println("A | " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " | ");
	System.out.println("   ------------");
	System.out.println("B | " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " | ");
	System.out.println("   ------------");
	System.out.println("C | " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " | ");
	System.out.println("   ------------");
	System.out.println();
	}
	public static boolean gameWon()
	{
	if ((board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2]) && !board[0][0].equals(" ")) ||//A1-A3
	(board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2]) && !board[1][0].equals(" ")) ||//B1-B3
	(board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2]) && !board[2][0].equals(" ")) ||//C1-C3
	(board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0]) && !board[0][0].equals(" ")) ||//A1-C1
	(board[0][1].equals(board[1][1]) && board[1][1].equals(board[2][1]) && !board[0][1].equals(" ")) ||//A2-C2
	(board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2]) && !board[0][2].equals(" ")) ||//A3-C3
	(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[0][0].equals(" ")) ||//A1-C3
	(board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[0][2].equals(" ")))//A3-C1
	{
	System.out.println("Game is over");
	System.exit(0);
	}
	return false;
	}
}
