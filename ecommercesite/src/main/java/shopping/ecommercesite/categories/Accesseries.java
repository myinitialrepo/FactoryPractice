package shopping.ecommercesite.categories;

import java.util.AbstractList;
import java.util.ArrayList;

public class Accesseries implements BuyProducts {

	public void buy() {

		AbstractList<String> access = new ArrayList<String>();
		access.add("ear rings");
		access.add("braclete");
		for (String s : access) {
			System.out.println(s);
		}
	}
}
