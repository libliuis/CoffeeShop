package coffeeshop;

public enum Sauce {
	Mocha, Caramel;
	
	public String toString() {
		switch (this) {
		case Mocha:   return "Ä¦¿¨ÁÜ½´";
		case Caramel: return "½¹ÌÇÁÜ½¬";
		default:     return "Unspecified";
		}
	}
}
