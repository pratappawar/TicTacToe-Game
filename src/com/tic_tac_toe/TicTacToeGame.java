package com.tic_tac_toe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
	private static char playerChoice;
	private static char computerChoice;
	private static boolean isPlayer;
	private static int indexCount = 0;
	static Scanner scan = new Scanner(System.in);
	static char board[] = new char[10];

	// Creating Empty Board method
	private char[] creatBoard() {
		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;
	}

	// Show method is Created to Show the current board
	private static void showBoard() {
		System.out.println(board[1] + "|" + board[2] + "|" + board[3]);
		System.out.println("-+-+-");
		System.out.println(board[4] + "|" + board[5] + "|" + board[6]);
		System.out.println("-+-+-");
		System.out.println(board[7] + "|" + board[8] + "|" + board[9]);
	}

	// choose letter user and computer choice
	private void chooseLetter() {
		// taking user input
		System.out.println("Enter the letter x-o:");
		char inputLetter = scan.next().charAt(0);
		if (inputLetter == 'x') {
			playerChoice = 'x';
			computerChoice = 'o';
		} else if (inputLetter == 'o') {
			playerChoice = 'o';
			computerChoice = 'x';
		} else
			System.out.println("Invalid symbol...."); // invalid Symbol
		// return playerChoice;
	}

	// Ability for user to make a move to a desired location in the board
	private static void makeMove() {
		if (indexCount == 9) {
			System.out.println("Player Reaches Max Turn count");
		} else {
			if (isPlayer) {
				System.out.println("Where do you Want to play (1-9):");
				int userPosition = scan.nextInt();
				if (board[userPosition] == ' ') {
					board[userPosition] = playerChoice;
					isPlayer = false;
					indexCount++;
				} else {
					System.out.println("This position is already occupied");
				}
			} else {
				Random rand = new Random();
				int computerPosition = rand.nextInt(9) + 1;
				if (board[computerPosition] == ' ') {
					board[computerPosition] = computerChoice;
					isPlayer = true;
					indexCount++;
				} else {
					System.out.println("This position is already occupied");
				}
			}
		}
	}

	// Flip coin to check Who play First
	private void checkToss() {
		int head = 1;
		Random rand = new Random();
		int toss = rand.nextInt(2);
		if (toss == head) {
			System.out.println("Player is playing!!!");
			isPlayer = true;
		} else {
			System.out.println("Computer is playing!!");
			isPlayer = false;
		}
	}

	private static void winOrTie() {
		if (board[1] == 'x' && board[2] == 'x' && board[3] == 'x'
				|| board[4] == 'x' && board[5] == 'x' && board[6] == 'x'
				|| board[7] == 'x' && board[8] == 'x' && board[9] == 'x'
				|| board[1] == 'x' && board[4] == 'x' && board[7] == 'x'
				|| board[2] == 'x' && board[5] == 'x' && board[8] == 'x'
				|| board[3] == 'x' && board[6] == 'x' && board[9] == 'x'
				|| board[1] == 'x' && board[5] == 'x' && board[9] == 'x'
				|| board[3] == 'x' && board[5] == 'x' && board[7] == 'x') {
			if (playerChoice == 'x') {
				System.out.println("Congrats you win the match!!!!!");
			} else {
				System.out.println("Computer wins the match!!!!!");
			}
		} else if (board[1] == 'o' && board[2] == 'o' && board[3] == 'o'
				|| board[4] == 'o' && board[5] == 'o' && board[6] == 'o'
				|| board[7] == 'o' && board[8] == 'o' && board[9] == 'o'
				|| board[1] == 'o' && board[4] == 'o' && board[7] == 'o'
				|| board[2] == 'o' && board[5] == 'o' && board[8] == 'o'
				|| board[3] == 'o' && board[6] == 'o' && board[9] == 'o'
				|| board[1] == 'o' && board[5] == 'o' && board[9] == 'o'
				|| board[3] == 'o' && board[5] == 'o' && board[7] == 'o') {
			if (playerChoice == 'o') {
				System.out.println("Congrats you win the match!!!!!!");
			} else {
				System.out.println("Computer wins the match!!!!!!");
			}
		} else if (indexCount == 9) {
			System.out.println("match is tie");
		}
	}

	public static void main(String[] args) {
		System.out.println("welcome to TicTacToe!!"); // Welcome message
		TicTacToeGame tictactoeboard = new TicTacToeGame(); // object creation
		tictactoeboard.creatBoard(); // method call
		tictactoeboard.chooseLetter(); // method call
		tictactoeboard.checkToss();
		while (indexCount < 9) {
			makeMove();
			showBoard();
			winOrTie();
			System.out.println("----------");
		}
	}
}
