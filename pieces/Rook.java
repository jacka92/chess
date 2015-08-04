package pieces;

// TODO: Auto-generated Javadoc
/**
 * The Class Rook.
 */
public class Rook extends AbstractPiece {

	/**
	 * Instantiates a new rook.
	 *
	 * @param isWhite the is white
	 */
	public Rook(boolean isWhite) {
		super(isWhite);
		
	}

	/* (non-Javadoc)
	 * @see pieces.AbstractPiece#draw()
	 */
	@Override
	public void draw() {
		if(isWhite){
			System.out.print("\u2656");
		}
		else{
			System.out.print("\u265C");
		}
	}

	/* (non-Javadoc)
	 * @see pieces.AbstractPiece#isMoveValid(int, int, int, int)
	 */
	@Override
	public boolean isMoveValid(int oldi, int oldj, int newi, int newj) {
		if (oldi == newi || oldj == newj) {
			return true;
			
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see pieces.AbstractPiece#relativeValue()
	 */
	@Override
	public int relativeValue() {
		
		return 5;
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
