import java.util.*;

public class productgroup{

	private ArrayList<product> products;
	private ArrayList<productgroup> productgroup;
	private String name, out;
	private Iterator<product> i;
	private Iterator<productgroup> g;
	
	
	public productgroup(String name){
		this.name = name;
		products = new ArrayList<product>();
	}
	
	public void addProduct(product product){
		products.add(product);
	}
	
	public void addToGroup(productgroup grp){
		productgroup = new ArrayList<productgroup>();
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
