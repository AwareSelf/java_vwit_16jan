package enumex;


public enum CupPrice {
	  MINI(5),
	  SMALL(15),
	  BIG(25),
	  LARGE(35),
	  EXTRALARGE(45);
	  
	  // constructor
	  private CupPrice(final int price) {
	    this.price = price;
	  }

	  // internal state
	  private int price;

	  public int getPrice() {
	    return price;
	  }
	  
	
}
