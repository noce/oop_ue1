import java.util.*;

public class product{
		private String name;
		private String description;
		private int stock = 1;
		
		
		public product(String name, String description){
			this.name = name;
			this.description = description;
		}
		
		public product(String name, String description, int s){
			this.name = name;
			this.description = description;
			this.stock = s;
		}
		
		
		public void increaseStock(){
			this.stock++;
		}
		
		public void decreaseStock(){
			if(stock>=0){
				stock--;
			}else{
				System.out.println("Produkt " + name+ " out of Stock");
			}
		}
		
		public int getStock(){
			return stock;
		}
		
		public boolean inStock(){
			if(stock>0)return true;
			else return false;
		}
		
		public String toString(){
			return stock + "x" + name;
		}
}
