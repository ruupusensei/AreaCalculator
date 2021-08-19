import java.util.*;

public class triangle {
Scanner input = new Scanner(System.in);
	
	public double getBase() {
		double base;
		
		System.out.println("Please enter the triangle's base dimension.");
		while (!input.hasNextDouble()) {
			System.out.println("Invalid input, please enter a number.");
			input.next();
		}
		base = input.nextDouble();
		return base; 
	}
	
	public double getHeight() {
		double height;
		
		System.out.println("Please enter the triangle's height dimension.");
		while (!input.hasNextDouble()) {
			System.out.println("Invalid input, please enter a number.");
			input.next();
		}
		height = input.nextDouble();
		return height; 

	}

	public double calcArea(double base, double height) {
	
		double area;
		area = base * height * (0.5); 
		return area; 
}

	public void displayInfo(double base1, double height1, double area1, double base2, double height2, double area2) {
		
		System.out.println("Triagnle 1 has base = " + base1 + ", height = " + height1 + ", and area = " + area1);
		System.out.println("Triagnle 2 has base = " + base2 + ", height = " + height2 + ", and area = " + area2);
	}
	
	public void compareArea(double area1, double area2) {
		
		if (area1 < area2) {
			System.out.println("Triangle 1 has lesser area than Triangle 2.");
		} else if (area1 > area2) {
			System.out.println("Triangle 1 has greater area than Triangle 2.");
		} else {
			System.out.println("The areas of the triagnles are equal.");
		}
	}
	
	public void compareDimensions (double base1, double height1, double base2, double height2) {
		
		if (base1 == base2 && height1 == height2) {
			System.out.println("The trianlges have the same base dimension and height dimension.");
		} else if (base1 == base2) {
			System.out.println("The triangles have the same base dimension.");
		} else if (height1 == height2) {
			System.out.println("The triangles have the same height dimension.");
		} else {
			System.out.println("The triangles have no common dimensions.");
		}
		
	}
	
	
}
