package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class Homepagemenu {

	WebDriver driver;

	By homePage = By.xpath("//div[@id='lithium-root']/main/div[2]/div/div/div[2]/div[2]/div/form/input");

	By selectopt = By.cssSelector(".bY-HBBDv:nth-child(1) .\\_1EbEjClF");

	public Homepagemenu(WebDriver driver) {

		this.driver = driver;

	}

	// Get the Home Page

	public void getHomePageDashboardName() {

		driver.findElement(homePage).sendKeys("Club Mahindra");

	}

	public void selectclub() {
		driver.findElement(selectopt).click();
	}

}
