package ex11;

import java.util.Collection;
import java.util.Map;

public class Basket {
	
	Map<String, Double> orderedItems;
	
	public void addToBasket(Basket basket, Item item) {
		basket.orderedItems.put(item.name, item.price);
		System.out.println(item.name + " has been added to the basket.");
	}

	public void removeFromBasket(Basket basket, Item item) {
		basket.orderedItems.remove(item.name, item.price);
		System.out.println(item.name + " has been removed from the basket.");
	}
	
	public void showTheTotalBasketValue(Basket basket) {
		Collection<Double> basketItemsValues = basket.orderedItems.values();
//		for(Collection<Double> values : basketItemsValues) {
		System.out.println("Collection: " + basketItemsValues);
	}
		
//		double totalBasketValue;
//		System.out.println("Total value of your basket is: " + totalBasketValue);
//	}
	
	public static void main(String[] args) {
		Basket basket = new Basket();
		Item item1 = new Item("milk", 2.20);
		Item item2 = new Item("sugar", 3.99);
		Item item3 = new Item("newspaper", 9.99);
		
		basket.addToBasket(basket, item1);
		basket.addToBasket(basket, item2);
		basket.addToBasket(basket, item3);
		
		basket.showTheTotalBasketValue(basket); //null
	}

}
