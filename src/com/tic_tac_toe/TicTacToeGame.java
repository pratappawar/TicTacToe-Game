package com.tic_tac_toe;
import java.util.Scanner;

public class TicTacToeGame {
	public char playerChoice;
	public char computerChoice;
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
	public char chooseLetter() {
		// taking user input
		System.out.println("Enter the letter X-O:");
		String inputLetter = scan.next();
		if (inputLetter.equals("X")) {
			playerChoice = 'X';
			computerChoice = 'O';
		} else if (inputLetter.equals("O")) {
			playerChoice = 'O';
			computerChoice = 'X';
		} else
			System.out.println("Invalid symbol...."); // invalid Symbol
		return playerChoice;
	}

	// Ability for user to make a move to a desired location in the board
	public char[] playerMove() {
		System.out.println("Where do you Want to play (1-9):");
		int positionSelector = scan.nextInt();
		switch (positionSelector) {
		case 1:
			board[1] = playerChoice;
			break;
		case 2:
			board[2] = playerChoice;
			break;
		case 3:
			board[3] = playerChoice;
			break;
		case 4:
			board[4] = playerChoice;
			break;
		case 5:
			board[5] = playerChoice;
			break;
		case 6:
			board[6] = playerChoice;
			break;
		case 7:
			board[7] = playerChoice;
			break;
		case 8:
			board[8] = playerChoice;
			break;
		case 9:
			board[9] = playerChoice;
			break;
		default:
			System.out.println("invalid choice");
		}
		showBoard();
		return board;
		
	}
      //free space before making the desired move a move to a desired location in the board
	public void isFreeSpace(){
		System.out.println("Enter desired location ");
		int location = scan.nextInt();
		switch (location) {
		case 1:
			if (board[1] == ' ') {
				board[1] = playerChoice;
			} else {
				System.out.println("space is not free");
			}
			break;
		case 2:
			if (board[2] == ' ') {
				board[2] = playerChoice;
			} else {
				System.out.println("space is not free");
			}
			break;
		case 3:
			if (board[3] == ' ') {
				board[3] = playerChoice;
			} else {
				System.out.println("space is not free");
			}
			break;
		case 4:
			if (board[4] == ' ') {
				board[4] = playerChoice;
			} else {
				System.out.println("space is not free");
			}
			break;
		case 5:
			if (board[5] == ' ') {
				board[5] = playerChoice;
			} else {
				System.out.println("space is not free");
			}
			break;
		case 6:
			if (board[6] == ' ') {
				board[6] = playerChoice;
			} else {
				System.out.println("space is not free");
			}
			break;
		case 7:
			if (board[7] == ' ') {
				board[7] = playerChoice;
			} else {
				System.out.println("space is not free");
			}
			break;
		case 8:
			if (board[8] == ' ') {
				board[8] = playerChoice;
			} else {
				System.out.println("space is not free");
			}
			break;
		case 9:
			if (board[9] == ' ') {
				board[9] = playerChoice;
			} else {
				System.out.println("space is not free");
			}
		default:
			System.out.println("invalid position");
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("welcome to TicTacToe!!"); // Welcome message
		TicTacToeGame tictactoeboard = new TicTacToeGame(); // object creation
		tictactoeboard.creatBoard(); // method call
		tictactoeboard.chooseLetter(); // method call
		tictactoeboard.showBoard(); // method call
		tictactoeboard.playerMove(); // method call
		tictactoeboard.isFreeSpace();// method call
	}

}
