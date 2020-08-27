package coffeeshop;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CoffeeSpec {
	private Map<String, Addition> additions = new HashMap<String, Addition>();
	private Map<String, Multiplier> multipliers = new HashMap<String, Multiplier>();
	
	public CoffeeSpec() {
		
	}
	
	public CoffeeSpec(Map<String, Addition> additions, Map<String, Multiplier> multipliers) {
			this.additions = additions;
			this.multipliers = multipliers;
	}
	
	public void addAddition(String name, Addition addition) {
		additions.put(name, addition);
	}
	
	public void addMultiplier(String name, Multiplier multiplier) {
		multipliers.put(name, multiplier);
	}
	
	public Map<String, Addition> getAddition(){
		return additions;
	}
	
	public Map<String, Multiplier> getMultipliers(){
		return multipliers;
	}
	
	public double calcPrice() {
		double p = 0;
		Iterator<String> ite;
		//计算加法类
		System.out.println("名称                 "+"单价       "+ "数量     " + " 总价");
		for(ite = additions.keySet().iterator();ite.hasNext();) {
			String adds = (String)ite.next();
			p+=additions.get(adds).getPrice();
		}
		System.out.println("名称                 "+ " 倍率");
		//计算乘法类
		for(ite = multipliers.keySet().iterator();ite.hasNext();) {
			String muls = (String)ite.next();
			p*= multipliers.get(muls).getMultiFactor();
		}
		return p;
	}
}
