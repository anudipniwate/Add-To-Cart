package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.ProductSearchPageObjects;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.Constant;

public class VerifyAddingProdductToCart extends BaseClass {

	@Test
	public void VerifySumOfProducts() throws InterruptedException {

		ProductSearchPageObjects PSPO = new ProductSearchPageObjects(driver);

		PSPO.EnterProductName().sendKeys(Constant.searchbar);
		PSPO.ClickForSearch().click();
		Thread.sleep(2000);
		String iphoneCost = PSPO.GetTextOfPrice().getText();
		double d1 = CommonUtilities.ProductPriceHandle(iphoneCost);
		PSPO.ClickOnAddToCart().click();
		PSPO.EnterProductName().clear();
		
		PSPO.EnterProductName1().sendKeys(Constant.searchbar1);
		PSPO.ClickForSearch1().click();
		Thread.sleep(2000);
		String samsungCost = PSPO.GetTextOfPrice1().getText();
		double d2 = CommonUtilities.ProductPriceHandle(samsungCost);
		PSPO.ClickOnAddToCart1().click();
		Thread.sleep(2000);
		
		double d = d1 + d2;
		String k = ("$" + d);
		PSPO.ClickOnCart().click();
		String total = PSPO.BothItemTotal().getText();

		if (k.equals(total)) {
			System.out.println("Amount Matching Successfully");
		} else {
			System.out.println("Amount Not Matching");
		}

	}

}
