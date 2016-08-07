//working with Janna, Abbie, and Tracy

package Week3Day4;

import java.util.ArrayList;
import java.util.Scanner;


public class labNumberTen {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		String movieChoice = "yes";
		String choice = "yes";

		System.out.println("Welcome to the Movie List Application!");
		System.out.println();

		while (choice.equalsIgnoreCase("yes")) {
			System.out.println("There are 10 movies on this list.");
			System.out
					.println("There are four categories: animated, drama, horror, and scifi");
			System.out.println("What category are you interested in?");
			System.out.println();
			
			if(choice.equalsIgnoreCase("yes")){
			
			movieChoice = scan1.nextLine();

			ArrayList<movies> list = new ArrayList();

			list.add(new movies("Twilight", "scifi"));
			list.add(new movies("Tweek", "scifi"));
			list.add(new movies("Star Trak", "scifi"));
			list.add(new movies("The Notebook", "drama"));
			list.add(new movies("Titanic", "drama"));
			list.add(new movies("Scream", "horror"));
			list.add(new movies("Friday 13", "horror"));
			list.add(new movies("Tangled", "animated"));
			list.add(new movies("Frozen", "animated"));
			list.add(new movies("Lion King", "animated"));

			for (int i = 0; i < list.size(); i++) {
				if (movieChoice.equalsIgnoreCase(list.get(i).getMovieGenre())) {
					System.out.println(list.get(i).getMovieTitle(null));

				}

			}
			
			if (!movieChoice.equalsIgnoreCase("horror") && !movieChoice.equalsIgnoreCase("animated")
					&& !movieChoice.equalsIgnoreCase("comedy")
                    && !movieChoice.equalsIgnoreCase("scifi")) {
                System.out.println("This is not a valid category, please select horror, comedy, scifi");
            }
			
			
			System.out.println("Would you like to continue? (yes or no)");

			choice = scan1.nextLine();
			//
			}
			
			else if(choice.equalsIgnoreCase("no")){
				System.out.println("Goodbye)");
				
			}
			
			else{System.out.println("Invalid Entry. Would you like to continue? (yes or no");
				
				
			}	continue;
				
				
		} // end of while loop
		
		System.out.println("Goodbye");

	} // end of main
}// end of class
