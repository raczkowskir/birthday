package ex11;
import java.util.Map;
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

	private void showTheTotalBasketValue(Basket basket) {
		System.out.println("The basket size is: " + basket.orderedItems.size());
		System.out.print("In your basket you have: ");
		
		int sizeOfBasket = basket.orderedItems.size();
		
		for(int i = 0; i < sizeOfBasket; i++) {
			if(basket.orderedItems.containsKey(i)) {
				System.out.print(basket.orderedItems.get(i).name + " ");
			}
			else {
				sizeOfBasket++;		
			}
		}
		System.out.print("\n");
	}
	
	public static void main(String[] args) {
		Basket basket1 = new Basket();
		Item item1 = new Item("milk", 2.20);
		Item item2 = new Item("sugar", 3.99);
		Item item3 = new Item("newspaper", 9.99);
		Item item4 = new Item("gum", 0.30);
		 
		Item[] addedItems= {item1, item2, item3, item4}; 	
		Integer[] removedItemsKeys= {0, 3};
		
		basket1.addManyItemsToBasket(basket1, addedItems);
		basket1.showTheTotalBasketValue(basket1); 
		basket1.removeManyItemsFromBasket(basket1, removedItemsKeys);
		basket1.showTheTotalBasketValue(basket1); 
		
		
	}

}


//addItemToBasket(basket1, item3);
//basket1.addItemToBasket(basket1, item4);


//////////////////
//private static void addItemToBasket(Basket basket, Item item) {
//basket.orderedItems.put(i, item);
//System.out.println(item.name + " has been added to the basket.");
//}
//
//private void removeItemFromBasket(Basket basket, Item item) {
//basket.orderedItems.remove(item.name, item.price);
//System.out.println(item.name + " has been removed from the basket.");
//}	
///////////////////	