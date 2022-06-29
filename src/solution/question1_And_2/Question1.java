package solution.question1;

import solution.question1.LinkedList;
import solution.question1.Meal;

public class Question1 {
	public static void main(String[] args) {

		// Default constructor - let's put "0" into head element.

		LinkedList linkedList = new LinkedList();

		// add more elements to LinkedList
//		linkedList.add("1");


		//meal dummy data
		Meal meal1 = new Meal("apple",3.2,7.5,0.3);
		Meal meal2 = new Meal("eba",0.3,6.3,2.5);
		Meal meal3 = new Meal("fries",9.2,2.3,5.3);
		Meal meal4 = new Meal("chicken",0.3,1.3,8.1);


		linkedList.add(meal1);
		linkedList.add(meal2);
		linkedList.add(meal3);
		linkedList.add(meal4);




		/*
		 * Please note that primitive values can not be added into LinkedList directly. They must be converted to their
		 * corresponding wrapper class.
		 */

		System.out.println("Print LinkedList: \t\t" + linkedList);
		System.out.println(".size(): \t\t\t\t" + linkedList.size());
		System.out.println(".get(3): \t\t\t\t" + linkedList.get(3) + " (get element at index:3 - list starts from 0)");
		System.out.println(".remove(2): \t\t\t\t" + linkedList.remove(2) + " (element removed)");
		System.out.println(".get(3): \t\t\t\t" + linkedList.get(3) + " (get element at index:3 - list starts from 0)");
		System.out.println(".size(): \t\t\t\t" + linkedList.size());
		System.out.println("Print again: LinkedList: \t" + linkedList);
	}

}
