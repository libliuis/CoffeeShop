package coffeeshop;

public enum Sauce {
	Mocha, Caramel;
	
	public String toString() {
		switch (this) {
		case Mocha:   return "Ħ���ܽ�";
		case Caramel: return "�����ܽ�";
		default:     return "Unspecified";
		}
	}
}
