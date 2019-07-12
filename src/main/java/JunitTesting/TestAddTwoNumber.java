package JunitTesting;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import JunitClasses.AddTwoNumber;



@RunWith(Parameterized.class)
public class TestAddTwoNumber {

	private int number1;
	private int number2;
	private int result;
	private AddTwoNumber addTwoNumber;

	public TestAddTwoNumber(int number1, int number2, int result) {
		this.number1=number1;
		this.number2=number2;
		this.result=result;
	}
	@Before
	public void initialize() {
		addTwoNumber =  new AddTwoNumber();
	}
	
	@SuppressWarnings("rawtypes")
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][]{ { 1, 2, 3 }, { 11, 22, 33 },
			{111, 222, 333}, {9, 10, 19}});
	}
	
	@Test
	public void testSumTwoNumber_ShouldReturnResult_WhenTwoNumberIsGiven() {
		assertEquals(result, addTwoNumber.sumTwoNumber(number1, number2) );
		
		
	}

}
