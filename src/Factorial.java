import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Factorial {

	public static void main(String[] args) {
		// This program is an introduction to unit tests for me
		int number = 5;
		System.out.println("Result for our number: " + factorial(number));
		
		JUnitCore runner = new JUnitCore();
        Result result = runner.run(FactorialTest.class);
        System.out.println("run tests: " + result.getRunCount());
        System.out.println("failed tests: " + result.getFailureCount());
        System.out.println("ignored tests: " + result.getIgnoreCount());
        System.out.println("success: " + result.wasSuccessful());
	}
public static int factorial(int number) {
	int result = 1;
	if (number>0) {
		for (int i = 1; i<=number; i++) {
		result *= i;
		}
	}
	else if (number == 0) {
		result = 1;
	}
	else {
		throw new IllegalArgumentException("Number is not positive - change it");
	}
	return result;
	
}
}
