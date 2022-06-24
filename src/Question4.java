import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Question4 {

	static int number;
	public static void main(String []args){

		System.out.println("Enter a number between 22 and 100 to get the factorial");

		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			number = Integer.valueOf(br.readLine());
		}
		catch (Exception e){
			throw new RuntimeException("Check the entry");
		}

		if(number < 22 || number > 100){
			System.out.println("Bounds undefined");
		}
		else{
			System.out.println(factorial(number));
		}
	}

	/**
	 *
	 * @param number
	 * @return factorial (!) of number
	 */
	public static BigInteger factorial(int number) {
		BigInteger factorial = BigInteger.ONE;
		for(int i = number; i>0;i--) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		return factorial;
	}
}
