package coffeeshop;

public enum Syrup {
	Original, Vanilla, Caramel;
	
	public String toString() {
		switch (this) {
		case Original: return "ԭζ�ǽ�";
		case Vanilla:  return "����ǽ�";
		case Caramel:  return "�����ǽ�";
		default:     return "Unspecified";
		}
	}
}
