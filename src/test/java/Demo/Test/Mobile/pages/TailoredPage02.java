package Demo.Test.Mobile.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Steps;

@DefaultUrl("https://tailored.to/en-gb")
public class TailoredPage02 extends PageObject{
/*@Steps
TailoredPage02 tailoredPage02;
@FindBy(className="icon-text__content")
WebElement okButton;
@FindBy(className="home-page__item-info")
WebElement headPhone;
@FindBy(xpath="//div[@class='step-item__question']/ul/li[1]")
WebElement selectOption;
@FindBy(xpath="//form/div[3]/div[2]/button/span")
WebElement nextButton;
*/
	protected WebDriver driver;
	public TailoredPage02(WebDriver driver){
		this.driver=driver;
	}
	public void click_on_Ok_button() {
		driver.findElement(By.className("icon-text__content")).click();
		//okButton.click();
	}

	public void click_on_headPhones() {
		driver.findElement(By.className("home-page__item-info")).click();		
		//headPhone.click();
	}

	 public void select_an_option() {
	driver.findElement(By.xpath("//div[@class='step-item__question']/ul/li[1]")).click();
		 //selectOption.click();
	}

	public void click_on_button() {
		driver.findElement(By.xpath("//form/div[3]/div[2]/button/span" )).click();
		///nextButton.click();
	}

	

}
