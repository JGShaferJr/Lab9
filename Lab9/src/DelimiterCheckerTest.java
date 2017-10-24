import static org.junit.Assert.*;

import org.junit.Test;

public class DelimiterCheckerTest {

	@Test
	public void testCheck() {
		DelimiterChecker checker = new DelimiterChecker();
		String test1 = "[5*{4/(2+3)}]";
		String test2 = "abc{defg(ijk){l{mn}}op}q";
		String test3 = "abc[def}}{ghij{kl}";
		
		assertTrue(checker.check(test1));
		assertTrue(checker.check(test2));
		
		assertFalse(checker.check(test3));	
	}

}
