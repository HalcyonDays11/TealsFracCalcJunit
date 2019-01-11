import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Method;

import org.junit.Test;

public class FracCalcJunitCheckpoint1 {

	@Test
	public void testCheckpoint1() {
		try {
			Class<?> clazz = Class.forName("FracCalc");
			Method[] methods = clazz.getMethods();
			
			Method foundMethod = null;
			for(Method m : methods) {
				if(m.getName().equals("calculateResult")){
					foundMethod = m;
					break;
				}
			}
			assertNotNull("No calculateResult() method found.", foundMethod);
			
			Class<?>[] parameterTypes = foundMethod.getParameterTypes();
			assertTrue("calculateResult method does not take String!", parameterTypes[0].isAssignableFrom(String.class));
		
			assertTrue("calculateResult method does not return String!", foundMethod.getReturnType().isAssignableFrom(String.class));
		} catch (ClassNotFoundException e) {
			fail("Could not find FracCalc.java!");
		}
	}
	
}
