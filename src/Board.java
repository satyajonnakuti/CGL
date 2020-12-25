/**
 * we did not define any packages in this project
 */

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
/***************************************************Board Class**************************************/
/*
 * we are creating this board class to create a board with few live cells and continue the next generations of the cells based on the current ststus of the cell.
 * We are using aliveCount,createBoaed,generateBoard,live cells and deadCells methods in this class.
 * This class helps us to build the boards with live and dead cells and generate next generation boards till all the cells reach to a level where no next generation can be created.
 * 
 */
public class Board {
	
	/** Creating an array of live cells on the board
	 * 
	 */
	public Cell [] cells;
	/** Dimensions of the board
	 * 
	 */
	public int dimensions;
	
	/**creating the  board with the given dimensions parameter
	 * it is a boolean board,where true represents live cells
	 * and false represents dead cells
	 */
	public boolean[][] board;
	
	
	/****************************************************************************************************************************************************************/
	/** This is the constructor Board with size dimensions*dimensions and array of cells represents the live cells in the board.
	 *
	 */
	public Board(Cell[] cells,int dimensions) {
	this.cells=cells;	
	this.dimensions=dimensions;
	this.board=new boolean[dimensions][dimensions];
	
	} 
	/****************************************************************************************************************************************************************/
	/**This method will print the board
	 * where . represents a dead cell
	 * and * represents a live cell.
	 */
	public String toString()
	{
		String s="";//initializing a string
		for(int i=0;i<this.dimensions;i++)
		{
			for(int j=0;j<this.dimensions;j++)
		{
			if(this.board[i][j])
			{
				s+="*";//representing a live cell
			}
			else {
				s+=".";//representing a dead cell
			}
		}s+="\n";//go to new line
		}return s.strip();
	}
	/****************************************************************************************************************************************************************/

	/**
	 * This method is used to find the live cells count by taking the row and column positions
	 * @param row
	 * @param column
	 * @return an integer
	 */
	public int aLiveCount(int row,int column) 
	{
		int count=0;
		try
		{
		
			for(int k=-1;k<=1;k++)
				for(int j=-1;j<=1;j++)
					if(k==0 &&j==0)
					{}
					else {
					if(board[row+k][column+j])
						count++;
					}
			
		}catch(Exception e)
		{
			
		}finally {return count;}
	}
	/****************************************************************************************************************************************************************/

	/**
	 * We are creating a board with row and column data as input and based on the input positions it created the board.  
	 * 
	 * 
	 */
	public void createBoard()
	{
		
		for(int i=0;i<cells.length;i++)
		{
			board[cells[i].row][cells[i].column]=true;
		}
		
	}
	/****************************************************************************************************************************************************************/
	/*
	 * This method is used to find the number of live cells 
	 * @param boolean[][] nextboa
	 */
	public void liveCells(boolean[][] nextboard)
	{ 	
		int count;
		for(int i=0;i<this.cells.length;i++)
		{
			count=aLiveCount(cells[i].row,cells[i].column);
			if(count<2 || count>3)
				nextboard[cells[i].row][cells[i].column]=false;
			if(count==2||count==3)
				nextboard[cells[i].row][cells[i].column]=true;
				//nextcells[count++]=new Cell([cells[i].row],[cells[i].column]);
		}
		}
	/****************************************************************************************************************************************************************/
	/*
	 * This method is used to find the number of dead cells 
	 * @param boolean[][] nextboard
	 */
	public  void deadCells(boolean[][] nextboard)
	{
		try
		{
		for(int i=0;i<cells.length;i++)
		for(int k=-1;k<=1;k++)
			for(int j=-1;j<=1;j++)
			{
				int row=cells[i].row+k;
				int column=cells[i].column+j;
				if(board[row][column])
				{
					
				}else
				{
					int count=aLiveCount(row,column);
					if(count==3)
						nextboard[row][column]=true;
						//nextcells[count++]=new Cell[row][column];
				}
			}
		}catch(Exception e)
		{}finally {}
		
		
	
		
	}
	/************************************************************************************************************/
	/*
	 * In this method we are creating next generation board by taking the count of live and dead cells
	 * We are takinf the dimensions of the board into consideration and creating the next gen board.
	 * 
	 */
	public void generateBoard() {
		boolean[][] nextboard=new boolean[dimensions][dimensions];
		liveCells(nextboard);
		deadCells(nextboard);
		board=nextboard;
		//cells=nextcells;
	}
	/****************************************************************************************************************************************************************/
	
}
