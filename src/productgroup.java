import java.util.*;

public class productgroup{

	private ArrayList<product> products;
	private String name, out;
	private Iterator i;
	
	
	
	public productgroup(String name){
		this.name = name;
		products = new ArrayList<product>();
	}
	
	public void addProduct(product product){
		products.add(product);
	}
	public void addToGroup(productgroup grp){
		
	}
	
	public String toString(){
		i = products.iterator();
		out = "Die Produktgruppe " + name + " beinhaltet:" + "\t";
		while(i.hasNext()) out = out + "\n" + i.next().toString();
		return out;
	}
}
