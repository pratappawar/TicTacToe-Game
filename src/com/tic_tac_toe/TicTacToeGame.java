package com.tic_tac_toe;

import java.util.Scanner;

public class TicTacToeGame {

	public String play;
	public char[] creatBoard() {
		// Creating Empty Board
		char board[] = new char[10];
		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;
	}
	public void chooseLetter() { // Creating method
		Scanner letter = new Scanner(System.in); // taking user input
		System.out.println("Enter the letter X-O:");
		String input = letter.nextLine();
		if (input.equals("X")) {
			play = "Computer play";              //computer symbol
			System.out.println(play);
		} else if (input.equals("O")) {
			play = "player play";                //player Symbol
			System.out.println(play);
		} else
			System.out.println("Invalid symbol....");//invalid Symbol
		letter.close();
	}
	public static void main(String[] args) {
		System.out.println("welcome to TicTacToe!!");// Welcome message
		TicTacToeGame tictactoeboard = new TicTacToeGame();// object creation
		tictactoeboard.creatBoard(); // method call
		tictactoeboard.chooseLetter();//method call
	}
}
