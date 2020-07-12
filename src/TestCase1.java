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
public class TestCase1 {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//System.out.println("setUpBeforeClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//System.out.println("tearDownAfterClass");
	 
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	//	System.out.println("setUp");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		//System.out.println("tearDown");
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		System.out.println("test method 1 on TestCase1");
	}
	@Test
	public void test2() {
		//fail("Not yet implemented");
		System.out.println("test method 2 on TestCase1");
	}

}
