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
	/**This method will print the board
	 * where . represents a dead cell
	 * and * represents a live cell.
	 */
	public String toString()
	{
		String s="";
		for(int i=0;i<this.dimensions;i++)
		{
			for(int j=0;j<this.dimensions;j++)
		{
			if(this.board[i][j])
			{
				s+="*";
			}
			else {
				s+=".";
			}
		}s+="\n";
		}return s.strip();
	}
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

	/**
	 * 
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

	/**creating a board
	 * 
	 * 2,2   
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

	public void generateBoard() {
		boolean[][] nextboard=new boolean[dimensions][dimensions];
		liveCells(nextboard);
		deadCells(nextboard);
		board=nextboard;
		//cells=nextcells;
	}
	/****************************************************************************************************************************************************************/

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
}
