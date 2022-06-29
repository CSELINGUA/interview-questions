package solution.question5;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Question5 {

	public static final String CLIENT_ONE_FILE = "client-request-1.txt";
	public static final String CLIENT_TWO_FILE = "client-request-2.txt";
	public static final String CLIENT_THREE_FILE = "client-request-2.txt";
	public static final String BANK_FILE = "teradata-world-setup.txt";
	public static final String PATH = "/Users/cselingua/Documents/Programs/JAVA/files/";



	public static void main(String[] args)
	{
		List elements = new List();
		try {
			elements =readBankFile();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		int count;
		try{
			count = Integer.parseInt(elements.getItem(0));
		}
		catch(Exception e){
			throw new RuntimeException("Pattern mismatch");
		}

		//integer data for root node
		int rootNodeData = Integer.parseInt(Arrays.stream((elements.getItem(1).split(","))).toList().get(0));

		/**
		 * create rootNode
		 */
		Node<Integer> rootNode = new Node<Integer>(rootNodeData);

		int rootData = 0;

		for(int i=1;i<count-1; i++){

			if(true){}

			int root = Integer.parseInt(Arrays.stream((elements.getItem(i).split(","))).toList().get(0));
			int child = Integer.parseInt(Arrays.stream((elements.getItem(i).split(","))).toList().get(1));
			int percentage = Integer.parseInt(Arrays.stream((elements.getItem(i).split(","))).toList().get(2));

			rootNode.addChild(new Node<Integer>(child),percentage);
			rootData = child;
		}

		//TODO LOGIC FOR PACKET TRANSMISSION
		//TODO IDEAS
		//TODO TRAVERSING THE NODES SEEMS TO BE A PROBLEM, AND CONSIDERING THE TIME CONSTRAINT
		//TODO READ CLIENT FILE METHOD HAS BEEN CREATED, BUT NOT USED
		//TODO HAVE BEEN ABLE TO READ THE NODES DATA INTO root, child and percentage VARIABLES
		//TODO BUT HAVEN'T FULLY ADDED THEM TO THE TREE


		/**
		 * create a tree providing the root node
		 */

		Tree<Integer> tree = new Tree<Integer>(rootNode);


		// Get the pre-order traversal
		ArrayList<Node<Integer>> preOrder = tree.getPreOrderTraversal();
		System.out.println(preOrder.get(0));
	}

	/**
	 *
	 * @return list of lines read from the file
	 * @throws Exception
	 */
	public static List readBankFile() throws Exception{

		List elements = new List();

		File file = new File(
				PATH+BANK_FILE);
		BufferedReader br
				= new BufferedReader(new FileReader(file));
		String st;

		while ((st = br.readLine()) != null){
			System.out.println(st);
			elements.add(st);
		}
		return elements;
	}

	public static List readClientFile(String clientFile) throws Exception{

		List elements = new List();
		File file = new File(PATH + clientFile);
		BufferedReader br
				= new BufferedReader(new FileReader(file));

		String st;
		while (((st = br.readLine()) != null) || (br.readLine() != "") || (br.readLine() != "END")){
			System.out.println(st);
			elements.add(st);
		}
		return elements;
	}
}
