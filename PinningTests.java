/*
 * PinningTests.java
 * 
 * Clinton Wadley
 * cvw5@pitt.edu
 * 4/5/2016
 * CS1632
 * Deliverable 5
 * 
 * Class of JUnit pinning tests for testing efficiency refactoring of SlowLifeGUI
 */

import static org.junit.Assert.*;
import org.junit.Test;

public class PinningTests {
	
	@Test
	public void convertToIntReturnsSamePositive()
	{
		MainPanel panel = new MainPanel(15);
		int mahInt = 20;
		int returnInt = panel.convertToInt(mahInt);
		assertEquals(mahInt, returnInt);
	}
	
	@Test
	public void convertToIntReturnsSameMaxInt()
	{
		MainPanel panel = new MainPanel(15);
		int mahInt = Integer.MAX_VALUE;
		int returnInt = panel.convertToInt(mahInt);
		assertEquals(mahInt, returnInt);
	}
	
	@Test
	public void convertToIntReturnsSameZero()
	{
		MainPanel panel = new MainPanel(15);
		int mahInt = 0;
		int returnInt = panel.convertToInt(mahInt);
		assertEquals(mahInt, returnInt);
	}
	
	@Test
	public void convertToIntThrowsExceptionNegative()
	{
		MainPanel panel = new MainPanel(15);
		try
		{
			panel.convertToInt(-20);
			fail();
		}
		catch (NumberFormatException e) {}
	}
	
	@Test
	public void toStringAliveReturnsX()
	{
		Cell testCell = new Cell(true);
		String returnString = testCell.toString();
		assertEquals("X", returnString);
	}
	
	@Test
	public void toStringDeadReturnsDot()
	{
		Cell testCell = new Cell(false);
		String returnString = testCell.toString();
		assertEquals(".", returnString);
	}
	
	@Test
	public void toStringBeenAliveDeadReturnsDot()
	{
		Cell testCell = new Cell(true);
		testCell.setAlive(false);
		String returnString = testCell.toString();
		assertEquals(".", returnString);
	}
	
	@Test
	public void toStringBeenAliveAliveReturnsX()
	{
		Cell testCell = new Cell(true);
		testCell.setAlive(false);
		testCell.setAlive(true);
		String returnString = testCell.toString();
		assertEquals("X", returnString);
	}
	
}
