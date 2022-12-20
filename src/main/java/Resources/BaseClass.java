package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	public Properties prop;

	public void InitializeDriver() throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\\\main\\\\java\\\\Resources\\\\data.properties");

		prop = new Properties();

		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else {

			System.out.println("this browser does not exist in your system");
		}

	}

	@BeforeMethod
	public void LaunchURL() throws IOException {

		InitializeDriver();

		String url = prop.getProperty("url");
		driver.get(url);
	}

}
