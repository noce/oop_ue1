import java.io.File;
import java.util.*;
//git add .classpath .project Main.java

public class Main{
	public static void main(String args[]){
		product p1 = new product("Klohbürste","Modell: Ida >> seehr ergonomisch",4);
		product p2 = new product("Steckdose","Modell: Manfred. Auch nicht schlecht",10);
		
		productgroup haushalt = new productgroup("Haushalt");
		haushalt.addProduct(p1);
		haushalt.addProduct(p2);
		//haushalt.addProduct(p1);
		//System.out.println(haushalt.toString());
		
		configuration c1 = new configuration("Küche");
		c1.addProduct(p1, 1);
		c1.addProduct(p2, 5);
		
		//c1.buildConfig();
		System.out.println(c1.toString());
	}
}
