package shopping.ecommercesite.service;

import shopping.ecommercesite.ShoppingFactory;
import shopping.ecommercesite.categories.BuyProducts;

public class Client {

	public static void main(String[] args) {
		BuyProducts buy = ShoppingFactory.buyThings("Clothes");
		buy.buy();

	}

}
