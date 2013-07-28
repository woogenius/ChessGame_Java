package pieces;

import junit.framework.TestCase;

public class PieceTest extends TestCase {
	public void testCreate() throws Exception {
		Piece whitePawn = Piece.create(Piece.COLOR_WHITE, Piece.EXP_PAWN);
		assertEquals(Piece.COLOR_WHITE, whitePawn.getColor());
		Piece blackPawn = Piece.create(Piece.COLOR_BLACK, Piece.EXP_PAWN);
		assertEquals(Piece.COLOR_BLACK, blackPawn.getColor());
		
		assertEquals(Piece.EXP_PAWN, whitePawn.getExp());
		assertEquals(Character.toUpperCase(Piece.EXP_PAWN), blackPawn.getExp());
	}
	
	public void testCount() throws Exception {
		Piece.resetCount();
		Piece.create(Piece.COLOR_BLACK, Piece.EXP_PAWN);
		assertEquals(1, Piece.getBlackCount());
		Piece.create(Piece.COLOR_WHITE, Piece.EXP_PAWN);
		assertEquals(1, Piece.getWhiteCount());
		Piece.create(Piece.COLOR_EMPTY, Piece.EXP_PAWN);
		assertEquals(1, Piece.getWhiteCount());
		assertEquals(1, Piece.getBlackCount());
	}
	
	public void testColor() throws Exception {
		Piece whitePiece = Piece.create(Piece.COLOR_WHITE, Piece.EXP_PAWN);
		assertTrue(whitePiece.isWhite());
		Piece blackPiece = Piece.create(Piece.COLOR_BLACK, Piece.EXP_PAWN);
		assertTrue(blackPiece.isBlack());
		
	}
}
