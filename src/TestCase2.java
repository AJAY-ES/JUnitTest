import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 */

/**
 * @author ajayrahul
 *
 */
public class TestCase2 {
	int num;
	String temp,str;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		num=5;
 		temp=null;
 		str="Junit is working!!";
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		System.out.println("test method on TestCase 2");
		assertEquals(5,num);
 	    assertFalse(num>6);
 	    assertNotNull(str);
 	    assertNull(temp);
 	    assertTrue(num==5);
	}

}
