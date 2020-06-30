package ex11;
import java.util.Map;
import java.util.TreeMap;
import static ex11.OrderHelper.*;

public class Basket {

	Map<Integer, Item> orderedItems = new TreeMap<Integer, Item>();

	private Item[] giveUsOrder() {
		int i = 0;
		String Ids = "0123456789";
		
		System.out.println("Type how many products you want to add:");
		int arrayLength = getNumber();
		Item[] addedItems = new Item[arrayLength];
		
		System.out.println("Type the Id number of product you want to add:");
		
		while(i < arrayLength) {
			Integer orderInt = getNumber();
			String orderString = String.valueOf(orderInt);
			if (Ids.contains(orderString)) {
				addedItems[i] = new Item(String.valueOf(Products.values()[orderInt]), Products.values()[orderInt].getPrice()); 			
				if (i < (arrayLength - 1)) {
					System.out.println("Done, type ID number for the another one:");
				}
				i++;
			}
			else {
				System.out.println("You can only type digits (0-9).");
			}
		}
		
		return addedItems; 
	}	

	private void addManyItemsToBasket(Basket basket, Item[] item) {
		System.out.println("To your basket has been added: ");
		for(int i = 0; i < item.length; i++) {
			basket.orderedItems.put(i, item[i]);
			System.out.println(item[i].name + " ");
		}
	}
	
	private void showBasketValue(Basket basket) {
		System.out.println("\n The basket size is: " + basket.orderedItems.size());
		System.out.print(" In your basket you have: \n");

		int sizeOfBasket = basket.orderedItems.size();
		double totalPrice = 0;

		for(int i = 0; i < sizeOfBasket; i++) {
			if(basket.orderedItems.containsKey(i)) {
				System.out.println(i + " " + basket.orderedItems.get(i).name + " ");
				totalPrice = totalPrice + basket.orderedItems.get(i).price;
			}
			else {
				i--;		
			}
		}
		System.out.println("\n The total price of your basket is " 
				+ String.format("%.2f", totalPrice) + " USD. \n");	
	}

	private void allowToRemoveProducts(Basket basket) {
		System.out.println("How many products you want to remove from your basket (if none, type 0):");
		
		int sizeOfBasket = basket.orderedItems.size();
		int i = 0;
		int arrayLength = getNumber();
		boolean tooManyProductsToRemove = true;
		while(tooManyProductsToRemove) {
			if (arrayLength > sizeOfBasket) {
				System.out.println("You do not have so many products in your basket,"
						+ " please type the correct number.");
				arrayLength = getNumber();
			}
			if (arrayLength <= sizeOfBasket) {
				tooManyProductsToRemove = false;
			}
		}
		
		
		if (arrayLength == 0) {
			return;
		}
		
		Integer[] objectsForRemoving = new Integer[arrayLength];
		
		System.out.println("Type the list position number of product you want to remove:");
		
		while(i < arrayLength) {
			Integer objectForRemoving = getNumber();
			
			if (objectForRemoving > sizeOfBasket) {
				System.out.println("You do not have so many products in your basket,"
						+ " please type the correct number.");
				continue;
			}
			objectsForRemoving[i] = objectForRemoving;
			
			if (i < (arrayLength - 1)) {
				System.out.println("Done, type another one:");
			}
			i++;
		}
		
		removeItemsFromBasket(basket, objectsForRemoving);
	}
	
	private void removeItemsFromBasket(Basket basket, Integer[] key) {
		for(int i = 0; i < key.length; i++) {
			System.out.println("From your basket has been removed: " + basket.orderedItems.get(key[i]).name + " ");			
			basket.orderedItems.remove(key[i]);
		}
	}
	

	public static void main(String[] args) { 

		showProductsOnShelf(); 

		Basket basket = new Basket(); 
		Item[] addedItems = basket.giveUsOrder();
		
		basket.addManyItemsToBasket(basket, addedItems);
		basket.showBasketValue(basket);
		basket.allowToRemoveProducts(basket);
		basket.showBasketValue(basket);
	}
}