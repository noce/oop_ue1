import java.util.*;

public class configuration{
	
	private HashMap<product,Integer> configurations;
	private int amount, count = 0;
	private boolean stock = true;
	private product product;
	private String name;
	private int size = 0;
	
	
	public configuration(String name){
		this.name = name;
		configurations = new HashMap<product,Integer>();
	}
	
	public void addProduct (product p, int a){//product p = key, a = amount
		configurations.put(p, a);	
	}
	
	public void buildConfig(){
			for(product p : configurations.keySet()){
		    product = p;
		    amount = configurations.get(p);		
		    
		    for(int a=0; a<amount; a++) this.product.decreaseStock();  
		    
		    if(!product.inStock()){
		    	System.out.println("Konfiguration konnte nicht zusammengestellt werden - fehlende Komponenten");
		    	break;
		    }
		}

	}

	private boolean checkConfig(){
		while(configurations.size()<= size){
			for(product p : configurations.keySet()){
				    product = p;
				    amount = configurations.get(p);		
	
				    if(p.getStock()<amount){
				    	System.out.println("CheckConfig -false");
				    	stock = false;
				    	break;
				    }
				    System.out.println("CheckConfig -true");
				    size ++;
			}
		}
		if(stock == false)return false;
		else return true;
	}
	
	
	private int countConfig(){
		while(this.checkConfig()) count++;
		System.out.println(count);
		return count;
	}
	
	
	public String toString(){
		this.countConfig();
		return "Die Konfiguration " + name + " kann " + count + " Mal gebaut werden";
	}

}
