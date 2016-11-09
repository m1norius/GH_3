package main;

import java.math.BigDecimal;

public class Calculate {
	
	private BigDecimal price;
	private int quantity;
	
	public Calculate(BigDecimal price, int quantity){
		this.price = price;
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public BigDecimal getCalculatedData(){
		BigDecimal result = this.price.multiply(new BigDecimal(this.quantity)) ;
		return result;
	}
}
