package JunitTesting;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import JunitClasses.PrimeNumber;

@RunWith(Parameterized.class)

public class TestPrimeOrNotPrime {

	private	PrimeNumber primeNumber;
	
	private int number;
	private String result;
	
	@Before
	public void initialize() {
		primeNumber = new PrimeNumber();
	}
	
	public TestPrimeOrNotPrime(int number, String result) {
		this.number=number;
		this.result = result;
	}
	
	
	@SuppressWarnings("rawtypes")
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][]{ { 0,"Not Prime" }, { 1, "Not Prime" },
			{2,"Prime"}, {3,"Prime"}, {5,"Prime"}, {23,"Prime"},{96,"Not Prime"}});
	}
	
	
	@Test
	public void testPimeOrNotPrime_ShouldReturnNotPrime_WhenZeroOrOneIsGiven() {
		assertEquals(result, primeNumber.PrimeOrNotPrime(number));
	}

}
