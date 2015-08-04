package pieces;

// TODO: Auto-generated Javadoc
/**
 * The Class AbstractPiece.
 */
public abstract class AbstractPiece {
	
	/** The is white. */
	public boolean isWhite;
	
	
	/**
	 * Instantiates a new abstract piece.
	 *
	 * @param isWhite the is white
	 */
	public AbstractPiece(boolean isWhite){
		this.isWhite = isWhite;
	}
	
	//Returns true if white, false otherwise
	
	
	/**
	 * Checks if is white.
	 *
	 * @return true, if is white
	 */
	public boolean isWhite(){
		return isWhite;
	}
	
	//Draws given piece into the console
	
	/**
	 * Draw.
	 */
	public abstract void draw();
	
	/*Checks whether a given move is valid.*/
	
	/**
	 * Checks if is move valid.
	 *
	 * @param scrRow the scr row
	 * @param srcCol the src col
	 * @param destRow the dest row
	 * @param destCol the dest col
	 * @return true, if is move valid
	 */
	public abstract boolean isMoveValid(int scrRow,int srcCol,int destRow, int destCol);
	
	//Returns relative chess piece value of this chessman
	
	/**
	 * Relative value.
	 *
	 * @return the int
	 */
	public abstract int relativeValue();
	
	/**
	 * Vertical clear.
	 *
	 * @return true, if successful
	 */
	public abstract boolean verticalClear();
	
}

