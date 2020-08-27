package coffeeshop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class GenCoffeeBill {
	public static void main(String[] args) {
		CoffeeSpec CS = new CoffeeSpec();
		Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要的咖啡编号： 1.蓝山 2.卡布奇诺");
        int coffeeName = sc.nextInt();
        switch(coffeeName) {
        case 1: 
        	CS.addAddition("BlueMountain", new BlueMountainCoffeeAddition(1)); 
        	break;
        case 2: 
        	CS.addAddition("Cappuccino", new CappuccinoAddition(1));
        	break;
        default: 
        	break;
        }
        
        System.out.println("请输入想要的杯型： 1.中杯 2.大杯 3.超大杯");
        int bname = sc.nextInt();
        switch(bname) {
        case 1: 
        	CS.addMultiplier("MediumCup", new MediumCupMultiplier());
        	break;
        case 2: 
        	CS.addMultiplier("BigCup", new BigCupMultiplier());
        	break;
        case 3: 
        	CS.addMultiplier("VeryBigCup", new VeryBigCupMultiplier());
        	break;
        default: 
        	break;
        }
        
        System.out.println("请输入想要加入的牛奶编号：1.脱脂牛奶 2.豆奶 3.燕麦奶 4.不加牛奶");
        int ssc = sc.nextInt();
        switch(ssc) {
        case 1: 
        	CS.addAddition("Evaporated", new EvaporatedAddition(1)); 
        	break;
        case 2: 
        	CS.addAddition("Soymilk", new SoymilkAddition(1)); 
        	break;
        case 3: 
        	CS.addAddition("Oat", new OatAddition(1)); 
        	break;
        case 4: 
        	break;
        default: 
        	break;
        }
        
        while(true) {
        	System.out.println("停止加入糖浆请选择4");
        	System.out.println("请输入你想要加入的糖浆(每次输入一种)：1.原味糖浆 2.香草糖浆 3.焦糖糖浆 4.不加了");
        	int cn = sc.nextInt();
        	int cnn = 0;
        	if(cn!=4) {
        		System.out.println("请输入想要该糖浆的数量(泵)：");
        		cnn = sc.nextInt();
        	}
        	int flag = 0;
            switch(cn) {
            case 1: 
            	CS.addAddition("Original", new OriginalAddition(cnn));
            	break;
            case 2: 
            	CS.addAddition("Vanilla", new VanillaAddition(cnn));
            	break;
            case 3: 
            	CS.addAddition("Caramel", new CaramelAddition(cnn));
            	break;
            case 4: 
            	flag=1;
            	break;
            default: 
            	break;
            }
            if(flag==1)break;
        }
        
        
        System.out.println("请输入你想要的淋酱编号： 1.摩卡淋酱 2.焦糖淋酱");
        int pn = sc.nextInt();
        switch(pn) {
        case 1: 
        	CS.addAddition("Mocha", new MochaAddition(1));
        	break;
        case 2: 
        	CS.addAddition("CaramelSauce", new CaramelSauceAddition(1));
        	break;
        default: 
        	break;
        }
        
        System.out.println("您是否是VIP用户(8折)：1.是 2.不是");
        int vp = sc.nextInt();
        if(vp==1) {
        	CS.addMultiplier("VIP", new VIPMultiplier());
        }
		Coffee cf = new Coffee("0001", CS);
		System.out.println("你的咖啡需要支付金额为："+cf.getPrice());
	}
}
