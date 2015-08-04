package pieces;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * @author      Firstname Lastname <address @ example.com>
 * @version     1.6                 (current version number of program)
 * @since       2010-03-31          (the version of the package this class was first added to)
 */
/**
 * The Class Virtual_Chessboard.
 */
public class Virtual_Chessboard {

	/** The Constant rows. */
	public static final int rows = 8;
	
	/** The Constant columns. */
	public static final int columns = 8;
	
	/** The white score. */
	public static int whiteScore = 0;
	
	/** The black score. */
	public static int blackScore = 0;
	
	/** The white move. */
	public static boolean whiteMove = true;

	/** The chessboard. */
	public static AbstractPiece[][] chessboard = new AbstractPiece[columns][rows];

	/**
	 * Creates the board.
	 */
	public static void createBoard() {

		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if ((i == 0 && j == 0) || (i == 0 && j == 7)) {
					Rook BlackRook = new Rook(false);
					chessboard[i][j] = BlackRook;
				} else if ((i == 0 && j == 1) || (i == 0 && j == 6)) {
					Knight BlackKnight = new Knight(false);
					chessboard[i][j] = BlackKnight;
				} else if ((i == 0 && j == 2) || (i == 0 && j == 5)) {
					Bishop BlackBishop = new Bishop(false);
					chessboard[i][j] = BlackBishop;
				} else if (i == 0 && j == 3) {
					King BlackKing = new King(false);
					chessboard[i][j] = BlackKing;
				} else if (i == 0 && j == 4) {
					Queen BlackQueen = new Queen(false);
					chessboard[i][j] = BlackQueen;
				} else if ((i == 7 && j == 0) || (i == 7 && j == 7)) {
					Rook WhiteRook = new Rook(true);
					chessboard[i][j] = WhiteRook;
				} else if ((i == 7 && j == 1) || (i == 7 && j == 6)) {
					Knight WhiteKnight = new Knight(true);
					chessboard[i][j] = WhiteKnight;
				} else if ((i == 7 && j == 2) || (i == 7 && j == 5)) {
					Bishop WhiteBishop = new Bishop(true);
					chessboard[i][j] = WhiteBishop;
				} else if (i == 7 && j == 3) {
					King WhiteKing = new King(true);
					chessboard[i][j] = WhiteKing;
				} else if (i == 7 && j == 4) {
					Queen WhiteQueen = new Queen(true);
					chessboard[i][j] = WhiteQueen;
				} else if (i == 1) {
					Pawn BlackPawn = new Pawn(false);
					chessboard[i][j] = BlackPawn;
				} else if (i == 6) {
					Pawn WhitePawn = new Pawn(true);
					chessboard[i][j] = WhitePawn;
				} else {
					chessboard[i][j] = null;
				}
			}
		}
	}

	/**
	 * Prints the board.
	 *
	 * @param chessboard the chessboard
	 */
	public static void printBoard(AbstractPiece[][] chessboard) {
		int k = 8;
		System.out.print("   " + "\t" + "a" + "\t" + "b" + "\t" + "c" + "\t"
				+ "d" + "\t" + "e" + "\t" + "f" + "\t" + "g" + "\t" + "h");
		for (int i = 0; i < 8; i++) {
			System.out.print("\n" + k);
			k--;
			for (int j = 0; j < 8; j++) {
				System.out.print("\t");
			if(chessboard[i][j] instanceof AbstractPiece){
				chessboard[i][j].draw();
			}
			else{
				System.out.print("");
			}
			
			} // / j for

		} // i for
		System.out.println("\nWhitescore: " + whiteScore);
		System.out.println("Black Score: " + blackScore);
	}

	/**
	 * Move.
	 *
	 * @param chessboard the chessboard
	 * @param move the move
	 */
	public static void move(AbstractPiece[][] chessboard, String move) {

		
		System.out.println("Please enter move.");
		Scanner in = new Scanner(System.in);
		move = in.nextLine();

		char newj = move.charAt(6);
		int newi = Integer.parseInt(move.substring(7, 8));
		newi = -newi + 8;
		char oldj = move.charAt(0);
		int oldi = Integer.parseInt(move.substring(1, 2));
		oldi = -oldi + 8;

		switch (newj) {
		case 'a':
			newj = (int) 0;
			break;
		case 'b':
			newj = (int) 1;
			break;
		case 'c':
			newj = (int) 2;
			break;
		case 'd':
			newj = (int) 3;
			break;
		case 'e':
			newj = (int) 4;
			break;
		case 'f':
			newj = (int) 5;
			break;
		case 'g':
			newj = (int) 6;
			break;
		case 'h':
			newj = (int) 7;
			break;
		}

		switch (oldj) {
		case 'a':
			oldj = (int) 0;
			break;
		case 'b':
			oldj = (int) 1;
			break;
		case 'c':
			oldj = (int) 2;
			break;
		case 'd':
			oldj = (int) 3;
			break;
		case 'e':
			oldj = (int) 4;
			break;
		case 'f':
			oldj = (int) 5;
			break;
		case 'g':
			oldj = (int) 6;
			break;
		case 'h':
			oldj = (int) 7;
			break;
		}

		if (isValid(chessboard, oldi, oldj, newi, newj)) {
			if(chessboard[newi][newj]==null){
				blackScore+=0;
			}
			else if(chessboard[newi][newj].isWhite){
				blackScore += chessboard[newi][newj].relativeValue();
			}
			else{
				whiteScore += chessboard[newi][newj].relativeValue();
			}
			chessboard[newi][newj] = chessboard[oldi][oldj];
			chessboard[oldi][oldj] = null;
			
			whiteMove = !whiteMove;
			
		} else {
			System.out.println("Not a valid move!");
			move(chessboard, move);

		}

	}

	/**
	 * Checks if is valid.
	 *
	 * @param chessboard the chessboard
	 * @param oldi the oldi
	 * @param oldj the oldj
	 * @param newi the newi
	 * @param newj the newj
	 * @return true, if is valid
	 */
	public static boolean isValid(AbstractPiece[][] chessboard, int oldi, int oldj,
			int newi, int newj) {

		if(chessboard[oldi][oldj].isWhite && whiteMove==false){
			return false;
		}
		else if(chessboard[oldi][oldj].isWhite==false && whiteMove==true){
			return false;
		}
		
		if (newi > 7 || newi < 0 || newj > 7 || newj < 0) {
			return false;
		}
		
		if(chessboard[oldi][oldj] instanceof Rook && verticalClear(oldi,oldj,newi,newj)==false ){
			return false;
		}
		else if(chessboard[oldi][oldj] instanceof Rook && horizontalClear(oldi,oldj,newi,newj)==false){
			return false;
		}
		else if(chessboard[oldi][oldj] instanceof Knight && destClear(oldi,oldj,newi,newj)==false){
			return false;
		}
	/*	else if(chessboard[oldi][oldj] instanceof Queen && horizontalClear(oldi,oldj,newi,newj)==false){
			return false;
		}
		else if(chessboard[oldi][oldj] instanceof Queen && verticalClear(oldi,oldj,newi,newj)==false){
			return false;
		}*/
		else if(chessboard[oldi][oldj] instanceof Pawn && pawnTake(oldi,oldj,newi,newj)){
			return true;
		}

		if(chessboard[oldi][oldj].isMoveValid(oldi,oldj,newi,newj)){
			return true;
		}
		return false;
	}

	
	

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		createBoard();

		Scanner in = new Scanner(System.in);

		String command = "";

		while (!in.equals("exit")) {
			printBoard(chessboard);
			move(chessboard, command);

		}

	}
	
	/**
	 * Vertical clear.
	 *
	 * @param oldi the oldi
	 * @param oldj the oldj
	 * @param newi the newi
	 * @param newj the newj
	 * @return true, if successful
	 */
	public static boolean verticalClear (int oldi,int oldj,int newi, int newj){
		for(int i=1;i<(Math.abs(oldi-newi));i++){
		
			if(newi>oldi){
				if(chessboard[oldi+i][oldj]!=null || chessboard[oldi][oldj].isWhite == chessboard[newi][newj].isWhite){
					return false;
			}
			}
			
			else if(newi<oldi){
				if(chessboard[oldi-i][oldj]!=null || chessboard[oldi][oldj].isWhite == chessboard[newi][newj].isWhite){
					return false;
				}
			}
			
		}
		return true;
	}
	
	/**
	 * Horizontal clear.
	 *
	 * @param oldi the oldi
	 * @param oldj the oldj
	 * @param newi the newi
	 * @param newj the newj
	 * @return true, if successful
	 */
	public static boolean horizontalClear(int oldi,int oldj,int newi,int newj){
		for(int i=1;i<(Math.abs(oldj-newj));i++){
			if(newj>oldj){
				if(chessboard[oldi][oldj+i]!=null || chessboard[newi][newj].isWhite == chessboard[oldi][oldj].isWhite){
					return false;
				}
				else if(newj<oldj){
					if(chessboard[oldi][oldj-i]!=null || chessboard[oldi][oldj].isWhite == chessboard[newi][newj].isWhite){
						return false;
					}
				}
			}
		}
		return true;
	}
	
	/**
	 * Dest clear.
	 *
	 * @param oldi the oldi
	 * @param oldj the oldj
	 * @param newi the newi
	 * @param newj the newj
	 * @return true, if successful
	 */
	public static boolean destClear(int oldi,int oldj,int newi,int newj){
		if(chessboard[oldi][oldj].isWhite()==chessboard[newi][newj].isWhite()){
			return false;
		}
		return true;
	}
	
	/**
	 * Pawn take.
	 *
	 * @param oldi the oldi
	 * @param oldj the oldj
	 * @param newi the newi
	 * @param newj the newj
	 * @return true, if successful
	 */
	public static boolean pawnTake(int oldi,int oldj,int newi,int newj){
		if(chessboard[oldi][oldj].isWhite){
			if(newi==oldi-1 && (newj==oldj+1 || newj==oldj-1)&& chessboard[newi][newj]!=null){
				return true;
			}
		}
		else{
			if(newi==oldi+1 && (newj==oldj+1 || newj==oldj-1)&& chessboard[newi][newj]!=null){
				return true;
			}
		}
		return false;
	}
}