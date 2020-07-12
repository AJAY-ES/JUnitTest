import static org.junit.Assert.*; 

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
 
import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

/**
 * 
 */

/**
 * @author ajayrahul
 *
 */
public class TestResultClassDemo extends TestResult{
    //add errors
	public synchronized void addError(Test test,Throwable t) {
		super.addError((junit.framework.Test)test,t);
	}
	//add failures
	public synchronized void addFailure(Test test,AssertionFailedError t) {
		super.addError((junit.framework.Test)test,t);
	}
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
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
	 Assert.assertEquals(9,9);
	}
 //Mark that the test run should stop
public synchronized void stop() {
	
}
}
