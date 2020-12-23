

public class Cell {
	/*This specifies the row and column of this particular cell in
	 * the game board
	 * 
	 */
	public int row;
	public int column;
	/*This method return a boolean value 
	 * if true indicates the cell is alive
	 * if false indicated the cell is dead
	 */
	public Cell(int row,int column)
	{
		this.row=row;
		this.column=column;
	}
	public boolean isAlive()
	{
		/*
		 * This method is used to find if the current cell is alive or not?
		 */
	}
}
