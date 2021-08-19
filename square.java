import java.util.*;

public class square {
Scanner input = new Scanner(System.in);
	
	public double getSide() {
		double side;
		
		System.out.println("Please enter the length of the square's side.");
		while (!input.hasNextDouble()) {
			System.out.println("Invalid input, please enter a number.");
			input.next();
		}
		side = input.nextDouble();
		return side; 
	}
	
	public double calcArea(double side) {
	
		double area;
		area = side * side; 
		return area; 
}

	public void displayInfo(double side1, double area1, double side2, double area2) {
		
		System.out.println("Square 1 has side length = " + side1 + ", and area = " + area1);
		System.out.println("Square 2 has side length = " + side2 + ", and area = " + area2);
	}
	
	public void compareArea(double area1, double area2) {
		
		if (area1 < area2) {
			System.out.println("Square 1 has lesser area than Square 2.");
		} else if (area1 > area2) {
			System.out.println("Square 1 has greater area than Square 2.");
		} else {
			System.out.println("The areas of the squares are equal.");
		}
	}
	
	public void compareDimensions (double side1, double side2) {
		
		if (side1 == side2) {
				System.out.println("The squares have equal side length.");
		} else {
			System.out.println("The squares do not have a common dimension.");
		}
		
	}
	
	
	}
	
