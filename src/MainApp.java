import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		/**
		 * Exercises 9 (page 559) + UML class diagram - Geometry Calculator
		 * 
		 * // Next, write a program called GeometryDemo to test the class, which
		 * displays the following menu and responds to the user’s selection: //
		 * Geometry Calculator //1. Calculate the Area of a Circle //2.
		 * Calculate the Area of a Rectangle //3. Calculate the Area of a
		 * Triangle //4. Quit //Enter your choice (1-4): //Display an error
		 * message if the user enters a number outside the range of 1 through 4
		 * when selecting an item from the menu. //Make sure to create a
		 * separate java file for each exercise.
		 * 
		 */
		// declare variables
		Scanner input = new Scanner(System.in);
		//Geometry gem = new Geometry();

		System.out.println(
				" Geometry Calculator \n1. Calculate the Area of a Circle \n2. Calculate the Area of a Rectangle"
						+ "\n3. Calculate the Area of a Triangle \n4. Quit \nEnter your choice (1-4): ");

		int choice = input.nextInt();
		
		
			switch (choice) {
			case 1:
				Geometry.circleArea();
				break;
			case 2:
				Geometry.rectangleArea();
				break;
			case 3:
				Geometry.triangleArea();
				break;
			case 4:
				System.out.println("You quit.  Bye");	
				break;
				default:
					System.out.println("Error!!!  Please enter in a number between 1 - 4.");
					break;
			}

		}

	}

