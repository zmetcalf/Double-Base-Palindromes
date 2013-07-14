import static org.junit.Assert.*;

import org.junit.Test;

public class DoubleBasePalindromesTest {

	DoubleBasePalindromes dbPalin = new DoubleBasePalindromes(1000000);

	@Test
	public void testClass() {
		dbPalin.calculateSumOfPalindromes();
		System.out.println(dbPalin.getSumOfPalindromes());
		assertNotNull(dbPalin.getSumOfPalindromes());
	}
}
