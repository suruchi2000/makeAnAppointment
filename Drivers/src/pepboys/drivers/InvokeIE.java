package pepboys.drivers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class InvokeIE {
public WebDriver driver;
	
	public InvokeIE(){
		System.setProperty("webdriver.ie.driver", "D:\\drivers\\IEDriverServer.exe");
		driver= new InternetExplorerDriver();

	}
	
	
	@Test
	public void ieProgram(){
		
		
	}

}
