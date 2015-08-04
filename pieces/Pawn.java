package pieces;

// TODO: Auto-generated Javadoc
/**
 * The Class Pawn.
 */
public class Pawn extends AbstractPiece {

	
	
	/**
	 * Instantiates a new pawn.
	 *
	 * @param isWhite the is white
	 */
	public Pawn(boolean isWhite) {
		super(isWhite);
		
	}

	/* (non-Javadoc)
	 * @see pieces.AbstractPiece#draw()
	 */
	@Override
	public void draw() {
		
		if(isWhite){
			System.out.print("\u2659");
		}
		else{
			System.out.print("\u265F");
		}
		
	}

	/* (non-Javadoc)
	 * @see pieces.AbstractPiece#isMoveValid(int, int, int, int)
	 */
	@Override
	public boolean isMoveValid(int oldi, int oldj, int newi, int newj) {
		if(isWhite){
			if (oldi == 6 && newi >= 4 && newi<oldi) {
				return true;
			} else if (newi == oldi - 1) {
				return true;
			}
		}
		if(!isWhite){
			if (oldi == 1 && newi <= 3 && newi>oldi) {
				return true;
			} else if (oldi == newi - 1) {
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
		
		return 1;
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
