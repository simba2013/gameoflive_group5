package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import util.Human;
import util.LifeUtil;
import util.Panel;

public class TestGameofLive {

	public Panel panel = null;
	public LifeUtil lu = null;
	public Human human = null;
	Human humanOutPanel;

	@Before
	public void setUp() {
		System.out.println("--------------------Test Begining--------------------");
		panel = new Panel(3, 3);
		panel.getHuman()[0][0] = new Human(0, 0, 0);
		panel.getHuman()[0][1] = new Human(0, 1, 1);
		panel.getHuman()[0][2] = new Human(0, 2, 0);
		panel.getHuman()[1][0] = new Human(1, 0, 1);
		panel.getHuman()[1][1] = new Human(1, 1, 1);
		panel.getHuman()[1][2] = new Human(1, 2, 0);
		panel.getHuman()[2][0] = new Human(2, 0, 1);
		panel.getHuman()[2][1] = new Human(2, 1, 0);
		panel.getHuman()[2][2] = new Human(2, 2, 0);
		human = panel.getHuman()[2][1];
		lu = new LifeUtil(human, panel);
		humanOutPanel = new Human(3,4,1);
	}

	/**
	 * checking if function neighbourAliveCheck() can get the right alive neighbor 
	 */
	@Test
	public void testNeighborAlive(){
		int aliveNeighbor = lu.neighbourAliveCheck(human);
		assertEquals(3, aliveNeighbor);
	}
	
	/**
	 * checking human outof panel has no neighbor
	 */
	@Test
	public void countNeighborWhenHumanOut(){
		assertEquals(0, lu.neighbourAliveCheck(humanOutPanel));
	}
	
	@After
	public void tearDown(){
		System.out.println("--------------------Test Ending--------------------");
	}
}
