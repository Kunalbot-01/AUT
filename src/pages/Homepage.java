package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class Homepage {

	WebDriver driver;

	By review = By.cssSelector(".hotels-hotel-review-atf-info-parts-Rating__reviewCount--1sk1X");

	By reviewstar = By.cssSelector(
			".ui_checkbox:nth-child(1) > .location-review-review-list-parts-ReviewRatingFilter__checkbox_label--1RefT");

	By writereview = By
			.cssSelector(".hotels-community-content-common-ContextualCTA__currentOption--3Wd5D > .ui_button");



	public Homepage(WebDriver driver) {

		this.driver = driver;

	}

	public void setrev() {

		driver.findElement(review).click();

	}

	public void setclcrev() {

		driver.findElement(reviewstar).click();

	}

	public void wrirev() {

		driver.findElement(writereview).click();

	}

	/**
	 * 
	 * This POM method will be exposed in test case to login in the application
	 * 
	 * @param
	 * 
	 * @param
	 * 
	 * @return
	 * 
	 */

	public void AUT() {

		this.setrev();

		this.setclcrev();

		this.wrirev();

		// Click Login button

	}

}
