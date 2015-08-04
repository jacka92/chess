package pieces;

// TODO: Auto-generated Javadoc
/**
 * The Class Bishop.
 */
public class Bishop extends AbstractPiece{

	/**
	 * Instantiates a new bishop.
	 *
	 * @param isWhite the is white
	 */
	public Bishop(boolean isWhite) {
		super(isWhite);
		
	}

	/* (non-Javadoc)
	 * @see pieces.AbstractPiece#draw()
	 */
	@Override
	public void draw() {
		if(isWhite){
			System.out.print("\u2657");
		}
		else{
			System.out.print("\u265D");
		}
		
	}

	/* (non-Javadoc)
	 * @see pieces.AbstractPiece#isMoveValid(int, int, int, int)
	 */
	@Override
	public boolean isMoveValid(int oldi, int oldj, int newi, int newj) {
		for (int x = 0; x < 8; x++) {
			if (newi == oldi + x && newj == oldj + x || newi == oldi - x
					&& newj == oldj - x || newi == oldi + x
					&& newj == oldj - x || newi == oldi - x
					&& newj == oldj + x) {
				return true;
			}
		}
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
