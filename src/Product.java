public class Product{
		private String name;
		private String description;
		private int stock = 1;
		
		
		public Product(String name, String description){
			this.name = name;
			this.description = description;
		}
		
		public Product(String name, String description, int s){
			this.name = name;
			this.description = description;
			this.stock = s;
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
				System.out.println("Only " + stock + " pcs of Produkt " + name + " left. Too little for " + cnt);
			}			
		}
		
		public int getStock(){
			return stock;
		}
		
		public boolean inStock(){
			return inStock(1);
		}

		public boolean inStock(int cnt){
			return stock >= cnt;
		}
		
		public String toString(){
			return stock + "x" + name;
		}
}
