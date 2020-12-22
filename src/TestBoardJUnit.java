/**
 * 
 */
import org.junit.jupiter.api.Assertions;
/**
 * 
 *
 */
public class TestBoardJUnit {
	
	@Test
	public void testCreateBoard()
	{
		Cell[] cell= {new Cell(2,3),new Cell(4,4),new Cell(3,3)};
		Board b=new Board(cell);
		System.out.println("# First Test Case Passed");
		b.createBoard(cell);
		Assertions.assertEquals(".....\n.....\n...*.\n...*.\n....*",b);
	
	}
	public void testGenerateBoard()
	{
		Cell[] cell= {new Cell(2,3),new Cell(4,4),new Cell(3,3),new Cell(4,3)};
		Board b=new Board(cell);
		System.out.println("Generate board passed");
		String s=b.generateBoard(cell);
		Assertions.assertEquals(".....\n.....\n.....\n..**.\n...**",s);
	}
	
	

}
