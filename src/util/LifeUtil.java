package util;

public class LifeUtil {

	private Human human;
	private Panel panel;

	public LifeUtil(Human human, Panel panel) {
		super();
		this.human = human;
		this.panel = panel;
	}

	private int findHumanAlive(int x, int y) {

		// if the neighbor is outside the panel, then treat as dead neighbor
		if (x < 0 || y < 0) {
			return 0;
		} else if (x > panel.getLongth() - 1 || y > panel.getWidth() - 1) {
			return 0;
		} else {
			return panel.getHuman()[x][y].getAlive();
		}

	}

	/*
	 * We use this method to calculate how may neighbor is alive
	 */
	public int neighbourAliveCheck(Human h) {

		int x = h.getCoordinateX();
		int y = h.getCoordinateY();

		// each people should have 8 neighbors
		int count = findHumanAlive(x - 1, y - 1) + findHumanAlive(x - 1, y)
				+ findHumanAlive(x - 1, y + 1) + findHumanAlive(x, y + 1)
				+ findHumanAlive(x, y - 1) + findHumanAlive(x + 1, y - 1)
				+ findHumanAlive(x + 1, y) + findHumanAlive(x + 1, y + 1);

		return count;
	}

	

}
