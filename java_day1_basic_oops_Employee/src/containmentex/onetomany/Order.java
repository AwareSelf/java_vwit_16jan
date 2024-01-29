package containmentex.onetomany;

import java.time.LocalDateTime;
import java.util.*;

public class Order {
	
	private int orderId;
	private LocalDateTime datetime;
	private Set<Item> items;
	
	
	public Order(int orderId, LocalDateTime datetime, Set<Item> items) {
		super();
		this.orderId = orderId;
		this.datetime = datetime;
		
		Set<Item> st = new HashSet<Item>(); //3000
		st.addAll(items);
		
		this.items = st; //clone/copy of local instance items 
	//	this.items = items;  //do not use same items object create a clone/copy 
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public LocalDateTime getDatetime() {
		return datetime;
	}


	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}


	public Set<Item> getItems() {
		return items;
	}


	public void setItems(Set<Item> items) {
		this.items = items;
	}


	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", datetime=" + datetime + ", items=" + items + "]";
	}
	
	
	
	
	

}
