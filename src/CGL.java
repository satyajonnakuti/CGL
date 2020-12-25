/**
 * 
 */
import java.util.Scanner;
/**
 * @author Satya
 *
 */
public class TestClass {

	/**
	 * @param args
	 */
	
	/*In main method ,the scanner class will take the input for the game 
	 * 
	 * 
	 */
    public TestClass()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Board b;
		 Cell[] cells;
		 int dimension ;
		 
		
		/*creating a current generation board by  creating an object
		 * for the board
		 * 
		 * 
		 */
		 cells=new Cell[4];
		 Scanner scan=new Scanner(System.in);
		 cells[0]=new Cell(2,3);
		 cells[1]=new Cell(3,3);
		 cells[2]=new Cell(4,2);
		 cells[3]=new Cell(3,5);
		 dimension=6;
		 b=new Board(cells,dimension);
		 Game game=new Game(b);
		 game.startGame();
		
		
	}

}
