package ro.mysite;

import org.testng.annotations.Test;
/*Always add Test keyword to you tests in src/test/java like : TestCaseNameTest
 * in the pom.xml include the <configuration>
						<suiteXmlFiles>
							<suiteXmlFile>testng.xml</suiteXmlFile>
						</suiteXmlFiles>
					</configuration> in order for maven to run based on the information FROM testng.xml !
 * */

public class SeleniumTest {
	
	
	
	
	@Test
	public void browserAutomation() {
		
		System.out.println("browser automation");
		System.out.println("web automation");
	}
	
	@Test
	public void elementsUI() {
		System.out.println("elements UI");
		
	}
	

	
	
	
}
