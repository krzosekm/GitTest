package pl.krzosekm.gittest;
import static org.junit.Assert.*;


import org.junit.Test;

import pl.krzosekm.gittest.NewClass;


public class Test2 {

	@Test
	public void testSum() {
		NewClass newClass = new NewClass();
		int a = 5;
		int b = 2;
		int result = newClass.sum(a, b);
		assertEquals(12, result);
	}

}
