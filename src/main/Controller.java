package main;
import java.math.BigDecimal;

public class Controller {

	private Product product;
	
	public Controller(Product product){
		this.product = product;
		if(Main.food.size() < 4){
			addDefaultProduct();
		}
	}
	
	private void addDefaultProduct(){
		Main.food.put("Potato", new Calculate(new BigDecimal("4.32"), 75));
		Main.food.put("Bread", new Calculate(new BigDecimal("8.40"), 200));
		Main.food.put("Tea", new Calculate(new BigDecimal("34.09"), 50));
		
		for(String names: Main.food.keySet()){
			System.out.println( "Name of product: "+names+ 
								", price: "+	Main.food.get(names).getPrice()+
								", quantity: "+ Main.food.get(names).getQuantity()+ 
								", sum = "+		Main.food.get(names).getCalculatedData());

		}
	}

	public void action(String name, BigDecimal price, int quantity){
		
		if(name.equals("")){
			System.out.println("Incorrect symbol: " + name +" set default - noname");
			name = "noname";
		}
		product.setProduct(name, new Calculate(price, quantity));
		product.getProduct();
		
	}	
}
