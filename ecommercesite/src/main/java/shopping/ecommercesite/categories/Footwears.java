package shopping.ecommercesite.categories;

import java.util.ArrayList;
import java.util.Arrays;

public class Footwears implements BuyProducts {
	private String[] footwears = null;

	public Footwears() {

	}

	public Footwears(String[] footwears) {

		for (String i : footwears) {
			System.out.println(i);
		}
	}

	public void buy() {
		ArrayList<String> a1 = new ArrayList<String>(Arrays.asList(new String[] { "Slippers", "Sandles", "Shoes" }));
		System.out.println(a1);
	}
}



