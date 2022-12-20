package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductSearchPageObjects {

	public WebDriver driver;

	private By searchbar = By.xpath("//input[@name='search']");
	private By clickonsearch = By.xpath("//i[@class='fa fa-search']");
	private By price = By.xpath("//p[@class='price']");
	private By addtocart = By.xpath("//span[contains (text(), 'Add to Cart')]");
	private By searchbar1 = By.xpath("//input[@name='search']");
	private By clickonsearch1 = By.xpath("//i[@class='fa fa-search']");
	private By price1 = By.xpath("(//p[@class='price'])[2]");
	private By addtocart1 = By.xpath("(//span[contains (text(), 'Add to Cart')])[2]");
	private By clickoncart = By.xpath("//span[@id='cart-total']");
	private By total = By.xpath("(//td[@class='text-right'])[12]");

	public ProductSearchPageObjects(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement EnterProductName() {
		return driver.findElement(searchbar);
	}

	public WebElement ClickForSearch() {
		return driver.findElement(clickonsearch);
	}

	public WebElement GetTextOfPrice() {
		return driver.findElement(price);
	}

	public WebElement ClickOnAddToCart() {
		return driver.findElement(addtocart);
	}

	public WebElement EnterProductName1() {
		return driver.findElement(searchbar1);
	}

	public WebElement ClickForSearch1() {
		return driver.findElement(clickonsearch1);
	}

	public WebElement GetTextOfPrice1() {
		return driver.findElement(price1);
	}

	public WebElement ClickOnAddToCart1() {
		return driver.findElement(addtocart1);
	}

	public WebElement ClickOnCart() {
		return driver.findElement(clickoncart);
	}

	public WebElement BothItemTotal() {
		return driver.findElement(total);
	}

}
