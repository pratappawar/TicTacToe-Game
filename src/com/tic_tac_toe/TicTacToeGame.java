package com.tic_tac_toe;

import java.util.Scanner;

public class TicTacToeGame {
	public String playerChoice;
	public String computerChoice;
	Scanner scan = new Scanner(System.in);
	char board[] = new char[10];

	// Creating Empty Board method
	public char[] creatBoard() {
		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;
	}

	// Show method is Created to Show the current board
	public void showBoard() {
		System.out.println(board[1] + "|" + board[2] + "|" + board[3]);
		System.out.println("-+-+-");
		System.out.println(board[4] + "|" + board[5] + "|" + board[6]);
		System.out.println("-+-+-");
		System.out.println(board[7] + "|" + board[8] + "|" + board[9]);
	}

	// choose letter user and computer choice
	public String chooseLetter() {
		// taking user input
		System.out.println("Enter the letter X-O:");
		String inputLetter = scan.next();
		if (inputLetter.equals("X")) {
			playerChoice = "X";
			computerChoice = "O";
		} else if (inputLetter.equals("O")) {
			playerChoice = "O";
			computerChoice = "X";
		} else
			System.out.println("Invalid symbol...."); // invalid Symbol
		return playerChoice;
	}

	// Ability for user to make a move to a desired location in the board
	public void playerMove() {
		System.out.println("Where do you Want to play (1-8):");
		int positionSelector = scan.nextInt();
		switch (positionSelector) {
		case 1:
			board[1] = 'X';
			break;
		case 2:
			board[2] = 'X';
			break;
		case 3:
			board[3] = 'X';
			break;
		case 4:
			board[4] = 'X';
			break;
		case 5:
			board[5] = 'X';
			break;
		case 6:
			board[6] = 'X';
			break;
		case 7:
			board[7] = 'X';
			break;
		case 8:
			board[8] = 'X';
			break;
		case 9:
			board[9] = 'X';
			break;
		default:
			System.out.println("invalid choice");
		}
		showBoard();
	}

	public static void main(String[] args) {
		System.out.println("welcome to TicTacToe!!"); // Welcome message
		TicTacToeGame tictactoeboard = new TicTacToeGame(); // object creation
		tictactoeboard.creatBoard(); // method call
		tictactoeboard.chooseLetter(); // method call
		tictactoeboard.showBoard(); // method call
		tictactoeboard.playerMove(); // method call
	}

}
