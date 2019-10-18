import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class ieja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\TST\\Documents\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());	
	}

}
