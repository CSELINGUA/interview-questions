package solution.question3;

public class Util implements Shape{
	private double radius;
	private double length;
	private double width;
	private double side;
	private Shapes shape;

	private final double PI = 3.14;

	public Util(double measure, Shapes shape) {
		this.radius = measure;
		this.side = measure;
		this.shape = shape;
	}

	public Util(double length, double width, Shapes shape){
		this.length = length;
		this.width = width;
		this.shape = shape;
	}

	@Override
	public double area() {
		//case Circle
		switch (shape.getShape()){
			case Constants.CIRCLE ->
					{return PI *  this.radius * this.radius;}
			case Constants.RECTANGLE ->
					{return this.length * this.width;}
			case Constants.SQUARE ->
					{return this.side * this.side;}
			default ->
					{return 0.0;}
		}
	}

	@Override
	public double perimeter() {
		switch (shape.getShape()){
			case Constants.CIRCLE ->
					{return 2 * PI * this.radius;}
			case Constants.RECTANGLE ->
					{return 2 *  (this.length + this.width);}
			case Constants.SQUARE ->
					{return 4 * this.side;}
			default ->
					{return 0.0;}
		}
	}
}
