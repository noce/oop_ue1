
public class Product{
		private String name;
		private String description;
		private int stock = 1;
		
		
		public Product(String name, String description){
			this.name = name;
			this.description = description;
		}
		
		public Product(String name, String description, int stock){
			this.name = name;
			this.description = description;
			this.stock = stock;
		}
		
		public void increaseStock(){
			increaseStock(1);
		}
		
		public void increaseStock(int cnt){
			stock += cnt;
		}
				
		public void decreaseStock(){
			decreaseStock(1);
		}
		
		public void decreaseStock(int cnt) {
			if(stock - cnt > 0){
				stock -= cnt;
			}else{
				System.out.println(
						String.format("Nur noch %d Stueck von Produkt %s vorhanden", stock, name));
			}
		}
		
		public int getStock(){
			return stock;
		}
		
		public boolean inStock(){
			return inStock(1);
		}

		/*
		 *returns a boolean that says if a certain number of the product is in stock
		 */
		public boolean inStock(int cnt){
			return stock >= cnt;
		}
		
		public String toString(){
			return stock + "x" + name;
		}
}
