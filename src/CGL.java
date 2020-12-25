/**
 * we did not define any packages in this project
 */
import java.util.Scanner;
/**
 * 
 * @author sujtha and @author satya discussed the functionality together. 
 * @author srikar and @author santosh also helped us in few areas.
 * @author LN Murthy garu also helped us in the logic and understanding.
 * @author Satya
 *
 */
/**
 * ****************Conways Game Of Life***********************************
 * Initially, there is a board with some cells which may be alive or dead. 
 * Task is to generate the next generation of cells based on the following rules: 
 *     
 * Rule 1: Any live cell with fewer than two live neighbors dies, as if caused by under
 * population. 
 * Rule 2:Any live cell with two or three live neighbors lives on
 * to the next generation. 
 * Rule 3: Any live cell with more than three live  neighbors dies, as if by overpopulation. 
 * Ruele 4: Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 * 
 * Step 1 => find the no Of Neighbours that are alive; 
 * Step 2 => apply rules of game to get next genration by use the if conditions
 * to check all neighbors exluding it self as given video lecture
 * 
 * *************Rules of Life********************* 
 * Lonely cell will die ==> aliveNeighbours < 2 ;
 * Cell will die due to overpopulation ==> aliveNeighbours > 3 
 * A new cell will born ==> if currently dead cell have aliveNeighbours == 3
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
	/****************************************************************************************************************************************************************/

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
	/****************************************************************************************************************************************************************/

}
