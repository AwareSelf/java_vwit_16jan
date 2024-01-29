package containmentex.onetomany;

import java.time.LocalDateTime;
import java.util.*;

public class ShoppingApp {

	public static void main(String[] args) {
	
	//Item(int itemId, String itemName, double itemPrice, int itemCategory, int quantity)	
		Item it1 = new Item(1,"Tshirt",1000,1,2);
		Item it2 = new Item(3,"Pants",2000,1,2);
		Item it3 = new Item(2,"Tie",900,2,2);
		Item it4 = new Item(6,"Blazer",5000,2,1);
		Item it5 = new Item(4,"Raincoat",700,3,1);
		Item it6 = new Item(5,"Umbrella",500,3,1);
		
		Set<Item> st = new HashSet<Item>(); //st =2000
		st.add(it1);
		st.add(it2);
		st.add(it3);
		st.add(it4);
		System.out.println(st);
		System.out.println("st size:"+st.size());
		
		
		//int orderId, LocalDateTime datetime, Set<Item> items
		Order myOrder = new Order(1,LocalDateTime.now(),st);
		System.out.println(myOrder);
		System.out.println("myorder size:"+myOrder.getItems().size());
		System.out.println(myOrder.getItems());
		
		st.remove( new Item(1,"Tshirt",1000,1,2)); //2000 - set - 1 item remove
		System.out.println(st);
		System.out.println("st size:"+st.size());
		
		System.out.println("Items details in MyOrder:");
		System.out.println("myorder size:"+myOrder.getItems().size());
		System.out.println(myOrder.getItems());
	
		//change myOrder and remove  item of Tshirt
		myOrder.getItems().remove( new Item(1,"Tshirt",1000,1,2));
		System.out.println("Items details in MyOrder:");
		System.out.println("myorder size:"+myOrder.getItems().size());
		System.out.println(myOrder.getItems());
		
		
		Order myOrder1 = new Order(2,LocalDateTime.now(),new HashSet<Item>());
		myOrder1.getItems().add(it5);
		myOrder1.getItems().add(it6);
		System.out.println(myOrder1);
		System.out.println(myOrder1.getItems());
		System.out.println(myOrder1.getItems().size());
	
		
		
	}

}
