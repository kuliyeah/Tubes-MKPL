package src.test.java;

import static org.junit.Assert.*;
import src.main.java.*;
import org.junit.Test;

public class FibonacciCounter {

	@Test
	public void testFibonacci() {
		Fibonacci testFibo = new Fibonacci();
		assertEquals(testFibo.fibonacciCounter(9), "1 2 3 5 8 13 21 34 55 ");
		assertEquals(testFibo.fibonacciCounter(10), "1 2 3 5 8 13 21 34 55 89 ");
	}

}
