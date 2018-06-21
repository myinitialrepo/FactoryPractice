package shopping.ecommercesite.categories;

import java.io.IOException;

import shopping.ecommercesite.service.ExcelSerivce;

public class Footwears implements BuyProducts {

	ExcelSerivce service = new ExcelSerivce();

	public void buy(String fileName, String className) throws IOException {

		service.buy("C:/Users/ak43627/Desktop/Database/ShoppinDataBase.xlsx", "Footwears");
	}

}