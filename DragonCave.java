package thirdversion;

import java.util.Random;
import java.util.Scanner;

public class DragonCave {
	public static int row, col;
	public static int gold = 1, arrow = 1, dragon = 1;
	public static String userInput, direction;
	public static int start_row, start_col, current_row, current_col, next_row, next_col, previous_row, previous_col;

	// make 2d array of strings
	public static String[][] B = new String[4][4];

	public static void main(String[] args) {
		row = 0;
		while (row < 4) {
			col = 0;
			while (col < 4) {
				B[row][col] = ". ";
				col++;
			}
			row++;
		}

		// Change 1 box to R
		B[1][0] = ".P";
		B[1][1] = ".P";
		B[1][2] = ".P";
		B[0][0] = ".E";
		B[0][1] = ".D";
		B[3][3] = ".G";

		// swap box 1,1 with another box
		Random rgen = new Random();
		int random_row = rgen.nextInt(4);
		int random_col = rgen.nextInt(4);
		String temp = B[1][1]; // X
		B[1][1] = B[random_row][random_col]; // [0-4,0-4]
		B[random_row][random_col] = temp; // assigned X to [0-4,0-4]

		// swap box 1,0 with another box
		Random rgen1 = new Random();
		int random_row1 = rgen1.nextInt(4);
		int random_col1 = rgen1.nextInt(4);
		String temp1 = B[1][0]; // X
		B[1][0] = B[random_row1][random_col1]; // [0-4,0-4]
		B[random_row1][random_col1] = temp1; // assigned X to [0-4,0-4]

		// swap box 1,2 with another box
		Random rgen2 = new Random();
		int random_row2 = rgen2.nextInt(4);
		int random_col2 = rgen2.nextInt(4);
		String temp2 = B[1][2]; // X
		B[1][2] = B[random_row2][random_col2]; // [0-4,0-4]
		B[random_row2][random_col2] = temp2; // assigned X to [0-4,0-4]

		// swap box 0,0 with another box
		Random rgen0 = new Random();
		int random_row0 = rgen.nextInt(4);
		int random_col0 = rgen.nextInt(4);
		String temp0 = B[0][0]; // X
		B[0][0] = B[random_row0][random_col0]; // [0-4,0-4]
		B[random_row0][random_col0] = temp0; // assigned X to [0-4,0-4]

		// swap box 0,1 with another box
		Random rgen3 = new Random();
		int random_row3 = rgen3.nextInt(4);
		int random_col3 = rgen3.nextInt(4);
		String temp3 = B[0][1]; // X
		B[0][1] = B[random_row3][random_col3]; // [0-4,0-4]
		B[random_row3][random_col3] = temp3; // assigned X to [0-4,0-4]

		// swap box 3,3 with another box
		Random rgen4 = new Random();
		int random_row4 = rgen4.nextInt(4);
		int random_col4 = rgen4.nextInt(4);
		String temp4 = B[3][3]; // X
		B[3][3] = B[random_row4][random_col4]; // [0-4,0-4]
		B[random_row4][random_col4] = temp4; // assigned X to [0-4,0-4]

		direction = "EAST";

		System.out.println("Welcome to Dragon Cave!\nTry to find the gold and return here to climb back out.");
		System.out.println("You have 1 arrow that you can shoot.\nTry the following commands.");
		System.out.println("Move (F)orward, Turn (L)eft, Turn (R)ight,");
		System.out.println("(G)rab the gold, (S)hoot the arrow, (C)limb out,");
		System.out.println("(Q)uit the game, Use (X) to cheat.");

		/*-------------------------Builds an array[, ] and initialize the entrance ----------------------------*/
		row = 0;
		while (row < 4) {
			col = 0;
			while (col < 4) {
				col++;
			}
			row++;
		}
		int ia = 0;
		int j = 0;
		row = 0;
		while (row < 4) {
			col = 0;
			while (col < 4) {
				if (B[row][col].equals(".E")) {
					B[row][col] = ". ";
					while (ia < 1) {
						start_row = row;
						start_col = col;
						current_row = row;
						current_col = col;
						ia++;
					}
				}
				col++;
			}
			row++;
		}

		/*-----------------------While user is already in the cave--------------------------*/
		int i = 0;
		while (i < 100) {
			// Initialize your starting position

			/*------- Get user input --------------*/
			Scanner input = new Scanner(System.in);
			System.out.println("\nYou are facing " + direction);
			System.out.print("Enter Command: ");
			userInput = input.next();

			/*
			 * When user enter C to climb out & win or just to escape the cave
			 * without completion of tasks
			 */
			if (userInput.equalsIgnoreCase("C") && current_row == start_row && current_col == start_col && dragon == 0
					&& gold == 0) {
				System.out.println("You escape the!!!");
				System.out.println("!!!!! You Win !!!!!");
				i = 101;
			} else if (userInput.equalsIgnoreCase("C") && current_row == start_row && current_col == start_col
					&& dragon == 1 && gold == 1) {
				System.out.println("You escape the cave!!!");
				System.out.println("But you still need to kill the dragon and grab the gold!");
			} else if (userInput.equalsIgnoreCase("C") && current_row == start_row && current_col == start_col
					&& dragon == 1 && gold == 0) {
				System.out.println("You still need to kill the dragon!");
			} else if (userInput.equalsIgnoreCase("C") && current_row == start_row && current_col == start_col
					&& dragon == 0 && gold == 1) {
				System.out.println("You still need to grab the gold!");
			} else if ((userInput.equalsIgnoreCase("C") && current_row != start_row && current_col != start_col
					&& dragon == 0 && gold == 0)
					|| (userInput.equalsIgnoreCase("C") && current_row != start_row && current_col != start_col
							&& dragon == 1 && gold == 1)) {
				System.out.println("Nothing happens.");
			}

			/* When user enter X to Cheat */
			if (userInput.equalsIgnoreCase("X")) {
				// Print Array
				pressX("X");
				currentIndex();
				dragonOrPit();
			}
			/* When user enter S to shoot the dragon */
			if (userInput.equalsIgnoreCase("S")) {
				shootDragon();
			}
			
			if(userInput.equalsIgnoreCase("Q")){
				System.out.println("You quit! See you soon!");
				i = 101;				
			}

			/* When user enter R or L to turn right or left, respectively */
			if (userInput.equalsIgnoreCase("R") || userInput.equalsIgnoreCase("L")) {
				if (userInput.equalsIgnoreCase("R")) {
					userDirection("R");
				} else {
					userDirection("L");
				}
			}

			/* When user enter G to get the gold */
			if (userInput.equalsIgnoreCase("G")) {
				getGold();
				dragonOrPit();
			}

			/* When user enter F and direction is East */
			if (userInput.equalsIgnoreCase("F") && direction.equals("EAST")) {
				current_col++;
				if (current_col > 3) {
					current_col = current_col - 1;
					System.out.println(
							"You bumped into the wall.\nYou're into the same room. Please change your direction.");
					dragonOrPit();

				} else if (B[current_row][current_col].equals(".P")) {

					System.out.println("You fall into a pit!!!");
					System.out.println("You Die !!!");
					i = 101;
				} else if (B[current_row][current_col].equals(".D")) {
					System.out.println("The dragon eats you!!!");
					System.out.println("You Die !!!");
					i = 101;
				} else if (B[current_row][current_col].equals(". ")) {
					System.out.println("You walk into the next room.");
					dragonOrPit();
				} else if (B[current_row][current_col].equals(".G")) {
					System.out.println("You walk into the next room.");
					containsGold();
					dragonOrPit();
				}

			}

			/* When user enter F and direction is West */
			if (userInput.equalsIgnoreCase("F") && direction.equals("WEST")) {
				current_col--;
				if (current_col < 0) {
					current_col = current_col + 1;
					System.out.println(
							"You bumped into the wall.\nYou're into the same room. Please change your direction.");
					dragonOrPit();

				} else if (B[current_row][current_col].equals(".P")) {

					System.out.println("You fall into a pit!!!");
					System.out.println("You Die !!!");
					i = 101;
				} else if (B[current_row][current_col].equals(".D")) {
					System.out.println("The dragon eats you!!!");
					System.out.println("You Die !!!");
					i = 101;
				} else if (B[current_row][current_col].equals(". ")) {
					System.out.println("You walk into the next room.");
					dragonOrPit();
				} else if (B[current_row][current_col].equals(".G")) {
					System.out.println("You walk into the next room.");
					containsGold();
					dragonOrPit();
				}
			}

			/* When user enter F and direction is South */
			if (userInput.equalsIgnoreCase("F") && direction.equals("SOUTH")) {
				current_row++;
				if (current_row > 3) {
					current_row = current_row - 1;
					System.out.println(
							"You bumped into the wall.\nYou're into the same room. Please change your direction.");
					dragonOrPit();

				} else if (B[current_row][current_col].equals(".P")) {

					System.out.println("You fall into a pit!!!");
					System.out.println("You Die !!!");
					i = 101;
				} else if (B[current_row][current_col].equals(".D")) {
					System.out.println("The dragon eats you!!!");
					System.out.println("You Die !!!");
					i = 101;
				} else if (B[current_row][current_col].equals(". ")) {
					System.out.println("You walk into the next room.");
					dragonOrPit();
				} else if (B[current_row][current_col].equals(".G")) {
					System.out.println("You walk into the next room.");
					containsGold();
					dragonOrPit();
				}
			}

			/* When user enter F and direction is North */
			if (userInput.equalsIgnoreCase("F") && direction.equals("NORTH")) {
				current_row--;
				if (current_row < 0) {
					current_row = current_row + 1;
					System.out.println(
							"You bumped into the wall.\nYou're into the same room. Please change your direction.");
					dragonOrPit();

				} else if (B[current_row][current_col].equals(".P")) {
					System.out.println("You fall into a pit!!!");
					System.out.println("You Die !!!");
					i = 101;
				} else if (B[current_row][current_col].equals(".D")) {
					System.out.println("The dragon eats you!!!");
					System.out.println("You Die !!!");
					i = 101;
				} else if (B[current_row][current_col].equals(". ")) {
					System.out.println("You walk into the next room.");
					dragonOrPit();
				} else if (B[current_row][current_col].equals(".G")) {
					System.out.println("You walk into the next room.");
					containsGold();
					dragonOrPit();
				}
			}

		}
	}

