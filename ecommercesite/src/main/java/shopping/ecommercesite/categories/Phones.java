package shopping.ecommercesite.categories;

import java.util.LinkedList;

public class Phones implements BuyProducts {
	private LinkedList<Object> phoneName = null;
	


	public void buy() {
		phoneName = new LinkedList<Object>();
		phoneName.add("iPhone x");
		phoneName.add("Samsung s9");
		Object[] typeOfPhone = phoneName.toArray();
		for (Object o : typeOfPhone) {
			System.out.println(o);
		}
	}
}
