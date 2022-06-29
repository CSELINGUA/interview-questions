package solution.question1_And_2;

public class Meal {
	private String name;
	private double proteinContentInMiligram;
	private double carbonHydrateContentInMiligram;
	private double fatContentInMiligram;

	//reference to the next node in the chain
	Meal next;

	public Meal(String name, double proteinContentInMiligram, double carbonHydrateContentInMiligram,
			double fatContentInMiligram) {
		next = null;
		this.name = name;
		this.proteinContentInMiligram = proteinContentInMiligram;
		this.carbonHydrateContentInMiligram = carbonHydrateContentInMiligram;
		this.fatContentInMiligram = fatContentInMiligram;
	}

/*	public Meal(String name, Double proteinContentInMiligram, Double carbonHydrateContentInMiligram,
			Double fatContentInMiligram, Meal nextValue) {
		next = nextValue;
		this.name = name;
		this.proteinContentInMiligram = proteinContentInMiligram;
		this.carbonHydrateContentInMiligram = carbonHydrateContentInMiligram;
		this.fatContentInMiligram = fatContentInMiligram;
	}*/

	// these methods should be self-explanatory

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getProteinContentInMiligram() {
		return proteinContentInMiligram;
	}

	public void setProteinContentInMiligram(double proteinContentInMiligram) {
		this.proteinContentInMiligram = proteinContentInMiligram;
	}

	public double getCarbonHydrateContentInMiligram() {
		return carbonHydrateContentInMiligram;
	}

	public void setCarbonHydrateContentInMiligram(double carbonHydrateContentInMiligram) {
		this.carbonHydrateContentInMiligram = carbonHydrateContentInMiligram;
	}

	public double getFatContentInMiligram() {
		return fatContentInMiligram;
	}

	public void setFatContentInMiligram(double fatContentInMiligram) {
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

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		return (this.getName() == ((Meal)obj).getName() &&
				this.getProteinContentInMiligram() == ((Meal)obj).getProteinContentInMiligram() &&
				this.getCarbonHydrateContentInMiligram() == ((Meal)obj).getCarbonHydrateContentInMiligram() &&
				this.getFatContentInMiligram() == ((Meal)obj).getFatContentInMiligram());
	}
}
