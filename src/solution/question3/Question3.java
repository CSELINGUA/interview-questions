package solution.question3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question3 {
	private static String shape;
	private static Util util;
	public static void main(String args[]){

		System.out.println("Menu-");
		System.out.print("Enter your choice \t");
		shape = readString();

		switch (shape){
			case Constants.CIRCLE ->
					{
						System.out.print("Enter the radius \t");
						double radius = readDouble();
						util = new Util(radius, Shapes.CIRCLE);
						System.out.println("Area of Circle is \t" + util.area());
						System.out.println("Perimeter of Circle is \t" + util.perimeter());
					}
				case Constants.RECTANGLE ->
					{
						System.out.print("Enter the length \t");
						double length = readDouble();
						System.out.print("Enter the width \t");
						double width = readDouble();
						util = new Util(length, width, Shapes.RECTANGLE);
						System.out.println("Area of Rectangle is \t" + util.area());
						System.out.println("Perimeter of Rectangle is \t" + util.perimeter());
					}
			case Constants.SQUARE ->
					{
						System.out.print("Enter the side \t");
						double side = readDouble();
						util = new Util(side, Shapes.SQUARE);
						System.out.println("Area of Square is \t" + util.area());
						System.out.println("Perimeter of Square is \t" + util.perimeter());
					}
			default -> {
				System.out.println("This is not a recognized shape. Allowed shapes are: Circle, Square, Rectangle");
			}
		}
	}

	public static Double readDouble(){
		double number;
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			number = Double.parseDouble(br.readLine());
		}
		catch (Exception e){
			throw new RuntimeException("Check the entry");
		}
		return number;
	}

	public static String readString(){
		String string;
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			string = String.valueOf(br.readLine()).trim().toUpperCase();
		}
		catch (Exception e){
			throw new RuntimeException("Check the entry");
		}
		return string;
	}
}
