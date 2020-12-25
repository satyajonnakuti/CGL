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
public class TestCellJunit {
	@Test
	public void testAlive()
	{
		Cell c=new Cell(2,3);
		System.out.println("Checking the first alive cell");
		Assertion.assertEquals("true",c.isAlive());
	}
	/****************************************************************************************************************************************************************/

}
