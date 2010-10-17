import java.util.*;

public class configuration{
	
	private HashMap<product,Integer> configurations;
	private HashMap<product,Integer> configurationsCheck;
	private int amount, count = 0;
	private boolean stock = true;
	private product p1;
	private product p2;
	
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
		    p1 = p;
		    amount = configurations.get(p);		
		    
		    for(int a=0; a<amount; a++) this.p1.decreaseStock();  
		    
		    if(!p1.inStock()){
		    	System.out.println("Die Konfiguration " + name + " konnte nicht zusammengestellt werden - fehlende Komponenten");
		    	break;
		    }
		}

	}

	private boolean checkConfig(){
		for(product p : configurationsCheck.keySet()){
			    p2 = p;
			    amount = configurationsCheck.get(p);

			    if(p.getStock()<amount){
			    	stock = false;
			    	break;
			    }else{
			    	for(int a=0; a<amount; a++) this.p2.decreaseStock();  
			    }
		}
		if(stock == false)return false;
		else return true;
	}
	
	
	private int countConfig(){
		configurationsCheck  = (HashMap)configurations.clone();

		while(this.checkConfig()) count++;
		
		return count;
	}
	
	
	public String toString(){
		this.countConfig();
		return "Die Konfiguration " + name + " kann " + count + " Mal gebaut werden";
	}
}
