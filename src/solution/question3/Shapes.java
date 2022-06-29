package solution.question3;

public enum Shapes {
	CIRCLE("CIRCLE"), RECTANGLE("RECTANGLE"), SQUARE("SQUARE");

	private String shape;

	Shapes(String shape){
		this.shape = shape;
	}
	public String getShape(){
		return this.shape;
	}
}
