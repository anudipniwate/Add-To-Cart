package Resources;

import org.openqa.selenium.WebDriver;

public class CommonUtilities {

	public static WebDriver driver;

	public static double ProductPriceHandle(String price) {

		String ProductCost = price;
		String[] spl = ProductCost.split("\\s+");
		String a = spl[0];
		String removeDollar = a.replaceAll("[$]", "");
		double d1 = Double.parseDouble(removeDollar);
		return d1;

	}
}
