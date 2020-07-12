import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestAssertMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Result result=JUnitCore.runClasses(TestCase1.class,TestCase2.class);
		Result result=JUnitCore.runClasses(JUnitSuiteDemo.class);
		for( Failure failure: result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}

}
