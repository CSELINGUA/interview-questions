package solution.question1;

public class Meal {
	private String name;
	private double proteinContentInMiligram;
	private double carbonHydrateContentInMiligram;
	private double fatContentInMiligram;

	//reference to the next node in the chain
	Meal next;


	private void add(){}

	private void remove(){}

	private void find(){}


	public Meal(String name, Double proteinContentInMiligram, Double carbonHydrateContentInMiligram,
			Double fatContentInMiligram) {
		next = null;
		this.name = name;
		this.proteinContentInMiligram = proteinContentInMiligram;
		this.carbonHydrateContentInMiligram = carbonHydrateContentInMiligram;
		this.fatContentInMiligram = fatContentInMiligram;
	}

	public Meal(String name, Double proteinContentInMiligram, Double carbonHydrateContentInMiligram,
			Double fatContentInMiligram, Meal nextValue) {
		next = nextValue;
		this.name = name;
		this.proteinContentInMiligram = proteinContentInMiligram;
		this.carbonHydrateContentInMiligram = carbonHydrateContentInMiligram;
		this.fatContentInMiligram = fatContentInMiligram;
	}

	// these methods should be self-explanatory

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getProteinContentInMiligram() {
		return proteinContentInMiligram;
	}

	public void setProteinContentInMiligram(Double proteinContentInMiligram) {
		this.proteinContentInMiligram = proteinContentInMiligram;
	}

	public Double getCarbonHydrateContentInMiligram() {
		return carbonHydrateContentInMiligram;
	}

	public void setCarbonHydrateContentInMiligram(Double carbonHydrateContentInMiligram) {
		this.carbonHydrateContentInMiligram = carbonHydrateContentInMiligram;
	}

	public Double getFatContentInMiligram() {
		return fatContentInMiligram;
	}

	public void setFatContentInMiligram(Double fatContentInMiligram) {
		this.fatContentInMiligram = fatContentInMiligram;
	}

	public Meal getNext() {
		return next;
	}

	public void setNext(Meal nextValue) {
		next = nextValue;
	}

	@Override
	public String toString() {
		return "Meal{" +
				"name='" + name + '\'' +
				", proteinContentInMiligram=" + proteinContentInMiligram +
				", carbonHydrateContentInMiligram=" + carbonHydrateContentInMiligram +
				", fatContentInMiligram=" + fatContentInMiligram +
				", next=" + next +
				'}';
	}
}
