import java.util.*;

public class circle {
Scanner input = new Scanner(System.in);
final double pi = 3.1415962;
	public double getRadius() {
		double radius;
		
		System.out.println("Please enter the radius length of the circle.");
		while (!input.hasNextDouble()) {
			System.out.println("Invalid input, please enter a number.");
			input.next();
		}
		radius = input.nextDouble();
		return radius; 
	}
	
	public double calcArea(double radius) {
	
		double area;
		area = radius * radius * pi; 
		return area; 
}

	public void displayInfo(double radius1, double area1, double radius2, double area2) {
		
		System.out.println("Circle 1 has radius length = " + radius1 + ", and area = " + area1);
		System.out.println("Circle 2 has radius length = " + radius2 + ", and area = " + area2);
	}
	
	public void compareArea(double area1, double area2) {
		
		if (area1 < area2) {
			System.out.println("Circle 1 has lesser area than Circle 2.");
		} else if (area1 > area2) {
			System.out.println("Circle 1 has greater area than Circle 2.");
		} else {
			System.out.println("The areas of the circles are equal.");
		}
	}
	
	public void compareDimensions (double radius1, double radius2) {
		
		if (radius1 == radius2) {
				System.out.println("The circles have equal radii lengths.");
		} else {
			System.out.println("The circles have different radii lengths.");
		}
		
	}
	
}
