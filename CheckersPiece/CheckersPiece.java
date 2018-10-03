package CheckersPiece;

public class CheckersPiece{
	private String color;
	private int xPos,yPos;
	
	public void makePiece(String x, int y, int z){
		setColor(x);
		setPos(y,z);
	}

	public void setColor(String x){
		color = x;	
	}

	public String getColor(){
		return color;
	}
	
	public void setPos(int x, int y){
		xPos = x;
		yPos = y;	
	}
	
	/*public String getPos(){
		return xPos + yPos;	
	}*/
	
	public void printPiece(){
		System.out.println(color + xPos + yPos);	
	}
	
}