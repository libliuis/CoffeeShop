package coffeeshop;

public class Coffee {
	private String serialNumber;
	private double price;
	private CoffeeSpec spec;
	
	public Coffee(String serialNumber, CoffeeSpec spec) {
		this.serialNumber = serialNumber;
		this.spec = spec;
		this.price = spec.calcPrice();
	}
	
	public String getserialNumber() {
		return serialNumber;
	}
	
	public double getPrice() {
		return price;
	}
	
	public CoffeeSpec getSpec() {
		return spec;
	}
}
