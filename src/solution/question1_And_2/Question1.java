package solution.question1_And_2;

public class Question1 {
	public static void main(String[] args) throws Exception {

		//declare an object of LinkedList
		LinkedList linkedList = new LinkedList();

		//meal dummy data
		Meal meal1 = new Meal("apple",3.2D,7.5D,0.3D);
		Meal meal2 = new Meal("eba",0.3D,6.3D,2.5D);
		Meal meal3 = new Meal("fries",9.2D,2.3D,5.3D);
		Meal meal4 = new Meal("chicken",0.3D,1D,8.1D);

		linkedList.add(meal1);
		linkedList.add(meal2);
		linkedList.add(meal3);
		linkedList.add(meal4);

		System.out.println("LinkedList before: \t\t" + linkedList);
		System.out.println(".size(): \t\t\t\t" + linkedList.size());

		System.out.println("find(int index))");
		System.out.println(".find(0): \t\t\t\t" + linkedList.find(0));
		System.out.println(".find(1): \t\t\t\t" + linkedList.find(1));
		System.out.println(".find(2): \t\t\t\t" + linkedList.find(2));
		System.out.println(".find(3): \t\t\t\t" + linkedList.find(3));

		System.out.println("\nfind(Meal meal))");
		System.out.println(".find(meal1): \t\t\t\t" + linkedList.find(meal1));
		System.out.println(".find(meal2): \t\t\t\t" + linkedList.find(meal2));
		System.out.println(".find(meal3): \t\t\t\t" + linkedList.find(meal3));
		System.out.println(".find(meal4): \t\t\t\t" + linkedList.find(meal4));

		System.out.println("\nremove(int index))");
		System.out.println(".remove(3): \t\t\t\t" + linkedList.remove(3));
		System.out.println(".remove(0): \t\t\t\t" + linkedList.remove(0));

		System.out.println("\nremove(Meal meal))");
		System.out.println(".remove(meal2): \t\t\t\t" + linkedList.remove(meal2));

		System.out.println("\n.size(): \t\t\t\t" + linkedList.size());
		System.out.println("LinkedList after: \t" + linkedList);
	}
}
