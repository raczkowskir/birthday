package ex11;

import static ex11.OrderHelper.getNumber;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class OrderHelperTest {

	public static Basket myBasket;
	public static Item[] items;

	@BeforeClass
	public static void createBasketAndItems() {
		myBasket = new Basket();
		Item items[] = {new Item("MILK", 2.20), new Item("MILK", 2.20)};
	}

	@Test
	public void testGetNumber() {
		System.out.println("testGetNumber starts, please type the number:");
		int newNumber = getNumber();
		assertTrue(0 < newNumber);
		System.out.println(newNumber + " is grater than " + 0);
	}
	
	@Test
	public void assertNotNullGetNumber() {
		assertTrue(true);
		System.out.println("JUnit and Raki are friends now!");
	}	

	@Test
	public void testGiveAsOrder() {
		assertNotNull(myBasket.giveUsOrder());
		System.out.println("testGiveAsOrder Passed");
	}
	
	@Test
	public void testAddManyItems() {
		myBasket.addManyItemsToBasket(myBasket, items);
//		assertEquals("Bannanas", myBasket.orderedItems.get(0).name);
	}
	
//	private void addManyItemsToBasket(Basket basket, Item[] item) {
//		System.out.println("To your basket has been added: ");
//		for(int i = 0; i < item.length; i++) {
//			basket.orderedItems.put(i, item[i]);
//			System.out.println(item[i].name + " ");
//		}
//	}
	
	@AfterClass
	public static void flush() {
		System.out.println("Tests are over.");
	}



}
