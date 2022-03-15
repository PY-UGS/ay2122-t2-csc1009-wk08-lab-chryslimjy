package lab8;

import java.util.Scanner;

public class CircleWithException {
	private double radius;
	private double area;
	private double diameter;
	final static double PI = 3.1415;
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	

	public double getArea() {
		area = PI * radius * radius;
		return area;
	}

	public double getDiameter() {
		diameter = 2 * PI * radius;
		return diameter;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double rad = 0;
		CircleWithException circle = new CircleWithException();

		try {
			
			System.out.println("Enter radius value: ");
			rad = scanner.nextDouble();
			circle.setRadius(rad);
			double check = circle.getRadius();
			double checkArea = circle.getArea();
			//System.out.println("Checking check value " + check);
			
			if(check < 0) {
				throw new IllegalArgumentException();
			}
			if(checkArea >1000) {
				throw new Exception();
			}
			
			System.out.println("Area is : " + circle.getArea());
			System.out.println("Diameter is : " + circle.getDiameter());
		
			
		} catch (IllegalArgumentException e) {
		System.out.println("Please enter a positive value");

		} catch (Exception e) {
			System.out.println("Area too large");
		} 

	}
}
