package ex11;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Basket {

	Map<Integer, Item> orderedItems = new TreeMap<Integer, Item>();

	private void addManyItemsToBasket(Basket basket, Item[] item) {
		for(int i = 0; i < item.length; i++) {
			basket.orderedItems.put(i, item[i]);
			System.out.println("To your basket has been added: " + item[i].name);
		}
	}

	private void removeManyItemsFromBasket(Basket basket, Integer[] key) {
		for(int i = 0; i < key.length; i++) {
			System.out.println("From your basket has been removed: " + basket.orderedItems.get(key[i]).name + " ");			
			basket.orderedItems.remove(key[i]);
		}
	}

	private Item[] giveUsOrder() {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		String Ids = "0123456789";
		
		System.out.println("Type how many products you want to add:");
		int arrayLength = scan.nextInt();
		Item[] addedItems = new Item[arrayLength];
		
		System.out.println("Type the Id number of product you want to add,"
				+ " or type \"X\" for closing the order.");
		
		while(true) {
			String order = scan.nextLine();
	
			if (order.equalsIgnoreCase("x")) {
				return addedItems; 
			} else if (Ids.contains(order)) {
				System.out.println("ID: " + Ids + " order: " + order + " Ids.contains(order): " + Ids.contains(order));
				
				addedItems[i] = new Item(String.valueOf(Products.values()), Products.values()[i].getPrice()); 
				i++; 
				System.out.println("Done, type another one or type \"X\" for closing the order.");
			} else {
				System.out.println("Please type ID number of product (eg. 2 to get BUTTER), "
						+ "or type \"X\" for closing the order");
			}
		}
	}	

	private void showTheTotalBasketValue(Basket basket) {
		System.out.println("\n The basket size is: " + basket.orderedItems.size());
		System.out.print("In your basket you have: ");

		int sizeOfBasket = basket.orderedItems.size();
		double totalPrice = 0;

		for(int i = 0; i < sizeOfBasket; i++) {
			if(basket.orderedItems.containsKey(i)) {
				System.out.print(basket.orderedItems.get(i).name + " ");
				totalPrice = totalPrice + basket.orderedItems.get(i).price;
			}
			else {
				sizeOfBasket++;		
			}
		}
		System.out.println("\n The total price of your basket is " + totalPrice + " USD. \n");
	}

	public static void main(String[] args) { 

		System.out.println("Please chose the product you want to add to the basket.");

		for(int i = 0; i< Products.values().length; i++) {
			System.out.print(" ID:" 
					+ Products.values()[i].ordinal()
					+ "  " + String.format("%.2f", Products.values()[i].getPrice()) + " USD  " 
					+ Products.values()[i] + "\n");
		}



		
		  Basket basket1 = new Basket(); 
//		  Item item1 = new Item("milk", 2.20);
//		  Item item2 = new Item("sugar", 3.99); 
//		  Item item3 = new Item("newspaper", 9.99); 
//		  Item item4 = new Item("gum", 0.30);
		  
		  Item[] addedItems = basket1.giveUsOrder();
//		  removedItemsKeys= {0, 3};
		  
		  basket1.addManyItemsToBasket(basket1, addedItems);
		  basket1.showTheTotalBasketValue(basket1);
//		  basket1.removeManyItemsFromBasket(basket1, removedItemsKeys);
		  basket1.showTheTotalBasketValue(basket1);


		
//		  Basket basket1 = new Basket(); Item item1 = new Item("milk", 2.20);
//		  Item item2 = new Item("sugar", 3.99); Item item3 = new
//		  Item("newspaper", 9.99); Item item4 = new Item("gum", 0.30);
//		  
//		  Item[] addedItems= {item1, item2, item3, item4}; Integer[]
//		  removedItemsKeys= {0, 3};
//		  
//		  basket1.addManyItemsToBasket(basket1, addedItems);
//		  basket1.showTheTotalBasketValue(basket1);
//		  basket1.removeManyItemsFromBasket(basket1, removedItemsKeys);
//		  basket1.showTheTotalBasketValue(basket1);
		
	}
}