package pieces;

// TODO: Auto-generated Javadoc
/**
 * The Class Knight.
 */
public class Knight extends AbstractPiece {

	/**
	 * Instantiates a new knight.
	 *
	 * @param isWhite the is white
	 */
	public Knight(boolean isWhite) {
		super(isWhite);
		
	}

	/* (non-Javadoc)
	 * @see pieces.AbstractPiece#draw()
	 */
	@Override
	public void draw() {
		if(isWhite){
			System.out.print("\u2658");
		}
		else{
			System.out.print("\u265E");
		}
	}

	/* (non-Javadoc)
	 * @see pieces.AbstractPiece#isMoveValid(int, int, int, int)
	 */
	@Override
	public boolean isMoveValid(int oldi, int oldj, int newi, int newj) {
		
		
		
			if ((newi == oldi - 1 && newj == oldj + 1)
				|| (newi == oldi - 2 && newj == oldj - 1)
				|| (newi == oldi - 2 && newj == oldj + 1)
				|| (newi == oldi - 1 && newj == oldj + 2)
				|| (newi == oldi + 1 && newj == oldj + 2)
				|| (newi == oldi + 2 && newj == oldj + 1)
				|| (newi == oldi + 2 && newj == oldj - 1)
				|| (newi == oldi + 1 && newj == oldj - 2)) {
			return true;}
		return false;
	}

	/* (non-Javadoc)
	 * @see pieces.AbstractPiece#relativeValue()
	 */
	@Override
	public int relativeValue() {
		
		return 3;
	}

	/* (non-Javadoc)
	 * @see pieces.AbstractPiece#verticalClear()
	 */
	@Override
	public boolean verticalClear() {
		// TODO Auto-generated method stub
		return false;
	}

}
