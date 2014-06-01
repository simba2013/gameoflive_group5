package util;


public class Human {

	private int coordinateX;
	private int coordinateY;
	private int alive;
	
	public Human(int coordinateX, int coordinateY, int alive) {
		super();
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
		this.alive = alive;
	}
	
	public int getCoordinateX() {
		return coordinateX;
	}
	public void setCoordinateX(int coordinateX) {
		this.coordinateX = coordinateX;
	}
	public int getCoordinateY() {
		return coordinateY;
	}
	public void setCoordinateY(int coordinateY) {
		this.coordinateY = coordinateY;
	}
	public int getAlive() {
		return alive;
	}
	public void setAlive(int alive) {
		this.alive = alive;
	}
	

}
