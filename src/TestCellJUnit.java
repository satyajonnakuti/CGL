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
	/*
	 * In this test case we are checking if the current cell is alive or not which helps us to find the alive count in the board. 
	 * 
	 */
	public void testAlive()
	{
		Cell c=new Cell(2,3);//we are giving a sample input to the cell
		
		System.out.println("Checking the first alive cell");//print statement for the test
		
		Assertion.assertEquals("true",c.isAlive());//comparing the output
	}
	/****************************************************************************************************************************************************************/

}
