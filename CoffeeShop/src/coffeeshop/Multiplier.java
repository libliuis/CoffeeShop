package coffeeshop;

public abstract class Multiplier {
	String type;
	double multiFactor;
	
	public double getMultiFactor() {
		System.out.println(type+"                "+ multiFactor);
		return multiFactor;
	}
	
	public void setMultiFactor(double multiFactor) {
		this.multiFactor = multiFactor;
	}
}
