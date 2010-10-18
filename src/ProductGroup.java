import java.util.HashSet;
import java.util.Set;

public class ProductGroup{

	protected Set<Product> products;
	protected Set<ProductGroup> productgroup = new HashSet<ProductGroup>();
	private String name;	
	
	public ProductGroup(String name){
		this.name = name;
		products = new HashSet<Product>();
	}
	
	public void addProduct(Product product){
		products.add(product);
	}
	
	public void addToGroup(ProductGroup grp){
		productgroup.add(grp);
	}
	
	public String getName(){
		return name;
	}
	
	protected Set<Product> getProductsFromTree(Set<Product> acc) {
		acc.addAll(products);
//		for (Product p : products) {
//			acc.add(p);
//		}
		for (ProductGroup pg : productgroup) {
			pg.getProductsFromTree(acc);
		}
		return acc;
	}
	
	public String toString(){
		StringBuilder buf = new StringBuilder();
		Set<Product> pset = getProductsFromTree(new HashSet<Product>());
		buf.append("Die Produktgruppe ");
		buf.append(name);
		buf.append(" beinhaltet:\n");
		for (Product p : pset) {
			buf.append(p.toString());
			buf.append('\n');
		}
		return buf.toString();
	}
}
