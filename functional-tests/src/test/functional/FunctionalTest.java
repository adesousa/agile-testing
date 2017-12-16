package test.functional;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalTest {

	private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","/Library/Java/JUNIT/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
  		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     }

    // Test de la Story Page de Recherche (trello #1)
	@Test
    public void testPageRecherche() throws Exception {
        driver.get("https://www.meetup.com/fr-FR/find/");
		assertEquals(driver.getTitle(), "Rencontrez de nouvelles têtes | Meetup");
		// TODO
		// To Be Completed By Coders From Coding Factory
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}