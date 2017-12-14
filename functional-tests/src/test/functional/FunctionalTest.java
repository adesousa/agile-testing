package test.functional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalTest {

	public static void main(String[] args) {
		// System.setProperty("webdriver.gecko.driver","D:\\Firefox\\geckodriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}
}