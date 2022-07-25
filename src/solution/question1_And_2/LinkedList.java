package solution.question1_And_2;

public class LinkedList {
	private int counter;
	private Meal head;

	// Default constructor
	public LinkedList() {

	}
	// appends the specified element to the end of this list.
	public void add(Meal meal) {

		// Initialize solution.question5.Node only in case of 1st element
		if (head == null) {
			head = new Meal(meal.getName(), meal.getProteinContentInMiligram(), meal.getCarbonHydrateContentInMiligram(),
					meal.getFatContentInMiligram());
		}

		Meal linkTemp = new Meal(meal.getName(), meal.getProteinContentInMiligram(), meal.getCarbonHydrateContentInMiligram(),
				meal.getFatContentInMiligram());
		Meal linkCurrent = head;

		if (linkCurrent != null) {

			// starting at the head node, crawl to the end of the list and then add element after last node
			while (linkCurrent.getNext() != null) {
				linkCurrent = linkCurrent.getNext();
			}

			// the last node's "next" reference set to our new node
			linkCurrent.setNext(linkTemp);
		}

		// increment the number of elements variable
		incrementCounter();
	}

	private int getCounter() {
		return counter;
	}

	private void incrementCounter() {
		counter++;
	}

	private void decrementCounter() {
		counter--;
	}

	// inserts the specified element at the specified position in this list
	public void add(Meal meal, int index) {

		Meal linkTemp = new Meal(meal.getName(), meal.getProteinContentInMiligram(), meal.getCarbonHydrateContentInMiligram(),
				meal.getFatContentInMiligram());

		Meal linkCurrent = head;

		// Let's check for NPE before iterate over linkCurrent
		if (linkCurrent != null) {
			// crawl to the requested index or the last element in the list, whichever comes first
			for (int i = 0; i < index && linkCurrent.getNext() != null; i++) {
				linkCurrent = linkCurrent.getNext();
			}
		}

		// set the new node's next-node reference to this node's next-node reference
		linkTemp.setNext(linkCurrent.getNext());
		// now set this node's next-node reference to the new node
		linkCurrent.setNext(linkTemp);
		// increment the number of elements variable
		incrementCounter();
	}

	public Meal find(int index)
	// returns the element at the specified position in this list.
	{
		// index must be 0 or higher
		if (index < 0)
			return null;
		Meal linkCurrent = null;
		if (head != null) {
			linkCurrent = head.getNext();
			for (int i = 0; i < index; i++) {
				if (linkCurrent.getNext() == null)
					return null;
				linkCurrent = linkCurrent.getNext();
			}
			return linkCurrent;
		}
		return null;
	}

	public int find(Meal meal)
	// returns the element at the specified position in this list.
	{
		Meal linkCurrent = null;
		if (head != null) {
			linkCurrent = head;
			for (int i = 0; i < size(); i++) {
				if (linkCurrent.getNext() == null)
					return -1;
				linkCurrent = linkCurrent.getNext();
				if(equalTo(linkCurrent,meal))
					return i;
			}
			return -1;
		}
		return -1;
	}

	public Meal remove(Object key) throws Exception {
		if(key  instanceof Integer) {
			Meal linkPrev;
			int index = (Integer) key;
			if (index < 1 || index > size())
				return null;
			Meal linkCurrent = head;
			if (head != null) {
				for (int i = 0; i < index; i++) {
					if (linkCurrent.getNext() == null)
						return null;
					linkCurrent = linkCurrent.getNext();
				}
				linkPrev = linkCurrent.getNext();
				linkCurrent.setNext(linkCurrent.getNext().getNext());
				// decrement the number of elements variable
				decrementCounter();
				return linkPrev;
			}
			return null;
		}

		else if (key instanceof Meal){
			Meal meal = (Meal) key;
			Meal linkPrev;
			Meal linkCurrent = head;
			if (head != null) {
				for (int i = 0; i < size(); i++) {
					if (linkCurrent.getNext() == null)
						return null;
					linkCurrent = linkCurrent.getNext();
					if(equalTo(linkCurrent,meal)){
						linkPrev = linkCurrent;
						linkCurrent.setNext(linkCurrent.getNext().getNext());
						// decrement the number of elements variable
						decrementCounter();
						return linkPrev;
					}
				}
				return null;
			}
		}
		else{
			throw new Exception("The passed type is not supported");
		}
		return null;
	}

	// returns the number of elements in this list.
	public int size() {
		return getCounter();
	}

	public String toString() {
		String output = "";
		if (head != null) {
			Meal mealCurrent = head.getNext();
			while (mealCurrent != null) {
				output += "[" + mealCurrent + "]";
				mealCurrent = mealCurrent.getNext();
			}
		}
		return output;
	}

	public boolean equalTo(Meal obj1, Meal obj2){
		return (obj1.getName() == obj2.getName() &&
				obj1.getProteinContentInMiligram() == obj2.getProteinContentInMiligram() &&
				obj1.getCarbonHydrateContentInMiligram() == obj2.getCarbonHydrateContentInMiligram() &&
				obj1.getFatContentInMiligram() == obj2.getFatContentInMiligram());
	}
}
