package containmentex.onetomany;



public class Item {

	private int itemId;
	private String itemName;
	private double itemPrice;
	private int itemCategory;
	private int quantity;
	
	
	

	public Item(int itemId, String itemName, double itemPrice, int itemCategory, int quantity) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemCategory = itemCategory;
		this.quantity = quantity;
	}


	public int getItemId() {
		return itemId;
	}


	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public double getItemPrice() {
		return itemPrice;
	}


	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	


	public int getItemCategory() {
		return itemCategory;
	}


	public void setItemCategory(int itemCategory) {
		this.itemCategory = itemCategory;
	}
	
	


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public int hashCode() {
		return this.itemCategory;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
	//	Item other = (Item) obj;
	//	return itemId == other.itemId;
		
		return this.itemId == ((Item)obj).itemId;
	}


	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemCategory="
				+ itemCategory + ", quantity=" + quantity + "]";
	}


		
	
	
	
}
