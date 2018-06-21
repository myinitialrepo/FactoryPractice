package shopping.ecommercesite.categories;

import java.io.IOException;
import java.util.LinkedList;

import shopping.ecommercesite.service.ExcelSerivce;

public class Phones implements BuyProducts {
	private LinkedList<Object> phoneName = null;
	
	ExcelSerivce service  = new ExcelSerivce();

	public void buy(String fileName, String className) throws IOException {

		service.buy("C:/Users/ak43627/Desktop/Database/ShoppinDataBase.xlsx", "Phones");
	}
	}

