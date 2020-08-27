package coffeeshop;

public abstract class Addition {
	String type;
	double single_price;
	int number;
	
	public double getPrice() {
		double total = single_price*number;
		System.out.println(type+"            "+single_price+ "   " +number + "    " + total);
		return total;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
}
