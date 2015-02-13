import java.util.Scanner;
public class Gamerunner {
static int counter=0;
public static boolean gameContinues=true;	
	public static void main(String[] args) {
	Board.setUp();
	Player.intro();
	Player.difficulty();
	Player.askXO();
	Board.displayBoard();
		
	while(gameContinues)
		{
			if (Player.difficulty==1)
				{
				if (Player.type.equals("X")||Player.type.equals("x"))
					{
					Player.placeMoveX();
					counter++;
					if (counter==9)
						{
						System.out.println("Tie Game");
						System.exit(0);
						}
					AI.computerMoveO();
					counter++;
					Board.displayBoard();
					Board.gameWon();
					}
				
				else if (Player.type.equals("O")||Player.type.equals("o"))
						{
						Player.placeMoveO();
						counter++;
						if (counter==9)
							{
							System.out.println("Tie Game");
							System.exit(0);
							}	
						AI.computerMoveX();
						counter++;
						Board.displayBoard();						
						Board.gameWon();
						}
				}
				
			if (Player.difficulty==2)
				{
				if (Player.type.equals("O")||Player.type.equals("o"))
					{
					Player.placeMoveO();									
					counter++;
					if (counter==9)
						{
						System.out.println("Tie Game");
						System.exit(0);						
						}
					AI.hardCompMoveX();	
					counter++;
					Board.displayBoard();
					Board.gameWon();
					}
			
				else if (Player.type.equals("X")||Player.type.equals("x"))
					{
					Player.placeMoveX();					
					counter++;
					if (counter==9)
						{
						System.out.println("Tie Game");
						System.exit(0);
						}
					AI.hardCompMoveO();					
					counter++;
					Board.displayBoard();			
					Board.gameWon();
						}
					}
				}
			}
		}
	