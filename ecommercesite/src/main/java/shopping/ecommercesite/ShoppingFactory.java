package shopping.ecommercesite;

import java.io.IOException;

import shopping.ecommercesite.categories.Accesseries;
import shopping.ecommercesite.categories.BuyProducts;
import shopping.ecommercesite.categories.Clothes;
import shopping.ecommercesite.categories.Footwears;
import shopping.ecommercesite.categories.Phones;

public class ShoppingFactory {

	public static BuyProducts buyThings(String className) throws IOException {
		if (className == "Clothes") {
			Clothes cloth = new Clothes();
			return  cloth;
		}
		if (className == "Footwears") {
			Footwears foot = new Footwears();
			return (BuyProducts) foot;
		}
		if (className == "Phones") {
			Phones phone = new Phones();
			return phone;
		}
		if (className == "Accesseries") {
			Accesseries access = new Accesseries();
			return access;
		}
		
		return null;

	}

}
