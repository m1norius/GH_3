package kind_of_product;

import java.math.BigDecimal;
import java.util.Scanner;

import main.Calculate;
import main.Main;
import main.Product;

public class Food implements Product {
	
	private BigDecimal total;
	
	@Override
	public void getProduct() {
		
		total = new BigDecimal("0");

		for(String names: Main.food.keySet()){
			System.out.println(	"Name of product: " + names + 
								", price: "+	Main.food.get(names).getPrice() + 
								", quantity: "+ Main.food.get(names).getQuantity() + 
								", sum = "+		Main.food.get(names).getCalculatedData());
			
			total = total.add(Main.food.get(names).getCalculatedData());
		}
		System.out.println();
		System.out.println("Total: "+total);
	}

	@SuppressWarnings("resource")
	@Override
	public void setProduct(String name, Calculate calc) {

		for(String a: Main.food.keySet()){
			if(name.equalsIgnoreCase(a)){
				
				System.out.println("This product is arleady exist, enter ADD (-to add quantity and change price-) or DELETE (-to delete product-)");
				
				String add_or_del = new Scanner(System.in).nextLine();

				if(add_or_del.equalsIgnoreCase("add".trim())){
					
					BigDecimal new_price = calc.getPrice();
					int new_quantity = Main.food.get(a).getQuantity() + calc.getQuantity();
					calc = new Calculate(new_price, new_quantity);
					Main.food.put(a, calc);
					
				}else if(add_or_del.equalsIgnoreCase("delete".trim())){
					delProduct(name, calc);
				}
				return;
			}
		}
		System.out.println("Add " + name);
		Main.food.put(name, calc);
	}

	@Override
	public void delProduct(String name, Calculate calc) {
		Main.food.remove(name);
		System.out.println("Delete "+name);
	}
}
