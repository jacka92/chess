package pieces;

// TODO: Auto-generated Javadoc
/**
 * The Class King.
 */
public class King extends AbstractPiece {

	/**
	 * Instantiates a new king.
	 *
	 * @param isWhite the is white
	 */
	public King(boolean isWhite) {
		super(isWhite);
		
	}

	/* (non-Javadoc)
	 * @see pieces.AbstractPiece#draw()
	 */
	@Override
	public void draw() {
		if(isWhite){
			System.out.print("\u2654");
		}
		else{
			System.out.print("\u265A");
		}
		
	}

	/* (non-Javadoc)
	 * @see pieces.AbstractPiece#isMoveValid(int, int, int, int)
	 */
	@Override
	public boolean isMoveValid(int oldi, int oldj, int newi, int newj) {
		if ((newi == oldi + 1 && newj == oldj)
				|| (newi == oldi + 1 && newj == oldj + 1)
				|| (newi == oldi && newj == oldj + 1)
				|| (newi == oldi - 1 && newj == oldj)
				|| (newi == oldi - 1 && newj == oldj - 1)
				|| (newi == oldi && newj == oldj - 1)
				|| (newi == oldi - 1 && newj == newj + 1)
				|| (newi == oldi - 1 && newj == newj + 1)) {
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see pieces.AbstractPiece#relativeValue()
	 */
	@Override
	public int relativeValue() {
		
		return 0;
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
