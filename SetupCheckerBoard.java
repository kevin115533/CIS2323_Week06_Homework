import CheckersPiece.*;
import Board.*;
import java.util.Scanner;

public class SetupCheckerBoard{
	public static void main (String[] args){
		char userOpt;
		final int count = 12;
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Play a game of checkers? y/n");
		userOpt = input1.next().charAt(0);
		
		
		if(userOpt == 'y'){
		Board newGame = new Board();
		CheckersPiece[] red = new CheckersPiece[count];
		
		newGame.printBoard();
			
			
			
		}
	}
}