	/*--------------Press X Method----------------*/
	public static void pressX(String userInput) {
		row = 0;
		while (row < 4) {
			col = 0;
			while (col < 4) {
				System.out.print(B[row][col] + " ");
				col++;
			}
			System.out.println();
			row++;
		}
	}

	// Determines if there is any pit of dragon in adjacent rooms (not diagonal)
	public static void dragonOrPit() {
		next_row = current_row + 1;
		next_col = current_col + 1;
		previous_row = current_row - 1;
		previous_col = current_col - 1;
		if (next_col > 3) {
			next_col--;
		}
		if (next_row > 3) {
			next_row--;
		}
		if (previous_col < 0) {
			previous_col++;
		}
		if (previous_row < 0) {
			previous_row++;
		}
		if ((B[next_row][current_col].equals(".D") || B[current_row][next_col].equals(".D")
				|| B[previous_row][current_col].equals(".D") || B[current_row][previous_col].equals(".D"))
				&& (B[next_row][current_col].equals(".P") || B[current_row][next_col].equals(".P")
						|| B[previous_row][current_col].equals(".P") || B[current_row][previous_col].equals(".P"))) {
			System.out.println("A damp breeze is in the air!");
			System.out.println("A foul stench is in the air!");
		} else if (B[next_row][current_col].equals(".P") || B[current_row][next_col].equals(".P")
				|| B[previous_row][current_col].equals(".P") || B[current_row][previous_col].equals(".P")) {
			System.out.println("A damp breeze is in the air!");
		} else if (B[next_row][current_col].equals(".D") || B[current_row][next_col].equals(".D")
				|| B[previous_row][current_col].equals(".D") || B[current_row][previous_col].equals(".D")) {
			System.out.println("A foul stench is in the air!");
		}
	}

