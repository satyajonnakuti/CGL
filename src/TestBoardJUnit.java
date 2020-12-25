/**
 * we did not define any packages in this project
 */
import org.junit.jupiter.api.Assertions;
/**
 * 
 * @author sujtha and @author satya discussed the functionality together. 
 * @author srikar and @author santosh also helped us in few areas.
 * @author LN Murthy garu also helped us in the logic and understanding.
 * @author Satya
 *
 */
public class TestBoardJUnit {
	
	@Test
	/*
	 * Here we are writing test case for creating a board and we are using sample data for checking if the board is created properly or not.
	 */
	public void testCreateBoard()
	{
		Cell[] cell= {new Cell(2,3),new Cell(4,4),new Cell(3,3)};//we are giving few sample live cells for checking the functionality
		
		Board b=new Board(cell);
		
		System.out.println("# First Test Case Passed");//print statement for the test case
		
		b.createBoard(cell);//we are creating the board here
		
		Assertions.assertEquals(".....\n.....\n...*.\n...*.\n....*",b);// checking with our output and comparing it.
		
	
	}
	/****************************************************************************************************************************************************************/

	@Test
	/*
	 * Here we are checking the alive cell count in the board and passing array of cells as in put and checking for possible alive cells in the board.
	 */
	public void testAliveCount()
	
	{
		Cell[] cell= {new Cell(2,3),new Cell(4,4),new Cell(3,3),new Cell(4,3)};//we are giving few sample live cells for checking the functionality
		
		Board b=new Board(cell);//we are creating a new board
		
		System.out.println("Generate board passed");//print statement for the test case
		
		Assertions.assertEquals("2",b.alivecount(new Cell(4,4)));// checking with our output and comparing it.
		
	}
	/****************************************************************************************************************************************************************/
	@Test
	/*
	 * We are generating the next generation board and checking if the board is correct or not in this case.
	 * 
	 */
	public void generateBoard()
	{
		
		Cell[] cell= {new Cell(2,3),new Cell(4,4),new Cell(3,3),new Cell(4,3)};//we are giving few sample live cells for checking the functionality
		
		Board b=new Board(cell);//we are creating a new board
		
		System.out.println("Generate board passed");//print statement for the test case
		
		String s=b.generateBoard(cell);//we are generating a new board.
		
		Assertions.assertEquals(".....\n.....\n.....\n..**.\n...**",s);// checking with our output and comparing it.
		
	}
	/****************************************************************************************************************************************************************/

	

}
