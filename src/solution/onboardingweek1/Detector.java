package solution.onboardingweek1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Detector {
	public static final List<String> VALUES = Arrays.asList("EXCELLENCE","COMMITMENT","INNOVATION","INTEGRITY");
	public static void main(String [] args) {
		String values;
		System.out.println("Welcome to ByteWorks where IT always works");
		System.out.print("Kindly enter all our values separated by space\n");
		values = readInput();

		List tmpValues =Arrays.stream(values.split(" ")).toList();

		if(compare(VALUES,tmpValues)){
			System.out.println("You got that right!");
			printInfo();
		}
		else
			System.out.println("Hmn, Look over the walls, I'm sure you'd see "
					+ "a poster that reads our values!");
	}

	public static String readInput(){
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

	private static boolean compare (final List defaultValues, final List inputValues){
		final Set set = new HashSet<>(inputValues);
		return defaultValues.size() == inputValues.size() && set.containsAll(defaultValues);
	}

	private static List wastes(){
		List wastes = Arrays.asList("TIME","INVENTORY","MOTION","WAITING","TRANSPORTATION", "OVER PRODUCTION",
				"DEFECT");
		return wastes;
	}

	private static List fourDx(){
		List fourDx = Arrays.asList(
				"SET A WILDLY IMPORTANT GOAL",
				"DECOMPOSE YOUR WIG INTO LEAD AND LAG MEASURE SUB-TASKS",
				"KEEP A COMPELLING SCOREBOARD",
				"HOLD THE CADENCE");
		return fourDx;
	}
	private static List disciplines(){
		List disciplines = Arrays.asList("IDENTITY","FULLSTACK","X","Y","Z","ALPHA");
		return disciplines;
	}

	private static void printInfo(){
		StringBuilder str = new StringBuilder();

		str.append("Here are the six technology team disciplines in Byteworks:\n")
						.append(disciplines())
								.append("\n\nHere are the 4 Disciplines of Execution\n");

		fourDx().forEach(s -> str.append(s).append("\n"));

		str.append("\nHere are the 7 types of wastes you should avoid at Byteworks\n")
				.append(wastes());

		System.out.println(str);
	}
}
