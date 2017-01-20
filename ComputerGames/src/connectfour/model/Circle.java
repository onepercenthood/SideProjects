package connectfour.model;

/**
 * 
 * @author Hoodie
 *
 */
public class Circle {

	/** Holds the row number of the circle in the board */ 
	protected int row;

	/** Holds the column number of the circle in the board */ 
	protected int column;
	
	/** Holds integer referring to if the circle has been played
	 * 0 = Empty 
	 * 1 = Player 1 chip
	 * 2 = Player 2 chip
	 */
	protected int isPlayed; 
	
	/**
	 * Constructor for a Circle, takes in the (row, column) location
	 * @param r is the row the circle is in (Integer)
	 * @param c is the column the circle is in (Integer)
	 */
	public Circle(int r, int c){
		this.row = r;
		this.column = c;
		this.isPlayed = 0;
				
	}
	
	/** Getter for Row: returns row number */
	public int getRow() {
		return row;
	}

	/** Setter for Row: Integer */
	public void setRow(int row) {
		this.row = row;
	}

	/** Getting for Column: returns column number */
	public int getColumn() {
		return column;
	}

	/** Setter for Column: Integer */
	public void setColumn(int column) {
		this.column = column;
	}

	/** Getter for isPlayed: returns 0:empty, 1:player1, 2:player2 */
	public int getIsPlayed() {
		return isPlayed;
	}

	/** Setter for isPlayed: Integer */ 
	public void setIsPlayed(int isPlayed) {
		this.isPlayed = isPlayed;
	}
	
	
}
