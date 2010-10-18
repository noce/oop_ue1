package at.striketeam.oop.ue1;
import java.util.HashMap;
import java.util.Map.Entry;

public class Configuration {	
	private HashMap<Product,Integer> configurations;
	private String name;	
	
	public Configuration(String name){
		this.name = name;
		configurations = new HashMap<Product,Integer>();
	}
	
	public void addProduct (Product p, int a){
		configurations.put(p, a);	
	}
	
	public void buildConfig(){
		if (!checkConfig()) {
			System.out.println("Die Konfiguration " + name + " " +
					"konnte nicht zusammengestellt werden - " +
					"fehlende Komponenten" + "\n");
			return;
		}
		for(Entry<Product, Integer> entry : configurations.entrySet()){
			Product p = entry.getKey();
			int amount = entry.getValue();		
			p.decreaseStock(amount);
		}
	}
	
	private boolean checkConfig() {
		return countConfig() > 0;
	}	
	
	private int countConfig(){
		int count = Integer.MAX_VALUE;
		for(Entry<Product, Integer> entry : configurations.entrySet()){
			Product p = entry.getKey();
			int amount = entry.getValue();
			count = Math.min(count, p.getStock() / amount);
		}
		return count;
	}
	
	
	public String toString(){
		int count = countConfig();
		return "Die Konfiguration " + name + " kann " + count + " Mal gebaut werden";
	}
}
