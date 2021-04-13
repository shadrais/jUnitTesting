package jUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddString {

	@Test
	void test() {
		{
			JUnit jUnitString = new JUnit();
			String result = jUnitString.addStrings("hello", "world");
			assertEquals ("helloworld",result);
		}
	}

}
