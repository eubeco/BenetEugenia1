package calculadora;

/** 
 * 
 *  Prueba calculadora RPN mediante JUnit 
 * 
 * 
 * */

import org.junit.*;
import junit.framework.TestCase;


public class TestRPN_JUnit extends TestCase{

		
	
	@Test
	public void testRPN_JUnit() {
		
		//Casos válidos
		RPN calc1 = new RPN("10 4 3 + 2 * -");		
		assertEquals(-4.000000D,calc1.resultado());
		
		RPN calc2 = new RPN("9 2 %");		
		assertEquals(1D,calc2.resultado());
		
		RPN calc3 = new RPN("1 1 1 + +");		
		assertEquals(3D,calc3.resultado());
		
		RPN calc4 = new RPN("5 2 4 16 + / +");		
		assertEquals(5.100000D,calc4.resultado());		

		RPN calc12 = new RPN("3 3 ^");		
		assertEquals(27.000000D,calc12.resultado());			
		
		RPN calc13 = new RPN("4 5 * 7 2 / - 3 %");		
		assertEquals(1.500000D,calc13.resultado());
		
		
		//Casos no válidos
//		RPN calc5 = new RPN("patata");		
//		assertEquals(-4.000000D,calc5.resultado());
//		
//		RPN calc6 = new RPN("* 5 3");		
//		assertEquals(15,calc6.resultado());
//		
//		RPN calc7 = new RPN("2 3 4 5");		
//		assertEquals(-4.000000D,calc7.resultado());
//		
//		RPN calc8 = new RPN("5 8 9 /");		
//		assertEquals(-4.000000D,calc8.resultado());
//		
//		RPN calc9 = new RPN("6 0 /");		
//		assertEquals(-4.000000D,calc9.resultado());
//		
//		RPN calc10 = new RPN("10 4 3 + 2 * -");		
//		assertEquals(-4.000000D,calc10.resultado());		
//		
//		RPN calc11 = new RPN("1 1 1 +");
//		assertEquals(-4.000000D,calc11.resultado());
//		
	}
	
}