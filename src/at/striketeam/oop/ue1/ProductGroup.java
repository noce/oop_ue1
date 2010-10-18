package at.striketeam.oop.ue1;
import java.util.*;

public class ProductGroup{

	private ArrayList<Product> products;
	private ArrayList<ProductGroup> productgroup;
	private String name, out;
	private Iterator<Product> i;
	private Iterator<ProductGroup> g;
	
	
	public ProductGroup(String name){
		this.name = name;
		products = new ArrayList<Product>();
	}
	
	public void addProduct(Product product){
		products.add(product);
	}
	
	public void addToGroup(ProductGroup grp){
		productgroup = new ArrayList<ProductGroup>();
		productgroup.add(grp);
	}
	
	public String getName(){
		return name;
	}
	
	public String toString(){
		i = products.iterator();

		if(productgroup!=null){
			g = productgroup.iterator();
			while(g.hasNext()){
				out = "Die Produktgruppe " + name +  " beinhaltet die Produktgruppe "
					+ g.next().getName() + "\n";
			}
		}
			out = out + "Die Produktgruppe " + name + " beinhaltet:";
			while(i.hasNext()) out = out + "\n" + i.next().toString();
		
		return out;
	}
}
