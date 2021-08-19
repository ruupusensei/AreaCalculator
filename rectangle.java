import java.util.*;

public class rectangle {
	Scanner input = new Scanner(System.in);
	
	public double getLength() {
		double length;
		
		System.out.println("Please enter the length dimension.");
		while (!input.hasNextDouble()) {
			System.out.println("Invalid input, please enter a number.");
			input.next();
		}
		length = input.nextDouble();
		return length; 
	}
	
	public double getWidth() {
		double width;
		
		System.out.println("Please enter the width dimension.");
		while (!input.hasNextDouble()) {
			System.out.println("Invalid input, please enter a number.");
			input.next();
		}
		width = input.nextDouble();
		return width; 

	}

	public double calcArea(double length, double width) {
	
		double area;
		area = length * width; 
		return area; 
}

	public void displayInfo(double length1, double width1, double area1, double length2, double width2, double area2) {
		
		System.out.println("Rectangle 1 has length = " + length1 + ", width = " + width1 + ", and area = " + area1);
		System.out.println("Rectangle 2 has length = " + length2 + ", width = " + width2 + ", and area = " + area2);
	}
	
	public void compareArea(double area1, double area2) {
		
		if (area1 < area2) {
			System.out.println("Rectangle 1 has lesser area than Rectangle 2.");
		} else if (area1 > area2) {
			System.out.println("Rectangle 1 has greater area than Rectangle 2.");
		} else {
			System.out.println("The areas of the rectanlges are equal.");
		}
	}
	
	public void compareDimensions (double length1, double length2, double width1, double width2) {
		
		if (length1 == length2 || width1 == width2 || length1 == width1 || length2 == width2 || length1 == width2 || length2 == width1) {
			System.out.println("The rectangles share some common dimensions.");
		} else {
			System.out.println("The rectangles share no common dimensions.");
		}
		
	}
	
	
	}