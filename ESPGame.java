/*Class: CMSC 203
 * Instructor: Ahmed Tarek
 * Description: Create a program (game) that tests ESP (Extra Sensory Perception 
 * Skills). The user is to guess a color from the list provided and the computer should display the
 * randomly selected color. This shall repeat 11 times. At the end of the game, the computer will 
 * display the amount of times the user correctly guessed the color. 
 * Due: 02/06/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: _Niharika __Kalkeri_______
*/

import java.util.Random;
import java.util.Scanner;

public class ESPGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String COLOR_RED= "Red";
		String COLOR_GREEN = "Green";
		String COLOR_BLUE = "Blue";
		String COLOR_YELLOW = "Yellow";
		String COLOR_ORANGE = "Orange";
		String COLOR_PURPLE = "Purple";
		String COLOR_INDIGO = "Indigo";
		
		String colorName = null;
		
		System.out.print("Enter your name: \n");
		String name = input.nextLine();
		
		System.out.println("Describe yourself: \n");
		
		String describe = input.nextLine();
		
		
		
		
		System.out.println("Due Date: \n");
		String dueDate = input.nextLine();
		
		System.out.println("CMSC203 Assignment1: Test your ESP skills!");
		
		Random number = new Random();
		
		int userScore = 0;
		
		
		
		for(int counter = 1; counter <= 11; counter++) {
			
			int randomNumber = number.nextInt(1,7);
		
			
			switch(randomNumber ) {
				
			case 1: 
				colorName = COLOR_RED;
				break;
			
			case 2:
				colorName = COLOR_BLUE;
				break;
			
			case 3: colorName = COLOR_GREEN;
					break;
			
			case 4: colorName = COLOR_YELLOW;
					break;
					
			case 5: colorName = COLOR_INDIGO;
					break;
					
			case 6: colorName = COLOR_PURPLE;
					break;
					
			case 7: colorName = COLOR_ORANGE;
					break;
			default: 
				colorName = null;
			}
			
			
			System.out.println("Round " + counter);
			
			System.out.println();
			System.out.println();
			
			System.out.println("I am thinking of a color: ");
			System.out.println("Is it Red, Green, Blue, Orange, Purple, Indigo, or Yellow?");
			System.out.println("Enter your guess: ");
			
		
			String userGuess = input.next();
			
			
			if(userGuess.equalsIgnoreCase(colorName)) {
				System.out.println("I was thinking of " + colorName);
				System.out.println();
				
				userScore++;
			}
			else {
				System.out.println();
				System.out.println("I was thinking of " + colorName);
				System.out.println();
				
			}
		}
		System.out.println("Game over");
		System.out.println();
		System.out.println();
		System.out.println("You guessed " + userScore + " out of 11 colors correctly.");
		System.out.println("Student Name: " + name);
		System.out.println("User Description: " + describe);
		System.out.println("Due Date: " + dueDate);
		
		
	}

}
