package jUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runners.JUnit4;

class testAddNumber {

	@Test
	void test() {
		JUnit ju = new JUnit();
		int result = ju.addNumbers(100, 50);
		assertEquals (150,result);
	}

}
