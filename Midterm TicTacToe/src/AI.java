import java.util.Scanner;
public class AI {
static 	Scanner userInput=new Scanner(System.in);
	public static void computerMoveX()//AI X
	{	
		int computerMoveX=(int)(Math.random()*9)+1;
		if (computerMoveX==1)//1
		{
			if (Board.board[0][0].equals(" "))				
			{
				Board.board[0][0]="X";				
			}
		else computerMoveX();
		}
		else if (computerMoveX==2)
		{
			if (Board.board[1][0].equals(" "))				
			{
				Board.board[1][0]="X";				
			}
		else computerMoveX();
		}
		else if (computerMoveX==3)
		{
			if (Board.board[2][0].equals(" "))				
			{	
				Board.board[2][0]="X";				
			}
		else computerMoveX();
		}
		else if (computerMoveX==4)
		{
			if (Board.board[0][1].equals(" "))				
			{
				Board.board[0][1]="X";				
			}
		else computerMoveX();
		}
		else if (computerMoveX==5)
		{
			if (Board.board[1][1].equals(" "))				
			{
				Board.board[1][1]="X";				
			}
		else computerMoveX();
		}
		else if (computerMoveX==6)
		{
			if (Board.board[2][1].equals(" "))				
			{
				Board.board[2][1]="X";				
			}
		else computerMoveX();
		}
		else if (computerMoveX==7)
		{
			if (Board.board[0][2].equals(" "))				
			{
				Board.board[0][2]="X";				
			}
		else computerMoveX();
		}
		else if (computerMoveX==8)
		{
			if (Board.board[1][2].equals(" "))			
			{
				Board.board[1][2]="X";				
			}
		else computerMoveX();
		}
		else if (computerMoveX==9)
		{
			if (Board.board[2][2].equals(" "))				
			{	
				Board.board[2][2]="X";				
			}
		else computerMoveX();
		}
	}
	public static void hardCompMoveX()//1-8, center (b2) not part of random move
	{
		{
			if (Board.board[1][1].equals(" "))				
			{
				Board.board[1][1]="X";				
			}
		else computerMoveX();
		}
	}
	public static void computerMoveO()//AI O
	{	
		int computerMoveO=(int)(Math.random()*9)+1;
		if (computerMoveO==1)//1
		{
			if (Board.board[0][0].equals(" "))				
			{
				Board.board[0][0]="O";				
			}
		else computerMoveO();
		}
		else if (computerMoveO==2)
		{
			if (Board.board[1][0].equals(" "))				
			{
				Board.board[1][0]="O";				
			}
		else computerMoveO();
		}
		else if (computerMoveO==3)
		{
			if (Board.board[2][0].equals(" "))				
			{	
				Board.board[2][0]="O";				
			}
		else computerMoveO();
		}
		else if (computerMoveO==4)
		{
			if (Board.board[0][1].equals(" "))				
			{
				Board.board[0][1]="O";				
			}
		else computerMoveO();
		}
		else if (computerMoveO==5)
		{
			if (Board.board[1][1].equals(" "))				
			{
				Board.board[1][1]="O";				
			}
		else computerMoveO();
		}
		else if (computerMoveO==6)
		{
			if (Board.board[2][1].equals(" "))				
			{
				Board.board[2][1]="O";				
			}
		else computerMoveO();
		}
		else if (computerMoveO==7)
		{
			if (Board.board[0][2].equals(" "))				
			{
				Board.board[0][2]="O";				
			}
		else computerMoveO();
		}
		else if (computerMoveO==8)
		{
			if (Board.board[1][2].equals(" "))			
			{
				Board.board[1][2]="O";				
			}
		else computerMoveO();
		}
		else if (computerMoveO==9)
		{
			if (Board.board[2][2].equals(" "))				
			{	
				Board.board[2][2]="O";				
			}
		else computerMoveO();
		}
	}
	public static void hardCompMoveO()//1-8, center (b2) not part of random move
	{
		{
			if (Board.board[1][1].equals(" "))				
			{
				Board.board[1][1]="O";				
			}
		else computerMoveO();
		}
	}
}