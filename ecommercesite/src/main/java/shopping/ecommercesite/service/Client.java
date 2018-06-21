package shopping.ecommercesite.service;

import java.io.IOException;

import shopping.ecommercesite.ShoppingFactory;
import shopping.ecommercesite.categories.BuyProducts;

public class Client {

	public static void main(String[] args) throws IOException {
		BuyProducts buy = ShoppingFactory.buyThings("Accesseries");
		buy.buy("","");
	}
}
