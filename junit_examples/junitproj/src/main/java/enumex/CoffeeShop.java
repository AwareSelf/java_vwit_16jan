package enumex;


public class CoffeeShop { 
  public static void main(String[] args) { 
   CupPrice coffee = CupPrice.LARGE;
	  
	  
    System.out.println("coffe price for:"+coffee+" is "+coffee.getPrice()); 
    
   
    
    coffee = CupPrice.SMALL;
    System.out.println("coffe price for:"+coffee+" is "+coffee.getPrice()); 
    
    
  } 
}
