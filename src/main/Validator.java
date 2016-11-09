package main;

public class Validator {
	
	public static char[] validate(String price){
		
		String num = "0";
		
		for(Character c : price.toCharArray()){
			if(c.isDigit(c) || c.equals('.')){
				num = num + c;
			}else{
				System.out.println("Incorrect symbol: " + c +" set default - 0");
				return "0".toCharArray() ;
			}
		}
	
		return num.toCharArray();
	}
	
	public static int intValidate(String quantity){
		
		String num = "0";
		
		for(Character c : quantity.toCharArray()){
			if(c.isDigit(c)){
				num = num + c;
			}else{
				System.out.println("Incorrect symbol: "+ c +" set default - 0");
				return 0;
			}
		}
		 
		 return new Integer(num);
		
	}

}
