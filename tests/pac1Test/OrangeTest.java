package pac1Test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import pac1.Orange;

public class OrangeTest {
	private static Orange o1, o2;
	
	@BeforeClass
	public static void init() {
		o1= new Orange(0.5, "France");
		o2= new Orange(0.6, "Espagne");
	}

	@Test
	public void test() {
		
		assertEquals(true, o1.equals(new Orange(0.5, "France"), o1));
		assertEquals(false, o1.equals(new Orange(0.5, "Espagne"), o1));
		assertEquals(false, o1.equals(new Orange(0.6, "France"), o1));
		o1.setPrix(1);
		o1.setPrix(-1);
	}

}
