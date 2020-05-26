package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import pages.Homepage;
import pages.Homepagemenu;


public class TestAUT {

	String driverPath = "C:\\Users\\Kunal\\Desktop\\chromedriver.exe";

	WebDriver driver;
	Homepage objhome ;
	Homepagemenu objmenu;

	@BeforeTest

	public void setup() {

		System.setProperty("webdriver.chrome.driver", driverPath);

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.tripadvisor.in/");
		driver.manage().window().maximize();
	}

	@Test(priority = 0)

	public void test_Home_Page_Appear() {
		objmenu = new Homepagemenu(driver);
		
		objmenu.getHomePageDashboardName();
		
		objmenu.selectclub();
		
	
	}
	@Test(priority = 1)
		public void Main_Home_Page_Appear() throws Exception {
		objhome = new Homepage(driver);
		Thread.sleep(5000);
	//	JavascriptExecutor js = (JavascriptExecutor)driver;
	//	js.executeScript("window.scrollBy(0,1000)");
		objhome.AUT();
	}
}