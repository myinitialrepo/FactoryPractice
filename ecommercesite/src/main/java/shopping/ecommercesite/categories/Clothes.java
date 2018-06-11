package shopping.ecommercesite.categories;

import java.util.ArrayList;

public class Clothes implements BuyProducts {
	private ArrayList<String> clothing = null;

	public void buy() {
		clothing = new ArrayList<String>();
		clothing.add("Saree");
		clothing.add(1, "Kurta's");
		clothing.add("Jeans");
		Object[] allTypeOfClothes = clothing.toArray();
		for (Object o : allTypeOfClothes) {
			System.out.println(o);
		}
	}
}
