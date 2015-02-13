import java.util.Scanner;
public class Player {
static Scanner userInput = new Scanner(System.in);
static int difficulty;
static String type;
	public static void intro()
	{
	System.out.println("What is your name?");
	String name = userInput.nextLine();
	System.out.println("Hello," + name + "! You're good.");
	System.out.println("You want to play Tic-Tac-Toe.");
	}
	public static String askXO()
	{
	Scanner userInput = new Scanner(System.in);
	System.out.println("Would you like to be (X) or (O)?");
	type=userInput.nextLine();
	return type;
	}
	public static void difficulty()
	{
	Scanner userInput = new Scanner(System.in);
	System.out.println("Please select your difficulty. Type (1) for easy and (2) for difficult");
	difficulty=userInput.nextInt();
	}
	public static void placeMoveX()
	{
	System.out.println("What is your move?");
	String moveX = userInput.nextLine();
	System.out.println();
		if (moveX.equals("A1") || moveX.equals("a1"))//1
		{
		Board.board[0][0]="X";
		}
		else if (moveX.equals("B1") || moveX.equals("b1"))
		{
		Board.board[1][0]="X";
		}
		else if (moveX.equals("C1") || moveX.equals("c1"))
		{
		Board.board[2][0]="X";
		}
		else if (moveX.equals("A2") || moveX.equals("a2"))//4
		{
		Board.board[0][1]="X";
		}
		else if (moveX.equals("B2") || moveX.equals("b2"))
		{
		Board.board[1][1]="X";
		}
		else if (moveX.equals("C2") || moveX.equals("c2"))
		{
		Board.board[2][1]="X";
		}
		else if (moveX.equals("A3") || moveX.equals("a3"))//7
		{
		Board.board[0][2]="X";
		}
		else if (moveX.equals("B3") || moveX.equals("b3"))
		{
		Board.board[1][2]="X";
		}
		else if (moveX.equals("C3") || moveX.equals("c3"))//9
		{
		Board.board[2][2]="X";
		}
	}
	public static void placeMoveO()
	{
	System.out.println("What is your move?");
	String moveO = userInput.nextLine();
	System.out.println();
		if (moveO.equals("A1") || moveO.equals("a1"))//1
		{
		Board.board[0][0]="O";
		}
		else if (moveO.equals("B1") || moveO.equals("b1"))
		{
		Board.board[1][0]="O";
		}
		else if (moveO.equals("C1") || moveO.equals("c1"))
		{
		Board.board[2][0]="O";
		}
		else if (moveO.equals("A2") || moveO.equals("a2"))//4
		{
		Board.board[0][1]="O";
		}
		else if (moveO.equals("B2") || moveO.equals("b2"))
		{
		Board.board[1][1]="O";
		}
		else if (moveO.equals("C2") || moveO.equals("c2"))
		{
		Board.board[2][1]="O";
		}
		else if (moveO.equals("A3") || moveO.equals("a3"))//7
		{
		Board.board[0][2]="O";
		}
		else if (moveO.equals("B3") || moveO.equals("b3"))
		{
		Board.board[1][2]="O";
		}
		else if (moveO.equals("C3") || moveO.equals("c3"))//9
		{
		Board.board[2][2]="O";
		}
	}
}
