package ex11;
import java.util.Map;
import java.util.TreeMap;

//import sun.security.util.Length;

public class Basket {
	
	Map<Item, Integer> orderedItems = new TreeMap<>();
	
///////////////// mess!
	private void addManyItemsToBasket(Basket basket, Item[] item) {
		for(int i = 0; i < item.length; i++) {
			basket.orderedItems.put(item, i);
			System.out.println(item[i].name + " have been added to the basket.");
		}
	}

	private void removeManyItemsFromBasket(Basket basket, Item[] item) {
		for(int i = 0; i < item.length; i++) {
			basket.orderedItems.remove(item, i);
			System.out.println(item[i].name + " have been removed from the basket.");
		}
	}
//////////////////	
	private static void addItemToBasket(Basket basket, Item item) {
			basket.orderedItems.put(item, 1);
			System.out.println(item.name + " has been added to the basket.");
	}

	private void removeItemFromBasket(Basket basket, Item item) {
			basket.orderedItems.remove(item.name, item.price);
			System.out.println(item.name + " has been removed from the basket.");
	}	
///////////////////	
	private void showTheTotalBasketValue(Basket basket, String name) {
//		Collection<Double> basketItemsValues = basket.orderedItems.values();
//		for(Collection<Double> values : basketItemsValues) {
		System.out.println("The price is: " + basket.orderedItems.get(name));
	}
		
//		double totalBasketValue;
//		System.out.println("Total value of your basket is: " + totalBasketValue);
//	}
	
	public static void main(String[] args) {
		Basket basket1 = new Basket();
		Item item1 = new Item("milk", 2.20);
		Item item2 = new Item("sugar", 3.99);
		Item item3 = new Item("newspaper", 9.99);
		Item item4 = new Item("gum", 0.30);
		
		Item[] manyItems= {item1, item2}; 	
		
		
//		basket.addManyItemsToBasket(basket, manyItems);
		addItemToBasket(basket1, item3);
//		basket1.addItemToBasket(basket1, item4);
		
		basket1.showTheTotalBasketValue(basket1, "newspaper"); //null
	}

}
