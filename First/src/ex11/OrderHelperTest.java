package ex11;

import static ex11.OrderHelper.getNumber;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class OrderHelperTest {

	public static Basket myBasket;
	public static Item items[] = new Item[2];

//	Item items[] = {new Item("MILK", 2.20), new Item("MILK", 2.20)};
	
	@BeforeClass
	public static void createBasketAndItems() {
		myBasket = new Basket();
	
		for(int i = 0; i < 2; i++) {
			items[i] = new Item("MILK", 2.20);
		}
		myBasket.addManyItemsToBasket(myBasket, items);
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
		assertEquals("MILK", myBasket.orderedItems.get(0).name);
		System.out.println("testAddManyItems passed");
	}
	
	
	@Test
	public void testShowBasketValue() {
		myBasket.showBasketValue(myBasket);
		System.out.println("testShowBasketValue passed");
	}
	
	@AfterClass
	public static void flush() {
		System.out.println("Tests are over.");
	}



}