	/* Changes Direction when user presses R or L */
	public static void userDirection(String userInput) {
		// Codes when the user enters R as input
		if (userInput.equalsIgnoreCase("R") && direction.equals("EAST")) {
			direction = "SOUTH";
			dragonOrPit();
		} else if (userInput.equalsIgnoreCase("R") && direction.equals("SOUTH")) {
			direction = "WEST";
			dragonOrPit();
		} else if (userInput.equalsIgnoreCase("R") && direction.equals("WEST")) {
			direction = "NORTH";
			dragonOrPit();
		} else if (userInput.equalsIgnoreCase("R") && direction.equals("NORTH")) {
			direction = "EAST";
			dragonOrPit();
		}

		// Codes when the user enters L as input
		if (userInput.equalsIgnoreCase("L") && direction.equals("EAST")) {
			direction = "NORTH";
			dragonOrPit();
		} else if (userInput.equalsIgnoreCase("L") && direction.equals("SOUTH")) {
			direction = "EAST";
			dragonOrPit();
		} else if (userInput.equalsIgnoreCase("L") && direction.equals("WEST")) {
			direction = "SOUTH";
			dragonOrPit();
		} else if (userInput.equalsIgnoreCase("L") && direction.equals("NORTH")) {
			direction = "WEST";
			dragonOrPit();
		}
	}

