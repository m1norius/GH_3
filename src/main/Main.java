package main;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Scanner;

import kind_of_product.Food;

public class Main {
	
	public static HashMap<String, Calculate> food;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		food = new HashMap<>();
		Controller c = new Controller(new Food());
		
		while(true){
			
			c.action(new Scanner(System.in).nextLine(), 
					 new BigDecimal(Validator.validate(new Scanner(System.in).nextLine())), 
					 new Integer   (Validator.intValidate(new Scanner(System.in).nextLine())));
			
		}
	}
}

//Name
//Quantity
//Price