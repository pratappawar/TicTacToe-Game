package com.tic_tac_toe;

public class TicTacToeGame {
	
	public char[] creatBoard() {   
		char board[] = new char[10];
		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;
	}

	public static void main(String[] args) {
		System.out.println("welcome to TicTacToe!!");//Welcome message
		TicTacToeGame boardobj = new TicTacToeGame();//object creation
		boardobj.creatBoard();
	}
}
