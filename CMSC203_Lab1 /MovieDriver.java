package movie;

import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (true) {
			
			
			System.out.println("Enter a movie name: ");
			String title = input.nextLine();

			System.out.println("Enter the movie's rating");
			String rating = input.nextLine();

			System.out.println("Enter the number of tickets sold for this movie: ");
			int soldTickets = input.nextInt();
			
			

			Movie myMovie = new Movie();
			myMovie.setTitle(title);
			myMovie.setRating(rating);
			myMovie.setSoldTickets(soldTickets);
			System.out.println(myMovie.toString());
			

			System.out.println("Do you want to enter another? y or n?");
			System.out.println();
			String answer = input.next();
			
			if (answer.equalsIgnoreCase("y")) {
				
				continue;
				
			} else {
				
				System.out.println("Goodbye");	
				break;
						}
		}

	}
}