	/* Method to get the gold */
	public static void getGold() {
		if (gold == 1 && B[current_row][current_col].equals(".G") && userInput.equalsIgnoreCase("G")) {
			System.out.println("You got the gold !!!");
			gold = 0;
			B[current_row][current_col] = ". ";
		} else if (gold == 0) {
			System.out.println("You already have the Gold!!!");
		}
	}

	// checks if room contains gold
	public static boolean containsGold() {
		if (!B[current_row][current_col].equals(".G")) {
			return false;
		}
		System.out.println("The room is glittering!");
		return true;
	}

	// Get Current Index
	public static void currentIndex() {
		System.out.println("CHEAT: You are in: (" + current_row + "," + current_col + ")");
	}

	// Shoots the dragon if still alive
	public static void shootDragon() {
		if (arrow == 1 && dragon == 1 && direction.equals("EAST") && userInput.equalsIgnoreCase("S")
				&& (B[current_row][1].equals(".D") || B[current_row][2].equals(".D")
						|| B[current_row][3].equals(".D"))) {
			System.out.println("You hear a giant roar in the distance!!!");
			arrow = 0;
			dragon = 0;
			swapDragon();
		} else if (arrow == 1 && dragon == 1 && direction.equals("WEST") && userInput.equalsIgnoreCase("S")
				&& (B[current_row][0].equals(".D") || B[current_row][1].equals(".D")
						|| B[current_row][2].equals(".D"))) {
			System.out.println("You hear a giant roar in the distance!!!");
			arrow = 0;
			dragon = 0;
			swapDragon();
		} else if (arrow == 1 && dragon == 1 && direction.equals("SOUTH") && userInput.equalsIgnoreCase("S")
				&& (B[1][current_col].equals(".D") || B[2][current_col].equals(".D")
						|| B[3][current_col].equals(".D"))) {
			System.out.println("You hear a giant roar in the distance!!!");
			arrow = 0;
			dragon = 0;
			swapDragon();
		} else if (arrow == 1 && dragon == 1 && direction.equals("NORTH") && userInput.equalsIgnoreCase("S")
				&& (B[0][current_col].equals(".D") || B[1][current_col].equals(".D")
						|| B[2][current_col].equals(".D"))) {
			System.out.println("You hear a giant roar in the distance!!!");
			arrow = 0;
			dragon = 0;
			swapDragon();
		} else if (arrow == 0 && dragon == 1 && userInput.equalsIgnoreCase("S")) {
			System.out.println("You don't have any arrow left!\n");
		}
		else if (arrow == 1 && userInput.equalsIgnoreCase("S")
				&& !(B[0][current_col].equals(".D") || B[1][current_col].equals(".D") || B[2][current_col].equals(".D")
						|| B[1][current_col].equals(".D") || B[2][current_col].equals(".D")
						|| B[3][current_col].equals(".D") || B[current_row][0].equals(".D")
						|| B[current_row][1].equals(".D") || B[current_row][2].equals(".D")
						|| B[current_row][1].equals(".D") || B[current_row][2].equals(".D")
						|| B[current_row][3].equals(".D"))) {
			System.out.println("You hear a thud in the distance.");
			arrow = 0;
		} else if (dragon == 0 && userInput.equalsIgnoreCase("S")) {
			System.out.println("You already killed dragon!!\n");
		}
	}

	// empties the room after killing the dragon
	public static void swapDragon() {
		for (int k = 0; k < 4; k++) {
			for (int s = 0; s < 4; s++) {
				if (B[k][s].equals(".D")) {
					B[k][s] = ". ";
				}
			}
		}
	}

}