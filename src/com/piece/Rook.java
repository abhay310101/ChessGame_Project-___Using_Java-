package com.piece;

import main.GamePanel;
import main.Type;

public class Rook extends Piece{

	public Rook(int color, int col, int row) {
		super(color, col, row);
		type = Type.ROOK;
		
		if (color == GamePanel.WHITE) {
			image = getImage("/Piece/wR");
		}
		else{
			image = getImage("/Piece/bR");
			
		}
	}
	
	public boolean canMove(int targetCol, int targetRow) {
		
		
		if(isWithinBoard(targetCol, targetRow ) && isSameSquare(targetCol, targetRow) == false) {
		//Rook can move as long as either it's col or row is the same 
		if (targetCol == preCol || targetRow == preRow) {
			if(isValidSquare(targetCol, targetRow) && pieceIsOnStraightLine(targetCol, targetRow)==false) {
				return true;
			}
		}
	}
		return false;
}
}