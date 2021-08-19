import java.util.*;

public class menu {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		rectangle rectangle = new rectangle();
		square square = new square();
		triangle triangle = new triangle();
		circle circle = new circle();
		
		boolean playAgain = true;
		
		while (playAgain == true) {
			System.out.println("Welcome to the simple shape comparison simulator.");
			
			System.out.println("Please select a shape to explore by entering the corresponding number.");
			System.out.println("1. Rectangle");
			System.out.println("2. Square");
			System.out.println("3. Triangle");
			System.out.println("4. Circle");
			
			String selection = null;
		    while(selection == null) {
		        String unvalidatedString = input.next();
		        if (unvalidatedString.equalsIgnoreCase("1")) {
		            selection = unvalidatedString;
		        }
		        if (unvalidatedString.equalsIgnoreCase("2")) {
		            selection = unvalidatedString;
		        }
		        if (unvalidatedString.equalsIgnoreCase("3")) {
		            selection = unvalidatedString;
		        }
		        if (unvalidatedString.equalsIgnoreCase("4")) {
		            selection = unvalidatedString;
		        } 
		        if (selection == null) {
		        	System.out.println("Invalid input, please enter 1, 2, 3, or 4."); 
		        }
		    }
		    
		    int currentShape = Integer.parseInt(selection);
			
				System.out.println("\nThank you for your selection.");
		
				switch (currentShape) {
				
				case 1:
					
					System.out.println("Let's define our first rectangle.");
					double length1 = rectangle.getLength();
					double width1 = rectangle.getWidth();
					double rArea1 = rectangle.calcArea(length1, width1);
					System.out.println("Now let's define the second rectangle.");
					double length2 = rectangle.getLength();
					double width2 = rectangle.getWidth();
					double rArea2 = rectangle.calcArea(length2, width2);
					rectangle.displayInfo(length1, width1, rArea1, length2, width2, rArea2);
					rectangle.compareArea(rArea1, rArea2);
					rectangle.compareDimensions(length1, length2, width1, width2); 
					break;
			
				case 2:
					
					System.out.println("Let's define our first square.");
					double side1 = square.getSide();
					double sArea1 = square.calcArea(side1);
					System.out.println("Now let's define the second square.");
					double side2 = square.getSide();
					double sArea2 = square.calcArea(side2);
					square.displayInfo(side1, sArea1, side2, sArea2);
					square.compareArea(sArea1, sArea2);
					square.compareDimensions(side1, sArea2); 
					break;
			
				case 3:
					
					System.out.println("Let's define our first triangle.");
					double base1 = triangle.getBase();
					double height1 = triangle.getHeight();
					double tArea1 = triangle.calcArea(base1, height1);
					System.out.println("Now let's define the second triangle.");
					double base2 = triangle.getBase();
					double height2 = triangle.getHeight();
					double tArea2 = triangle.calcArea(base2, height2);
					triangle.displayInfo(base1, height1, tArea1, base2, height2, tArea2);
					triangle.compareArea(tArea1, tArea2);
					triangle.compareDimensions(base1, height1, base2, height2); 
					break;
		
				case 4:
					
					System.out.println("Let's define our first circle.");
					double radius1 = circle.getRadius();
					double cArea1 = circle.calcArea(radius1);
					System.out.println("Now let's define the second circle.");
					double radius2 = circle.getRadius();
					double cArea2 = circle.calcArea(radius2);
					circle.displayInfo(radius1, cArea1, radius2, cArea2);
					circle.compareArea(cArea1, cArea2);
					circle.compareDimensions(radius1, radius2); 
					
					break; 					
				} 
				System.out.println("Would you like to do another comparison? (Y/N)");
				String cont = null;
			    while(cont == null) {
			        String unvalidatedString = input.next();
			        if (unvalidatedString.equalsIgnoreCase("y")) {
			            cont = unvalidatedString;
			            playAgain = true;
			            
			        }
			        if (unvalidatedString.equalsIgnoreCase("n")) {
			            cont = unvalidatedString;
			            System.out.println("Thank you, see you next time!");
			            playAgain = false;
			            break;
			        }
			        System.out.println("Invalid input, please enter (Y/N)");
			    }
		}
	}	
}