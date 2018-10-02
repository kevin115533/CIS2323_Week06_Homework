package CheckersPiece;

public class CheckersPiece{
	private char color;
	private int xPos,yPos;
	
	public void makePiece(char x, int y, int z){
		setColor(x);
		setPos(y,z);
	}

	public void setColor(char x){
		color = x;	
	}

	public char getColor(){
		return color;
	}
	
	public void setPos(int x, int y){
		xPos = x;
		yPos = y;	
	}
	
	public String getPos(){
		return xPos + yPos;	
	}
	
	public String printPiece(){
		return color + xPos + yPos;	
	}
	
}