package coffeeshop;

public enum Syrup {
	Original, Vanilla, Caramel;
	
	public String toString() {
		switch (this) {
		case Original: return "‘≠Œ∂Ã«Ω¨";
		case Vanilla:  return "œ„≤›Ã«Ω¨";
		case Caramel:  return "ΩπÃ«Ã«Ω¨";
		default:     return "Unspecified";
		}
	}
}
