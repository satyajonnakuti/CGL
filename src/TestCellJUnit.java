/**
 * 
 */
import org.junit.jupiter.api.Assertions;
/**
 * @author Satya
 *
 */
public class TestCellJunit {
	@Test
	public void testAlive()
	{
		Cell c=new Cell(2,3);
		System.out.println("Checking the first alive cell");
		Assertion.assertEquals("true",c.isAlive());
	}

}
