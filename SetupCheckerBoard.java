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
			newGame.printBoard();
		
			CheckersPiece[] red = new CheckersPiece[count];
			
			for(int i = 0;i<count;i++){
				red[i] = new CheckersPiece();
				if(i<4){
					red[i].makePiece("R",1,0);	
				}
				if(i>=4 && i<8){
					red[i].makePiece("R",1,1);
				}
				if(i>=8){
					red[i].makePiece("R",1,2);
				}
			}
			
			CheckersPiece[] blk = new CheckersPiece[count];
			
			for(int i = 0;i<count;i++){
				blk[i] = new CheckersPiece();
				if(i<4){
					blk[i].makePiece("B",1,5);	
				}
				if(i>=4 && i<8){
					blk[i].makePiece("B",1,6);
				}
				if(i>=8){
					blk[i].makePiece("B",1,7);
				}
			}
			
			for(int i = 0;i<count;i++){
				red[i].printPiece();
			}
			
			for(int i = 0;i<count;i++){
				blk[i].printPiece();
			}
			
			
	}
}
 }