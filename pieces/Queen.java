package pieces;

// TODO: Auto-generated Javadoc
/**
 * The Class Queen.
 */
public class Queen extends AbstractPiece {

	/**
	 * Instantiates a new queen.
	 *
	 * @param isWhite the is white
	 */
	public Queen(boolean isWhite) {
		super(isWhite);
		
	}

	/* (non-Javadoc)
	 * @see pieces.AbstractPiece#draw()
	 */
	@Override
	public void draw() {
		if(isWhite){
			System.out.print("\u2655");
		}
		else{
			System.out.print("\u265B");
		}
		
	}

	/* (non-Javadoc)
	 * @see pieces.AbstractPiece#isMoveValid(int, int, int, int)
	 */
	@Override
	public boolean isMoveValid(int oldi, int oldj, int newi, int newj) {
//		for (int x = 0; x < 8; x++) {
//			if ((newi == oldi + x && newj == oldj + x) || (newi == oldi - x
//					&& newj == oldj - x) || (newi == oldi + x
//					&& newj == oldj - x) || (newi == oldi - x
//					&& newj == oldj + x) || (newi==oldi) || (newj==oldj)) {
//				return true;
//			}
//			
//		}
//		return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see pieces.AbstractPiece#relativeValue()
	 */
	@Override
	public int relativeValue() {
		
		return 9;
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
