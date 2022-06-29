package solution.question1;

public class LinkedList {
	private int counter;
	private Meal head;

	// Default constructor
	public LinkedList() {

	}

	// appends the specified element to the end of this list.
	public void add(Meal meal) {

		// Initialize solution.question5.Node only incase of 1st element
		if (head == null) {
			head = new Meal(meal.getName(), meal.getProteinContentInMiligram(), meal.getCarbonHydrateContentInMiligram(),
					meal.getFatContentInMiligram());
		}

		Meal linkTemp = new Meal(meal.getName(), meal.getProteinContentInMiligram(), meal.getCarbonHydrateContentInMiligram(),
				meal.getFatContentInMiligram());
		Meal linkCurrent = head;

		// Let's check for NPE before iterate over linkCurrent
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

	public Meal get(int index)
	// returns the element at the specified position in this list.
	{
		// index must be 1 or higher
		if (index < 0)
			return null;
		Meal mealCurrent = null;
		if (head != null) {
			mealCurrent = head.getNext();
			for (int i = 0; i < index; i++) {
				if (mealCurrent.getNext() == null)
					return null;

				mealCurrent = mealCurrent.getNext();
			}
			return mealCurrent;
		}
		return mealCurrent;

	}

	// removes the element at the specified position in this list.
	public boolean remove(int index) {

		// if the index is out of range, exit
		if (index < 1 || index > size())
			return false;

		Meal linkCurrent = head;
		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (linkCurrent.getNext() == null)
					return false;

				linkCurrent = linkCurrent.getNext();
			}
			linkCurrent.setNext(linkCurrent.getNext().getNext());

			// decrement the number of elements variable
			decrementCounter();
			return true;
		}

		return false;
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

}
