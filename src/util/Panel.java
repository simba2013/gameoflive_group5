package util;


public class Panel {
	
	private int longth;
	private int width;
	//private Vector<Human> human = new Vector<Human>();
	
	private Human[][] human;
	
	public Panel(int longth, int width) {
		super();
		this.longth = longth;
		this.width = width;
		human = new Human[longth][width];
	}

	public Human[][] getHuman() {
		return human;
	}

	public void setHuman(Human[][] human) {
		this.human = human;
	}

	public int getLongth() {
		return longth;
	}

	public void setLongth(int longth) {
		this.longth = longth;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
}
