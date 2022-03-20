import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	 @Test(expected = IllegalArgumentException.class)
	    public void factorialNegative() {
	        Factorial.factorial(-2);
	    }
	 
	 @Test
	 public void factorialTestNumbers() {
	        assertTrue(Factorial.factorial(0) == 1);
	        assertTrue(Factorial.factorial(1) == 1);
	        assertTrue(Factorial.factorial(6) == 720);
	    }

}
